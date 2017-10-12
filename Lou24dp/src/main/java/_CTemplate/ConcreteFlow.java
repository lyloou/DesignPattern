package _CTemplate;

public class ConcreteFlow extends AbstractFlow {
    @Override
    protected void init() {
        System.out.println("init");
    }

    @Override
    protected void first() {
        System.out.println("first");
    }

    @Override
    protected void second() {
        System.out.println("second");
    }

    @Override
    protected boolean isValid() {
        return true;
    }

    @Override
    protected void validHook() {
        System.out.println("rewrite validHook");
    }
}
