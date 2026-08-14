package animals.herbivore;

import animals.interfaces.Runable;
import animals.interfaces.Voicable;

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
        return "U-a-a-u";
    }

    @Override
    public String eat(String food) {
    }
}
