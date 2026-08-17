package animals.carnivorous;

import animals.interfaces.Runable;
import animals.interfaces.Voicable;

public class Duck extends Carnivorous implements Runable, Voicable {

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
}
