package uvg.edu.gt;

public class App {
    public static void main(String[] args) {
        Pila<Integer> arrayListPila = new ArrayListPila<>();
        Pila<Integer> vectorPila = new VectorPila<>();

        System.out.println("Probando ArrayListPila:");
        probarPila(arrayListPila);

        System.out.println("\nProbando VectorPila:");
        probarPila(vectorPila);
    }

    private static void probarPila(Pila<Integer> pila) {
        try {
            pila.push(1);
            pila.push(2);
            System.out.println("Peek: " + pila.peek()); // Debería mostrar 2
            System.out.println("Pop: " + pila.pop()); // Debería mostrar 2
            System.out.println("Pop: " + pila.pop()); // Debería mostrar 1
            System.out.println("La pila está vacía: " + pila.isEmpty()); // Debería mostrar true
            System.out.println("Intentando hacer pop en pila vacía...");
            pila.pop(); // Debería lanzar una excepción
        } catch (Exception e) {
            System.out.println("Excepción capturada: " + e.getMessage());
        }
    }
}

