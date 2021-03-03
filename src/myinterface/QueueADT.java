package myinterface;
public interface QueueADT<E extends Comparable<E>> {
    void enqueue(E data);
    E dequeue();
    E peek();
    boolean isEmpty();
    int size();
}
