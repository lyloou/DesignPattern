package _7Builder;

public class BenzBuilder extends Builder {
    Car car = new Car();

    @Override
    public Builder buildWheel(String wheel) {
        car.setWheel(wheel);
        return this;
    }

    @Override
    public Builder buildEngine(String engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Builder buildShell(String shell) {
        car.setShell(shell);
        return this;
    }

    @Override
    public Car create() {
        return car;
    }
}
