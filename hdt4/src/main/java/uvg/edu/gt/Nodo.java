/**
 * Clase Nodo
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Clase que representa un nodo en una lista simplemente encadenada.
 * @param <T> Tipo del valor almacenado en el nodo.
 * Fecha de creación: 21/02/2024
 * Fecha de última modificación: 21/02/2024
 */

package uvg.edu.gt;

public class Nodo<T> {
    T valor;
    Nodo<T> siguiente;

    /**
     * Constructor que inicializa el nodo con un valor.
     * @param valor El valor a almacenar en el nodo.
     */    
    public Nodo(T valor) {
        this.valor = valor;
        this.siguiente = null;
    }
}
