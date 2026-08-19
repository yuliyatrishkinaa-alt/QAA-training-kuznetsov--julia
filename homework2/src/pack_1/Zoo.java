package pack_1;

import animals.Animals;
import animals.carnivorous.*;
import animals.herbivore.Fish;
import animals.herbivore.Monkey;
import animals.herbivore.Octopus;
import animals.interfaces.Swimable;
import food.Food;
import food.Grass;
import food.Meat;
import worker.Worker;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        Crocodile crocodile = new Crocodile("Misha", 15);
        Grass bananas = new Grass("bananas");
        Grass klewer = new Grass("klewer");
        Meat chicken = new Meat("chicken");
        Fish littleFish = new Fish("littleFish", 1);
        Fish bigFish = new Fish("bigFish", 2);
        Fish middleFish = new Fish("middleFish", 3);
        Octopus littleOcto = new Octopus("littleOctopus", 1);
        Octopus middleOcto = new Octopus("middleOctopus", 2);
        Worker natan = new Worker("Natan", "Nanidze");
        Monkey zemfira = new Monkey("Zemfira", 15);
        Leopard leo = new Leopard("Leo", 21);
        Tiger ryk = new Tiger("Ryk", 11);
        Duck ronald = new Duck("Ronald", 2);
        ronald.setSatiety(3);
        zemfira.setSatiety(8);
        chicken.setFoodSatiety(10);
        klewer.setFoodSatiety(2);

        ronald.eat(chicken);
        zemfira.eat(klewer);

        ArrayList<Swimable> lakeAnimals = new ArrayList<>();
        lakeAnimals.add(littleFish);
        lakeAnimals.add(middleFish);
        lakeAnimals.add(bigFish);
        lakeAnimals.add(littleOcto);
        lakeAnimals.add(middleOcto);

        for (int i = 0; i < lakeAnimals.size(); i++) {
            lakeAnimals.get(i).swim();
        }

        crocodile.eat(bananas);
        leo.eat(chicken);
        ryk.eat(klewer);
        zemfira.eat(bananas);
        ronald.eat(chicken);

        natan.feed(crocodile, bananas);
        natan.feed(zemfira, chicken);
        natan.getVoice(ryk);
        natan.getVoice(zemfira);
//        natan.getVoice(middleFish);

        ryk.run();
        ronald.run();
        zemfira.run();
        littleOcto.swim();
        leo.run();
        crocodile.swim();

    }
}
