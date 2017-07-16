package Lessonse18;

/**
 * Created by User on 16.07.2017.
 */
public class TestGenerics {

    public static void main(String[] args) {
        String var = concat(100, 200);

    }

    public static <T> String concat(T first, T second){
        return first.toString() + second.toString();
    }
}
