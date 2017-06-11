package Lessons9;

/**
 * Created by User on 11.06.2017.
 */

public class Dog extends Domestic {
    public Dog(int id, int age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }

    public String getVoice() {
        return "Woof";
    }
}