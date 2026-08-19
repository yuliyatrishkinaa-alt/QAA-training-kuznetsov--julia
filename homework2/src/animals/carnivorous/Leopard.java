package animals.carnivorous;

import animals.interfaces.Runable;
import animals.interfaces.Swimable;
import animals.interfaces.Voicable;

public class Leopard extends Carnivorous implements Runable, Voicable, Swimable {

    public Leopard (String name, int age) {
        super(name, age);
    }
    @Override
    public void run() {
        System.out.println("Leo's running");
    }

    @Override
    public String voice() {
        String voice = "Roarr";
        return voice;
    }

    @Override
    public void swim() {
        System.out.println("Leopard is swimming");
    }
}
