package uvg.edu.gt;
import java.util.EmptyStackException;
import java.util.Vector;

public class VectorPila<T> implements Pila<T> {
    private Vector<T> stack;

    public VectorPila() {
        this.stack = new Vector<>();
    }

        @Override
    public void push(T item) {
        stack.add(item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
