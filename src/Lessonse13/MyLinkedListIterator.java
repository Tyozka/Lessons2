package Lessonse13;

/**
 * Created by User on 25.06.2017.
 */
import java.util.Iterator;

public class MyLinkedListIterator implements Iterator<Object> {
    private Element currentElement;
    public MyLinkedListIterator(Element element) {
        this.currentElement = element;
    }

    @Override
    public boolean hasNext() {
        return currentElement!=null;
    }

    @Override
    public Object next() {
        Object toReturn = currentElement.data;
        currentElement = currentElement.next;
        return toReturn;
    }
}