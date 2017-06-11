package Lessons9;

import org.jetbrains.annotations.NotNull;

/**
 * Created by User on 11.06.2017.
 */
public class Cat extends Domestic implements Purrable, Comparable {
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

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }
}
