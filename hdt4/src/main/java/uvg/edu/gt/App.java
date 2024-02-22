package uvg.edu.gt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
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