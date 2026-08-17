package worker;

import animals.Animals;
import animals.interfaces.Voicable;
import food.Food;

public class Worker {

    private String name;
    private String surname;

    public Worker (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void feed(Animals animal, Food food) {
        System.out.println("Worker feeds " + animal + " with " + food + " and ");
        animal.eat(food);
    }

    public void getVoice(Animals animal) {
        System.out.println(animal + " says " + animal.voice());
    }
}
