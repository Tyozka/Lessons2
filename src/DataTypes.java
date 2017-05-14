import static java.lang.StrictMath.abs;

/**
 * Created by hillel on 14.05.17.
 */
public class DataTypes{
    public static void main (String[] args){
        boolean bool = true;

        int first = 10;

        long lonVar = 3_333_333_333L;

        //lonVar = (long)first;

        System.out.println(lonVar);

        first = (int) lonVar;

        System.out.println(first);

        double dT = 0.7;
        double dF = 0.1;
        double dS = dT + dF;

        System.out.println(dS);

        double d = 0.7+0.1;

        if(d == 0.8) { // False all
             System.out.println("test: " + d);


        }

        if(abs(d - 0.5) < 0000.1) { // Проверка
            System.out.println("test2 abs: " + d);


        }



    }

}
