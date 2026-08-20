package animals.herbivore;

import animals.Animals;
import food.Food;
import food.Grass;
import food.Meat;

public abstract class Herbivore extends Animals {

    public Herbivore(String name, int age) {
        super(name, age);
    }

    public void eat(Food food){
        int fullSatiety = getSatiety() + food.getFoodSatiety();
        if (food instanceof Grass) {
            System.out.println("Animal's eating" + ", " + "satiety = " + fullSatiety);
        } else {
            System.out.println("The food is wrong for this animal");
        }
    }
}
