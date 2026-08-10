import model.Kotik;

import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {
    public static void main(String[] args) {

        Kotik kitty = new Kotik(15, "Junior");
        kitty.setTalk("meow");
        kitty.setSatiety(1);

        Kotik cat = new Kotik();
        cat.setName("Antonio");
        cat.setAge(5);
        cat.setTalk("meow");
        cat.setSatiety(5);

        System.out.println("Имя кота - " + kitty.getName());

        kitty.liveAnotherDay();

        if (cat.getTalk().equals(kitty.getTalk())) {
            System.out.println("Котики мяукают одинаково");
        } else {
            System.out.println("Котики мяукают по-разному");
        }

        System.out.println(Kotik.getCountExapms());
    }
}