package animals.carnivorous;

import animals.interfaces.Swimable;
import animals.interfaces.Voicable;

public class Crocodile extends Carnivorous implements Swimable, Runnable, Voicable {

    public Crocodile(String name, int age) {
        super(name, age);
    }

    public String getVoice() {
        String voice = "R-r-r-r";
        return voice;
    }

    @Override
    public void swim() {
        System.out.println("Croco's swimming");
    }

    public void run() {
        System.out.println("Croco's running");
    }
}

