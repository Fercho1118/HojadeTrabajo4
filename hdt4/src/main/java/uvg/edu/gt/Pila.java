package uvg.edu.gt;
public interface Pila<T> {
    void push(T item);
    T pop();
    T peek();
    boolean isEmpty();
}