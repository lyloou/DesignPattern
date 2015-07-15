package _3Singleton;

public class Main {
	public static void main(String[] args) {
		SingleObject so = SingleObject.getInstance();
		System.out.println(so);
		SingleObject so2 = SingleObject.getInstance();
		System.out.println(so2);
	}
}
