package Lessons9;

/**
 * Created by User on 11.06.2017.
 */
public abstract class Wild extends Animal{
    public Wild(int id, int age, double weight, String color){
        super(id, age, weight, color);
    }
    private boolean isPredator;

    public boolean isPredator() {
        return isPredator;
    }

    public void setIsPredator(boolean isPredator) {
        this.isPredator = isPredator;
    }
}
