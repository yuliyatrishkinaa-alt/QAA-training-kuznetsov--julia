package animals.carnivorous;

import animals.interfaces.Swimable;
import food.Food;

public class Crocodile extends Carnivorous implements Swimable {

    public Crocodile (String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Croco's swimming");
    }

    @Override
    public String eat(Food food) {
    return food;
    }
}
