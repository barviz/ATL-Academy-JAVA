package clase006;/*5) Juego de adivinar el número:
Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
*/

import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinarNumero {

    public static void main(String[] args) {

        // genero un número aleatorio entre 1 y 100
        Random random = new Random();
        int numeroAdivinar = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int intentos = 0;
        int numeroIngresado;

        do {
            System.out.print("Adivina el número entre 1 y 100: ");
            numeroIngresado = scanner.nextInt();

            intentos++;

            if (numeroIngresado > numeroAdivinar) {
                System.out.println("Muy alto. Intenta otra vez.");
            } else if (numeroIngresado < numeroAdivinar) {
                System.out.println("Muy bajo. Intenta otra vez.");
            } else {
                System.out.println("\nAdivinaste el número! (en " + intentos + " intentos)");
            }
        } while (numeroIngresado != numeroAdivinar);
    }
}
