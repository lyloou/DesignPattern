package _BStragety;

public class Context {
    public void setStrategy(GreetStrategy strategy) {
        this.strategy = strategy;
    }

    private GreetStrategy strategy;

    public Context(GreetStrategy strategy) {
        this.strategy = strategy;
    }

    public void greet() {
        strategy.greet();
    }
}
