package animals.carnivorous;

import animals.interfaces.Swimable;
import animals.interfaces.Voicable;
import food.Food;

public class Crocodile extends Carnivorous implements Swimable, Voicable, Runnable {

    public Crocodile (String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Croco's swimming");
    }

    public void run(){
        System.out.println("Croco's running");
    }

    public String voice() {
        String voice = "R-r-r-r";
        return voice;
    }
}
