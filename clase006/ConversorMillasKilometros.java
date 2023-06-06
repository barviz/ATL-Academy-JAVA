package clase006;

import java.util.Scanner;

/* Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.
*/
public class ConversorMillasKilometros {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una distancia en millas: ");
        double millas = scanner.nextDouble();

        double kilometros = millas * 1.60934;

        System.out.println("La distancia en kilómetros es: " + kilometros + " km.");
    }
}
