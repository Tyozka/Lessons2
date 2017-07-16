package Lessonse18;

/**
 * Created by User on 16.07.2017.
 */
public class PairOfNumbers<T extends Number> {
    public T first;
    public T second;

    public PairOfNumbers(T first, T second) {
        this.first = first;
        this.second = second;
    }



    //simple test
    public static void main(String[] args) {
        PairOfNumbers<Integer> firstPair = new PairOfNumbers<Integer>(2,3);


//        PairOfNumbers<String> thirdPair; won't compile
    }

}