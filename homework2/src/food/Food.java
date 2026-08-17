package food;

public abstract class Food {

    private String food;
    private int foodSatiety;

    public Food(String food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Food{" +
                "food - " + food +
                '}';
    }
    public void setFoodSatiety(int foodSatiety){
        this.foodSatiety = foodSatiety;
    }

    public int getFoodSatiety(){
        return foodSatiety;
    }
}
