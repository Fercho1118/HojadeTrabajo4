/**
 * Clase ListaDoblementeEncadenada
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Clase que implementa la interfaz Lista utilizando una lista doblemente encadenada.
 * @param <T> Tipo de los elementos contenidos en la lista.
 * Fecha de creación: 21/02/2024
 * Fecha de última modificación: 21/02/2024
 */

package uvg.edu.gt;

public class ListaDoblementeEncadenada<T> implements Lista<T> {
    private NodoDoble<T> cabeza;
    private NodoDoble<T> cola;
    private int size;

    /**
     * Constructor que inicializa la lista como vacía.
     */    
    public ListaDoblementeEncadenada() {
        cabeza = cola = null;
        size = 0;
    }

    /**
     * {@inheritDoc}
     */    
    @Override
    public void add(T item) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(item);
        if (cabeza == null) {
            cabeza = cola = nuevoNodo;
        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
        }
        size++;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean remove(T item) {
        if (cabeza == null) return false;
        if (cabeza.valor.equals(item)) {
            cabeza = cabeza.siguiente;
            if (cabeza != null) cabeza.anterior = null;
            else cola = null;
            size--;
            return true;
        }
        NodoDoble<T> actual = cabeza;
        while (actual != null) {
            if (actual.valor.equals(item)) {
                if (actual.siguiente != null) actual.siguiente.anterior = actual.anterior;
                else cola = actual.anterior;
                if (actual.anterior != null) actual.anterior.siguiente = actual.siguiente;
                size--;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        NodoDoble<T> actual;
        if (index < size / 2) {
            actual = cabeza;
            for (int i = 0; i < index; i++) {
                actual = actual.siguiente;
            }
        } else {
            actual = cola;
            for (int i = size - 1; i > index; i--) {
                actual = actual.anterior;
            }
        }
        return actual.valor;
    }
    
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
