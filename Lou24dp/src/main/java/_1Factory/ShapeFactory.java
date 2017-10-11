package _1Factory;

public class ShapeFactory {
	public Shape getShape(String str){
		if(str.equalsIgnoreCase("Circle"))
			return new Circle();
		if(str.equalsIgnoreCase("rectangle"))
			return new Rectangle();
		if(str.equalsIgnoreCase("Square"))
			return new Square();
		
		return null;
	}
}
