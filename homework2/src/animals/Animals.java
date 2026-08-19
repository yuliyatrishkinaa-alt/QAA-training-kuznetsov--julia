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

    public String getVoice() {
        return voice;
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
    public void eat(Food food){}
}
