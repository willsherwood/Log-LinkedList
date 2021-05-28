import java.util.List;
import java.util.LinkedList;

public class LogLinkedList<E> {

    private List<E> nodesAhead;
    private E element;
    private int size;

    public LogLinkedList(int initialCapacity) {
        this(null, initialCapacity);
    }

    public LogLinkedList(E element) {
        this(element, 1);
    }

    public LogLinkedList(E element, int initialCapacity) {
        this.element = element;
        this.size = initialCapacity;
        nodesAhead = new LinkedList<E>();
    }

    public E element() {
        return element;
    }

    public E get(int index) {
        return nodesAhead.get(index);
    }

    public boolean add(E e) {
        return nodesAhead.add(e);
    }
}
