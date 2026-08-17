package animals;

import animals.carnivorous.Crocodile;
import food.Food;
import food.Grass;
import food.Meat;

public abstract class Animals {

    private String name;
    private int age;
    private int satiety;
    private String voice;

    public Animals (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String voice() {
        return voice;
    }

    public void eat(Food food){
        if (food instanceof Grass) {
            System.out.println("Animal's eating");
        } else {
            System.out.println("The food is wrong for this animal");
        }
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name - " + name +
                '}';
    }

    public void setSatiety(int satiety){
        this.satiety = satiety;
    }

    public int getSatiety(){
        return satiety;
    }
    public void fullSatiety(Food food){
        int fullSatiety = this.satiety + food.getFoodSatiety();
        System.out.println(fullSatiety);
    }
}
