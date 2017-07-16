package Lessonse18;

/**
 * Created by User on 16.07.2017.
 */
import java.io.Serializable;

public class Interval <T extends Comparable<T>> implements Serializable{
    private T lower;
    private T upper;
    public Interval(T first, T second){
        if(first.compareTo(second)<=0){
            lower =first;
            upper = second;
        }
        else{
            lower = second;
            upper = first;
        }

    }

}