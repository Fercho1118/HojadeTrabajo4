/**
 * Clase ArrayListPila
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Clase que  Implementa una pila utilizando un {@link ArrayList} como estructura de datos subyacente.
 * @param <T> Tipo de los elementos almacenados en la pila.
 * Fecha de creación: 20/02/2024
 * Fecha de última modificación: 20/02/2024
 */


package uvg.edu.gt;
import java.util.ArrayList;
import java.util.EmptyStackException;

public class ArrayListPila<T> implements Pila<T> {
    private ArrayList<T> stack;

    /**
     * Constructor que inicializa la pila.
     */    
    public ArrayListPila() {
        this.stack = new ArrayList<>();
    }

    /**
     * Inserta un elemento en la parte superior de la pila.
     * @param item El elemento a insertar.
     */    
    @Override
    public void push(T item) {
        stack.add(item);
    }

    /**
     * Remueve y retorna el elemento en la parte superior de la pila.
     * @return El elemento en la parte superior de la pila.
     * @throws EmptyStackException si la pila está vacía.
     */    
    @Override
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(stack.size() - 1);
    }

    /**
     * Retorna el elemento en la parte superior de la pila sin removerlo.
     * @return El elemento en la parte superior de la pila.
     * @throws EmptyStackException si la pila está vacía.
     */    
    @Override
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.get(stack.size() - 1);
    }

    /**
     * Verifica si la pila está vacía.
     * @return true si la pila está vacía, false en caso contrario.
     */    
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
