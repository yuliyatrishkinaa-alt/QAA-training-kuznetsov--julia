package model;

public class Kotik {
    private int satiety;
    private int hungery;
    private static int countExamps = 0;
    private int id;
    private String name;
    private int age;
    private String catSays;
    private String kittySays;

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

    public void play() {
        if (satiety <= 0) {
            String result = "Котик не хочет играть, он голодный";
            System.out.println(result);
        } else if (satiety > 0) {
            String result2 = "Котик играет";
            System.out.println(result2);
        }
    }

    public void cheeseMouse() {
        if (satiety <= 0) {
            String result3 = "Котик не хочет догонять мышку, он голодный";
            System.out.println(result3);
        } else if (satiety > 0) {
            String result4 = "Котик догоняет мышку";
            System.out.println(result4);
        }
    }

    public void eat(int hungery) {
        var myHungery = hungery + satiety;
        if (myHungery <= 0) {
            String result5 = "Котику нужно поесть";
            System.out.println(result5);
        } else if (myHungery > 0) {
            String result6 = "Котик не голоден";
            System.out.println(result6);
        }
    }

    public void eat(int hungery, String foodName) {
        hungery = hungery + satiety;
        if (hungery <= 0) {
            String result7 = "Котику нужно поесть";
            System.out.println(result7 + foodName);
        } else if (hungery > 0) {
            String result8 = "Котик не хочет есть";
            System.out.println(result8 + foodName);
        }
    }

    public void eat() {
        eat(0);
    }


    public void sleep() {
        if (satiety <= 0) {
            String result9 = "Котик не может уснуть, он голодный";
            System.out.println(result9);
        } else if (satiety > 0) {
            String result10 = "Котик уснул";
            System.out.println(result10);
        }
    }

    public void bite() {
        if (satiety <= 0) {
            String result11 = "Котик даже не кусается, он голодный";
            System.out.println(result11);
        } else if (satiety > 0) {
            String result12 = "Котик кусается";
            System.out.println(result12);
        }
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

    public int getHungery() {
        return hungery;
    }

    public int getCountExamps() {
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

    public void setCatSays(String catSays) {
        this.catSays = catSays;
    }

    public void setKittySays(String kittySays) {
        this.kittySays = kittySays;
    }

    public String getCatSays() {
        return catSays;
    }

    public String getKittySays() {
        return kittySays;
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

