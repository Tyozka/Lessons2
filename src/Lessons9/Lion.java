package Lessons9;

import java.util.List;

/**
 * Created by User on 11.06.2017.
 */
public class Lion extends Wild implements Purrable{
    String name;

    Lion (int id, int age, double weight, String color, String name){
        super(id, age, weight, color);
        this.name = name;
    }

    @Override
    public void purr(){
        System.out.println("Rrrr, Rrrr, Rrrr, Rrrr, Lion");
    }

}
