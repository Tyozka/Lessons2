package Lessons14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomAiGameStrategy implements AiGameStrategy {

    @Override
    public int aiMakeTurn(int[] field) {
        // todo if freePlaces.size == 0 then new Random().nextInt(freePlaces.size()) - Error

        List freePlaces = new ArrayList();
        for (int i = 0; i < field.length; i++) {
            if (field[i] == 0) {
                freePlaces.add(i);
            }
        }
        if(freePlaces.size() == 0) return -1;
        int toPlace = new Random().nextInt(freePlaces.size());
        return (Integer) freePlaces.get(toPlace);
    }
}
