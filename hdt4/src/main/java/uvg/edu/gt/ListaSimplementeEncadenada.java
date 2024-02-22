/**
 * Clase ListaSimplementeEncadenada
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Clase que implementa la interfaz Lista utilizando una lista simplemente encadenada.
 * @param <T> Tipo de los elementos contenidos en la lista.
 * Fecha de creación: 21/02/2024
 * Fecha de última modificación: 21/02/2024
 */

package uvg.edu.gt;

public class ListaSimplementeEncadenada<T> implements Lista<T> {
    private Nodo<T> cabeza;
    private int size;

    /**
     * Constructor que inicializa la lista como vacía.
     */    
    public ListaSimplementeEncadenada() {
        cabeza = null;
        size = 0;
    }

    /**
     * {@inheritDoc}
     */  
    @Override
    public void add(T item) {
        Nodo<T> nuevoNodo = new Nodo<>(item);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
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
            size--;
            return true;
        }
        Nodo<T> actual = cabeza;
        while (actual.siguiente != null) {
            if (actual.siguiente.valor.equals(item)) {
                actual.siguiente = actual.siguiente.siguiente;
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
        Nodo<T> actual = cabeza;
        for (int i = 0; i < index; i++) {
            actual = actual.siguiente;
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
