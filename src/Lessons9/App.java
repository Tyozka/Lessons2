package Lessons9;

/**
 * Created by User on 11.06.2017.
 */
public class App {
    public static void main(String[] args) {
        Cat cat = new Cat(1, 3,2.5,"Red", "Vasy", true);
        Lion lion = new Lion(1, 3,2.5,"Yellow", "Simba");

        Purrable[] purrables = new Purrable[2];
        purrables[0] = cat;
        purrables[1] = lion;

        for(Purrable animal : purrables){
            animal.purr();
        }
    }
}
