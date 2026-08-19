package animals.carnivorous;

import animals.interfaces.Runable;
import animals.interfaces.Voicable;

public class Tiger extends Carnivorous implements Runable, Voicable {

    public Tiger(String name, int age) {
        super(name, age);
    }

    public String getVoice() {
        String voice = "Ruuah";
        return voice;
    }

        @Override
        public void run () {
            System.out.println("Tiger's running");
        }
    }