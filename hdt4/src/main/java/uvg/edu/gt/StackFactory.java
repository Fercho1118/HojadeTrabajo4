/**
 * Clase StackFactory
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Clase que crea instancias de diferentes tipos de pilas.
 * Fecha de creación: 21/02/2024
 * Fecha de última modificación: 21/02/2024
 */

package uvg.edu.gt;

public class StackFactory {

    /**
     * Enumeración de los tipos de pilas soportadas por la fábrica.
     */    
    public enum StackType {
        ARRAY_LIST, VECTOR
    }

    /**
     * Crea una instancia de una pila según el tipo especificado.
     * @param type El tipo de pila a crear.
     * @return Una instancia de la pila del tipo especificado.
     * @throws IllegalArgumentException si el tipo de pila no es soportado.
     */    
    public static <T> Pila<T> createStack(StackType type) {
        switch (type) {
            case ARRAY_LIST:
                return new ArrayListPila<>();
            case VECTOR:
                return new VectorPila<>();
            default:
                throw new IllegalArgumentException("Unsupported stack type: " + type);
        }
    }
}

