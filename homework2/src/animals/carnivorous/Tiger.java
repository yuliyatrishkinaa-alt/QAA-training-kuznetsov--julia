package animals.carnivorous;

import animals.interfaces.Runable;
import animals.interfaces.Voicable;

public class Tiger extends Carnivorous implements Runable, Voicable {

    public Tiger(String name, int age) {
        super(name, age);
    }

    public void getVoice() {
        System.out.println("Ruuah");
    }

        @Override
        public void run () {
            System.out.println("Tiger's running");
        }
    }