package animals.herbivore;

import animals.interfaces.Runable;
import animals.interfaces.Voicable;

public class Monkey extends Herbivore implements Runable, Voicable {

    public Monkey(String name, int age) {
        super(name, age);
    }

    public void getVoice() {
        System.out.println("U-a-a");
    }

    @Override
    public void run() {
        System.out.println("Monkey's running");
    }

}
