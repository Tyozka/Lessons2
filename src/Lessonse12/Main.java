package Lessonse12;

import java.util.Iterator;

/**
 * Created by User on 21.06.2017.
 */
public class Main {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();

        //add
        list.add(3);
        list.add(4);
        list.add(5);

        Iterator iterator  = list.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
