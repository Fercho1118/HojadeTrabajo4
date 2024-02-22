package uvg.edu.gt;

class NodoDoble<T> {
    T valor;
    NodoDoble<T> anterior, siguiente;

    public NodoDoble(T valor) {
        this.valor = valor;
        this.anterior = null;
        this.siguiente = null;
    }
}
