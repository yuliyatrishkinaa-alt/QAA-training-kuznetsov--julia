package food;

public abstract class Food {

    protected String food;
    protected int foodSatiety;

    public Food(String food) {
        this.food = food;
    }

    public FoodSatiety(int foodSatiety) {
        this.foodSatiety = foodSatiety;
    }
}
