常见单例模式写法：
===============
- 饿汉式
- 懒汉式
- 静态内部类
- 枚举
- 双重校验锁


使用场景：
========
一般情况下使用饿汉式的，如果明确要求懒加载就采用静态内部类，如果禁止反序列化的采用枚举的方式。


参考资料：
========
- [java8新特性接口的默认方法和静态方法](http://www.zicheng.net/article/79.htm)

- [Java：单例模式的七种写法](http://www.blogjava.net/kenzhh/archive/2011/09/02/357824.html)

- [超详细：常用的设计模式汇总](http://www.jianshu.com/p/93bc5aa1f887)


- [如何正确地写出单例模式](http://wuchong.me/blog/2014/08/28/how-to-correctly-write-singleton-pattern/)

- [java中volatile关键字的含义](http://www.cnblogs.com/aigongsi/archive/2012/04/01/2429166.html)
