// 常见单例实现方式；
package _3Singleton;

public class Main {
	public static void main(String[] args) {
		ISingleton so;

		System.out.println("============饿汉式================");
		so = Hungry.getInstance();
		System.out.println(so);
		so = Hungry.getInstance();
		System.out.println(so);

		System.out.println("\n============懒汉式================");
		so = Lazy.getInstance();
		System.out.println(so);
		so = Lazy.getInstance();
		System.out.println(so);

		System.out.println("\n============静态内部类================");
		so = StaticInner.getInstance();
		System.out.println(so);
		so = StaticInner.getInstance();
		System.out.println(so);

		System.out.println("\n============枚举================");
		Enum e = Enum.INSTANCE;
		System.out.println(e.hashCode());
		e = Enum.INSTANCE;
		System.out.println(e.hashCode());

		System.out.println("\n============双重校验锁================");
		so = DoubleCheck.getInstance();
		System.out.println(so);
		so = DoubleCheck.getInstance();
		System.out.println(so);

	}

} /* Output:
============饿汉式================
_3Singleton.Hungry@2a139a55
_3Singleton.Hungry@2a139a55

============懒汉式================
_3Singleton.Lazy@15db9742
_3Singleton.Lazy@15db9742

============静态内部类================
_3Singleton.StaticInner@6d06d69c
_3Singleton.StaticInner@6d06d69c

============枚举================
2018699554
2018699554

============双重校验锁================
_3Singleton.DoubleCheck@4e25154f
_3Singleton.DoubleCheck@4e25154f
*///~



interface ISingleton {

	static ISingleton getInstance() {
		return null;
	}
}

// 1.饿汉式
// - 类加载机制避免了多线程同步问题；
// - 在类装载的时候就实例化了，不能达到lazy loading的效果
// - 在某些场景下无法使用，例如实例的创建依赖于参数和配置文件。
class Hungry implements ISingleton {
	private static Hungry instance = new Hungry();

	private Hungry() {
	}

	public static Hungry getInstance() {
		return instance;
	}

}

// 2.懒汉式
// - 在第一次调用getInstance的时候才初始化instance
// - 效率低；
// - 线程安全，解决了多实例问题；（但是synchronized只有在第一次调用getInstance的时候才会有用，之后因为instance已经实例化了，就直接返回了。-->双重校验锁）
class Lazy implements ISingleton {
	private static Lazy instance;

	private Lazy() {
	}

	public static synchronized ISingleton getInstance() {
		if (instance == null) {
			instance = new Lazy();
		}
		return instance;
	}
}

// 3.静态内部类（推荐）
// - 通过内部类的方式实现延迟加载（懒汉式的）；
// - 区别于1的只要类被加载，就初始化了instance，这种方式只有在显示调用getInstance方法才初始化。
// - 同时读取实例的时候不会进行同步，没有性能缺陷；
class StaticInner implements ISingleton {

	private StaticInner() {
	}

	private static class Inner {
		private static final StaticInner INSTANCE = new StaticInner();
	}

	public static ISingleton getInstance() {
		return Inner.INSTANCE;
	}
}

// 4.枚举（推荐，1.5之后的新特性）
// - Effective Java 推荐的方式；
// - 线程安全的，避免多线程同步的问题；
// - 能防止反序列化；
enum Enum {
	INSTANCE;
	public void method() {
		System.out.println("method()");
	}
}


// 5.双重校验锁
// - instance==null时才进入锁机制；
// - 为什么两次校验 instance == null（一次在同步块外，一次在同步块内）？因为有可能多个线程一起进入if语句，如果不进行第二次判断就有可能产生多个实例
//   ,,,,,,第一次为了不必要的同步，第二次是在DoubleCheck等于 null 的情况下才创建实例。
// - 注意：instance = new DoubleCheck();是非原子操作的。
// - [如何正确地写出单例模式](http://wuchong.me/blog/2014/08/28/how-to-correctly-write-singleton-pattern/)
// - 对于volatile修饰的变量，jvm虚拟机只是保证从主内存加载到线程工作内存的值是最新的(http://www.cnblogs.com/aigongsi/archive/2012/04/01/2429166.html)
class DoubleCheck implements ISingleton {
	private static volatile ISingleton instance; // volatile，禁止指令重排序优化；

	private DoubleCheck() {
	}

	public static ISingleton getInstance() {
		if (instance == null) {
			synchronized (DoubleCheck.class) {
				if (instance == null) {
					instance = new DoubleCheck();
				}

			}
		}
		return instance;
	}
}

