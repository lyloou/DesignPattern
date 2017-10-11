package _8Decorator;

public abstract class Fighter extends Animal {
    private Animal animal;

    public Fighter(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void fight() {
        animal.fight();
    }
}
