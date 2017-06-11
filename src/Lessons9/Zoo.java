package Lessons9;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 11.06.2017.
 */
public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Cat animal) {
        animals.add(animal);
    }

    public void voiceAll() {
        for (Animal animal : animals) {
            System.out.println(animal.getVoice());
        }
    }
}