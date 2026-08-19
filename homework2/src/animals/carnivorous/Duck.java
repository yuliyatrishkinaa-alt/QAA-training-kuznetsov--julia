package animals.carnivorous;

import animals.interfaces.Flyable;
import animals.interfaces.Runable;
import animals.interfaces.Swimable;
import animals.interfaces.Voicable;

public class Duck extends Carnivorous implements Runable, Voicable, Swimable, Flyable {

    public Duck (String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("Duck's running");
    }

    @Override
    public String voice() {
        String voice = "Kruaa";
        return voice;
    }

    @Override
    public void fly() {
        System.out.println("Duck's flying");
    }

    @Override
    public void swim() {
        System.out.println("Duck's swimming");
    }
}
