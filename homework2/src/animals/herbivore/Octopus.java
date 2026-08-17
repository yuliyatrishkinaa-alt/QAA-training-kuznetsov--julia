package animals.herbivore;

import animals.interfaces.Swimable;

public class Octopus extends Herbivore implements Swimable {

    public Octopus (String name, int age) {
        super(name, age);
    }

    @Override
    public void swim() {
        System.out.println("Octopus swimming");
    }
}
