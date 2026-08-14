package worker;

import animals.Animals;
import food.Food;

public class Worker {

    protected Animals animal;
    protected Food food;

    public void feed(Animals animal, Food food) {
        this.animal = animal;
        this.food = food;
    }
}
