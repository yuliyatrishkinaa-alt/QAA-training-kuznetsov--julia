package animals.carnivorous;

import animals.Animals;
import food.Food;
import food.Grass;
import food.Meat;

public abstract class Carnivorous extends Animals {
    public Carnivorous(String name, int age) {
        super(name, age);
    }

    public void eat(Food food){
        satiety += food.getFoodSatiety();
        if (food instanceof Meat) {
            System.out.println("Animal's eating" + ", " + "satiety = " + satiety);
        } else {
            System.out.println("The food is wrong for this animal");
        }
    }
}
