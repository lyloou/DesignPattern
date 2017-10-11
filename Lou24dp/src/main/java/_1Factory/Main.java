package _1Factory;

public class Main {

	public static void main(String[] args) {

		// 简单工厂模式
		SimpleFactory sf = new SimpleFactory();
		Shape shape = sf.getShape("circle");
		shape.draw("简单的圆形");
		Shape shape2 = sf.getShape("Rectangle");
		shape2.draw("简单的方形");


		// 工厂方法模式
		AbsFactory factory = new Concrete1Factory();
		Circle circle = factory.createShape(Circle.class);
		circle.draw("一个圆形");
		Square square = factory.createShape(Square.class);
		square.draw("一个方形");

		AbsFactory factory2 = new Concrete2Factory();
		Circle circle2 = factory2.createShape(Circle.class);
		circle2.draw("圆形2");
		Square square2 = factory2.createShape(Square.class);
		square2.draw("方形2");
	}

}
