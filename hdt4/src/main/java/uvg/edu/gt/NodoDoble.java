/**
 * Clase NodoDoble
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Clase que representa un nodo en una lista doblemente encadenada.
 * @param <T> Tipo del valor almacenado en el nodo.
 * Fecha de creación: 21/02/2024
 * Fecha de última modificación: 21/02/2024
 */

package uvg.edu.gt;

class NodoDoble<T> {
    T valor;
    NodoDoble<T> anterior, siguiente;

    /**
     * Constructor que inicializa el nodo con un valor y enlaces nulos a los nodos anterior y siguiente.
     * @param valor El valor a almacenar en el nodo.
     */    
    public NodoDoble(T valor) {
        this.valor = valor;
        this.anterior = null;
        this.siguiente = null;
    }
}
