package uvg.edu.gt;

public class StackFactory {
    public enum StackType {
        ARRAY_LIST, VECTOR
    }

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

