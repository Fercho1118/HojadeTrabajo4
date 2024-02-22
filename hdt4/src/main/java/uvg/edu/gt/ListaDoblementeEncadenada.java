package uvg.edu.gt;

public class ListaDoblementeEncadenada<T> implements Lista<T> {
    private NodoDoble<T> cabeza;
    private NodoDoble<T> cola;
    private int size;

    public ListaDoblementeEncadenada() {
        cabeza = cola = null;
        size = 0;
    }

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

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
