package pack_1;

import animals.Animals;
import animals.carnivorous.Crocodile;
import animals.herbivore.Fish;
import animals.herbivore.Octopus;
import food.Grass;

import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        Crocodile crocodile = new Crocodile("Misha", 15);
        Grass herbiFood = new Grass("LittleGrass");
        Grass herbiFood2 = new Grass("LongGrass");
        Fish littleFish = new Fish("littleFish", 1);
        Fish bigFish = new Fish("bigFish", 2);
        Fish middleFish = new Fish("middleFish", 3);
        Octopus littleOcto = new Octopus("littleOctopus", 1);
        Octopus middleOcto = new Octopus("middleOctopus", 2);

        ArrayList<> lakeAnimals = new ArrayList<>();
        lakeAnimals.add(littleFish);
        lakeAnimals.add(middleFish);
        lakeAnimals.add(bigFish);
        lakeAnimals.add(littleOcto);
        lakeAnimals.add(middleOcto);


}
