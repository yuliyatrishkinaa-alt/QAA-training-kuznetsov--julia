package animals.herbivore;

import animals.Animals;

public abstract class Herbivore extends Animals {

    public Herbivore(String name, int age) {
        super(name, age);
    }
    public abstract String eat(String food);
}
