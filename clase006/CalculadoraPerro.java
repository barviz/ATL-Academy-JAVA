package clase006;/* Calculadora de edad de perros:
Pídele al usuario que ingrese la edad de su perro.
Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
*/

import java.util.Scanner;

public class CalculadoraPerro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad de su perro: ");
        int edadPerro = scanner.nextInt();

        System.out.println("La edad de su perro en años perro es: " + edadPerro * 7);
    }
}
