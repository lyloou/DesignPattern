package _CTemplate;

public abstract class AbstractFlow {

    // 模版方法，使用final来修饰，保证了由父类来控制逻辑
    public final void go() {
        init();
        first();
        second();
        third();
        if (isValid()) {
            validHook();
        }
        hook();
    }

    protected boolean isValid() {
        return false;
    }

    protected void validHook() {
        System.out.println("I'm valid.");
    }

    // 钩子方法
    protected void hook() {
    }

    // 抽象方法
    protected abstract void init();

    protected abstract void first();

    protected abstract void second();

    // 具体方法
    protected void third() {
        System.out.println("我是有内容的");
    }
}
