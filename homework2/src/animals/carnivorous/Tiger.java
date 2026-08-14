package animals.carnivorous;

import animals.interfaces.Runable;
import animals.interfaces.Voicable;

public class Tiger extends Carnivorous implements Runable, Voicable {

    public Tiger(String name, int age) {
        super(name, age);
    }

    @Override
    public void run() {
        System.out.println("Tiger's running");
    }

    @Override
    public String voice() {
        return "Roarrrr";
    }

    @Override
    public String eat(Food food) {
    }
}