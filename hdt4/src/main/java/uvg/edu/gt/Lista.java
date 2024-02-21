package uvg.edu.gt;
public interface Lista<T> {
    void add(T item);
    boolean remove(T item);
    T get(int index);
    boolean isEmpty();
}
