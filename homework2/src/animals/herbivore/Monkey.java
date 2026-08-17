package animals.herbivore;

import animals.interfaces.Runable;
import animals.interfaces.Voicable;

import java.sql.SQLOutput;

public class Monkey extends Herbivore implements Runable, Voicable {

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("Monkey's running");
    }

    @Override
    public String voice() {
        String voice = "U-a-a";
        return voice;
    }

}
