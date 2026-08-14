package animals.carnivorous;

import animals.Animals;

public abstract class Carnivorous extends Animals {

    public Carnivorous(String name, int age) {
        super(name, age);
    }

    public abstract String eat(String food);
}
