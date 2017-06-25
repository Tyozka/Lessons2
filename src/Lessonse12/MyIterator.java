package Lessonse12;

import java.util.Iterator;

/**
 * Created by User on 21.06.2017.
 */
public class MyIterator implements Iterator {
    private MyArrayList list;
    private int index;

    public MyIterator(MyArrayList list){
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return index < list.getSize();
    }

    @Override
    public Object next() {
        int el = list.get(index);
        index++;
        return el;
    }
}
