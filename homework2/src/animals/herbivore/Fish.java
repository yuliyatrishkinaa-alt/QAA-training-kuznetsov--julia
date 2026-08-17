package animals.herbivore;

import animals.interfaces.Swimable;
import food.Food;

public class Fish extends Herbivore implements Swimable {

    public Fish (String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Fish's swimming");
    }

}
