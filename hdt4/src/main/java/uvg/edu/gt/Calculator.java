/**
 * Clase Calculator
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Clase que proporciona métodos estáticos para convertir expresiones infix a postfix.
 * Fecha de creación: 21/02/2024
 * Fecha de última modificación: 21/02/2024
 */

package uvg.edu.gt;

import java.util.EmptyStackException;

public class Calculator {

    /**
     * Convierte una expresión dada en notación infix a notación postfix.
     * @param infixExpression La expresión infix como {@link String}.
     * @return La expresión convertida a postfix como {@link String}.
     */    
    public static String convertToPostfix(String infixExpression) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        stack.push('#');

        for (int i = 0; i < infixExpression.length(); i++) {
            char ch = infixExpression.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                postfix.append(ch);
            } else if (ch == '(') {
                stack.push(ch);
            } else if (ch == '^') {
                stack.push(ch);
            } else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    throw new IllegalArgumentException("Caracter invalido en infix");
                }
            } else {
                while (!stack.isEmpty() && precedence(ch) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty() && stack.peek() != '#') {
            postfix.append(stack.pop());
        }

        return postfix.toString();
    }

    /**
     * Determina la precedencia de los operadores.
     * @param op El operador cuya precedencia se quiere determinar.
     * @return Un entero que representa la precedencia del operador.
     */    
    private static int precedence(char op) {
        switch (op) {
            case '^':
                return 3;
            case '*':
            case '/':
                return 2;
            case '+':
            case '-':
                return 1;
            default:
                return -1;
        }
    }

    /**
     * Clase interna para representar una pila.
     * @param <T> Tipo de los elementos en la pila.
     */    
    private static class Stack<T> {
        private Node<T> top;

        /**
         * Inserta un elemento en la parte superior de la pila.
         * @param data El elemento a insertar.
         */        
        public void push(T data) {
            Node<T> newNode = new Node<>(data);
            newNode.next = top;
            top = newNode;
        }

        /**
         * Remueve y retorna el elemento en la parte superior de la pila.
         * @return El elemento en la parte superior de la pila.
         * @throws EmptyStackException si la pila está vacía.
         */        
        public T pop() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            T data = top.data;
            top = top.next;
            return data;
        }

        /**
         * Retorna el elemento en la parte superior de la pila sin removerlo.
         * @return El elemento en la parte superior de la pila.
         * @throws EmptyStackException si la pila está vacía.
         */        
        public T peek() {
            if (isEmpty()) {
                throw new EmptyStackException();
            }
            return top.data;
        }

        /**
         * Verifica si la pila está vacía.
         * @return true si la pila está vacía, false en caso contrario.
         */        
        public boolean isEmpty() {
            return top == null;
        }

        /**
         * Clase interna para representar un nodo en la pila.
         * @param <T> Tipo del dato almacenado en el nodo.
         */        
        private static class Node<T> {
            private T data;
            private Node<T> next;
            
            /**
             * Constructor que inicializa el nodo con un dato.
             * @param data El dato a almacenar en el nodo.
             */
            public Node(T data) {
                this.data = data;
            }
        }
    }
}