package animals;

import food.Food;

public abstract class Animals {

    protected String name;
    protected int age;
    protected int satiety;

    public Animals (String name, int age){
        this.name = name;
        this.age = age;
    }

    public String eat(Food food) {
        return food.toString();
    }
}
