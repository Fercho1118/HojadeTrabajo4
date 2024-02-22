/**
 * Interfaz Lista
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Interfaz que define los métodos básicos de una lista.
 * @param <T> Tipo de los elementos que contendrá la lista.
 * Fecha de creación: 20/02/2024
 * Fecha de última modificación: 20/02/2024
 */

package uvg.edu.gt;
public interface Lista<T> {

    /**
     * Añade un elemento al final de la lista.
     * @param item El elemento a añadir.
     */
    void add(T item);

    /**
     * Remueve un elemento de la lista.
     * @param item El elemento a remover.
     * @return true si el elemento fue removido con éxito, false en caso contrario.
     */    
    boolean remove(T item);

    /**
     * Obtiene el elemento en una posición específica de la lista.
     * @param index La posición del elemento a obtener.
     * @return El elemento en la posición especificada.
     * @throws IndexOutOfBoundsException si el índice está fuera del rango (index < 0 || index >= size()).
     */    
    T get(int index);

    /**
     * Verifica si la lista está vacía.
     * @return true si la lista no contiene elementos, false en caso contrario.
     */    
    boolean isEmpty();
}
