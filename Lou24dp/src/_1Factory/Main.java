package _1Factory;

public class Main {

	public static void main(String[] args) {
		ShapeFactory sf = new ShapeFactory();
//		Shape shape = sf.getShape("circle");
		Shape shape = sf.getShape("Rectangle");
		shape.draw("shape===");
	}

}
