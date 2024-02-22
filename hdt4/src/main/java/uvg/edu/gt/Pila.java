/**
 * Interfaz Pila
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Interfaz que define las operaciones básicas de una pila.
 * @param <T> Tipo de los elementos almacenados en la pila.
 * Fecha de creación: 20/02/2024
 * Fecha de última modificación: 20/02/2024
 */

package uvg.edu.gt;

import java.util.EmptyStackException;

public interface Pila<T> {

    /**
     * Añade un elemento en la parte superior de la pila.
     * @param item El elemento a añadir.
     */    
    void push(T item);

    /**
     * Remueve el elemento en la parte superior de la pila y lo devuelve.
     * @return El elemento removido de la pila.
     * @throws EmptyStackException si la pila está vacía.
     */    
    T pop();

    /**
     * Obtiene el elemento en la parte superior de la pila sin removerlo.
     * @return El elemento en la parte superior de la pila.
     * @throws EmptyStackException si la pila está vacía.
     */    
    T peek();

    /**
     * Verifica si la pila está vacía.
     * @return true si la pila no tiene elementos, false en caso contrario.
     */    
    boolean isEmpty();
}