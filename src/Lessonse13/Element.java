package Lessonse13;

/**
 * Created by User on 25.06.2017.
 */
public class Element {
    Element next;
    Object data;

    public Element(Element next, Object data) {
        this.next = next;
        this.data = data;
    }

    @Override
    public boolean equals(Object obj) {
        return data.equals(((Element)obj).data);
    }
}