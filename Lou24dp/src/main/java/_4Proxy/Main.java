package _4Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {

		RealImage realImage = new RealImage("_filename.png");
		
		// 静态代理
		Image pi = new ProxyImage(realImage);
		pi.display();

		System.out.println();

		// 动态代理
		pi = (Image) Proxy.newProxyInstance(
						Image.class.getClassLoader(), // 类加载器，
						new Class[] { Image.class },  // 该代理实现的接口列表
						new DynamicProxyHandler(realImage) // InvocationHandler的一个实现（具体信息，参考源码）
					);
		pi.display();
	}

}/* Output:
静态代理-方法执行之前
display... _filename.png
静态代理-方法执行之前

动态代理-方法执行之前
display... _filename.png
动态代理-方法执行之后

*///~

interface Image {
	void display();
}

// 静态代理
class ProxyImage implements Image {

	Image realImage;

	ProxyImage(Image realImage) {
		this.realImage = realImage;
	}

	@Override
	public void display() {
		System.out.println("静态代理-方法执行之前");
		realImage.display();
		System.out.println("静态代理-方法执行之前");
	}

}

class RealImage implements Image {
	String filename;

	RealImage(String filename) {
		this.filename = filename;
	}

	@Override
	public void display() {
		System.out.println("display... " + this.filename);
	}
}

// 动态代理
class DynamicProxyHandler implements InvocationHandler {

	Object proxyed;

	public DynamicProxyHandler(Object proxyed) {
		this.proxyed = proxyed;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		System.out.println("动态代理-方法执行之前");
		Object result = method.invoke(proxyed, args);
		System.out.println("动态代理-方法执行之后");

		return result;
	}

}