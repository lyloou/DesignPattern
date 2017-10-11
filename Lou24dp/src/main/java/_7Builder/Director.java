package _7Builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public Car createCar(String wheel, String engine, String shell) {
        return builder
                .buildEngine(engine)
                .buildShell(shell)
                .buildWheel(wheel)
                .create();
    }
}
