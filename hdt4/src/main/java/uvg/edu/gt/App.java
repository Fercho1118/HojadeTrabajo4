/**
 * Clase App
 * Felipe Aguilar - 23195
 * Fernando Rueda - 23748
 * Clase principal que contiene el método para leer y procesar una expresión infix desde un archivo .txt.
 * Fecha de creación: 21/02/2024
 * Fecha de última modificación: 21/02/2024
 */

package uvg.edu.gt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    /**
     * Punto de entrada principal de la aplicación.
     * @param args Argumentos pasados por línea de comandos al programa.
     */    
    public static void main(String[] args) {
        try {
            String infixExpression = leerExpresionFromFile("datos.txt");
            if (infixExpression != null && !infixExpression.isEmpty()) {
                String postfixExpression = Calculator.convertToPostfix(infixExpression);
                System.out.println("Expresión Postfix: " + postfixExpression);
            } else {
                System.out.println("No se pudo leer la expresión infix del archivo.");
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

    /**
     * Lee una expresión desde un archivo de texto.
     * @param fileName El nombre del archivo de donde se leerá la expresión.
     * @return La expresión leída del archivo como un {@link String}.
     * @throws IOException Si ocurre un error durante la lectura del archivo.
     */    
    private static String leerExpresionFromFile(String fileName) throws IOException {
    StringBuilder sb = new StringBuilder();
    try (BufferedReader br = new BufferedReader(new InputStreamReader(App.class.getClassLoader().getResourceAsStream(fileName)))) {
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
    }
    return sb.toString();
}
}