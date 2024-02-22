/**
 * Clase VectorPila
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Clase que Implementa una pila utilizando un {@link Vector} como estructura de datos subyacente.
 * @param <T> Tipo de los elementos almacenados en la pila.
 * Fecha de creación: 21/02/2024
 * Fecha de última modificación: 21/02/2024
 */

package uvg.edu.gt;
import java.util.EmptyStackException;
import java.util.Vector;

public class VectorPila<T> implements Pila<T> {
    private Vector<T> stack;

    /**
     * Constructor que inicializa la pila.
     */    
    public VectorPila() {
        this.stack = new Vector<>();
    }

    /**
     * {@inheritDoc}
     */
        @Override
    public void push(T item) {
        stack.add(item);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
