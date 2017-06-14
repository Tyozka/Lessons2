package Lessons9;



/**
 * Created by User on 11.06.2017.
 */
public class Cat extends Domestic implements Purrable {
    public Cat(int id, int age, double weight, String color, String name, boolean isVactinated) {
        super(id, age, weight, color, name, isVactinated);
    }

    public String getVoice() {
        return "Meow";
    }

    @Override
    public void purr() {
        System.out.println("Myrr, Myrr, Myrr, Myrr | Cat");
    }

}
