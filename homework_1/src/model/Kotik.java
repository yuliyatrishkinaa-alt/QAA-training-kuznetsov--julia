package model;

public class Kotik {
    private static int countExamps = 0;
    private int satiety;
    private int id;
    private String name;
    private int age;
    private String talk;

    public Kotik() {
        countExamps++;
        int id = countExamps;
    }

    public Kotik(int age, String name) {
        this.age = age;
        this.name = name;
        countExamps++;
        int id = countExamps;
    }

    private void action(String result, String result2) {
        if (satiety <= 0) {
            System.out.println(result);
        } else {
            System.out.println(result2);
        }
    }

    public void play() {
        action("Котик не хочет играть, он голодный", "Котик играет");
    }

    public void cheeseMouse() {
        action("Котик не хочет догонять мышку, он голодный", "Котик догоняет мышку");
    }

    public void sleep() {
        action("Котик не может уснуть, он голодный", "Котик уснул");
    }

    public void bite() {
        action("Котик даже не кусается, он голодный", "Котик кусается");
    }

    public void eat() {
        eat(10, "food");
    }

    public void eat(int foodSatiety) {
        eat(foodSatiety,"");
    }

    public void eat(int foodSatiety, String foodName) {
        satiety = satiety + foodSatiety;
        System.out.println("Котик съел " + foodName);
    }

    public void liveAnotherDay() {
        for (int i = 1; i < 25; i++) {
            var behavior = (Math.random() * 5 + 1);
            System.out.println(i + "hour");
            switch ((int) behavior) {
                case 1:
                    sleep();
                    break;
                case 2:
                    eat();
                    break;
                case 3:
                    cheeseMouse();
                    break;
                case 4:
                    bite();
                    break;
                case 5:
                    play();
                    break;
                default:
                    break;
            }
        }
    }

    public int getSatiety() {
        return satiety;
    }
    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public static int getCountExamps() {
        return countExamps;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTalk(String catSays) {
        this.talk = catSays;
    }

    public String getTalk() {
        return talk;
    }

    public void setId(int id) {
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public static int getCountExapms() {
        return countExamps;
    }
}

