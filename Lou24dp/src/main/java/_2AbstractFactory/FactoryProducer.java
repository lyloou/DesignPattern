package _2AbstractFactory;

public class FactoryProducer {
	public static AbstractFactory getFactory(String str){
		if(str.equalsIgnoreCase("ShapeFactory")){
			return new ShapeFactory();
		}
		
		if(str.equalsIgnoreCase("ColorFactory")){
			return new ColorFactory();
		}
		return null;
	}
}
