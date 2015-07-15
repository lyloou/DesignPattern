package _3Singleton;

public class SingleObject {
	private static SingleObject so = new SingleObject();
	private SingleObject(){
		
	}
	
	public static SingleObject getInstance(){
		return so;
	}
	
	public String showMessage(){
		return "message";
	}
}
