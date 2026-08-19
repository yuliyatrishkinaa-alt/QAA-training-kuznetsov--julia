package animals.carnivorous;

import animals.interfaces.Runable;
import animals.interfaces.Swimable;
import animals.interfaces.Voicable;

public class Leopard extends Carnivorous implements Runable, Swimable, Voicable {

    public Leopard (String name, int age) {
        super(name, age);
    }

    public String getVoice() {
        String voice = "Roar";
        return voice;
    }

    @Override
    public void run() {
        System.out.println("Leo's running");
    }

    @Override
    public void swim() {
        System.out.println("Leopard is swimming");
    }
}
