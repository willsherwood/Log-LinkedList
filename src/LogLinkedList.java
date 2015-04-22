import java.util.List;

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
    }

    public E element() {
        return element;
    }
}
