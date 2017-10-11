package _1Factory;

public  class Concrete1Factory extends AbsFactory {

    @Override
    public <T extends Shape> T createShape(Class<T> clz) {
        Shape shape = null;
        String name = clz.getName();
        try {
            shape = (Shape) Class.forName(name).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\n实例工厂1来干事了。。。。");
        return (T) shape;
    }
}
