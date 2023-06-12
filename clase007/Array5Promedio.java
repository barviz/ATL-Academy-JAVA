/*Ahora, hay que mostrar el promedio.
Para hacer esto se suman todos los números y se divide por 5,
ya que el usuario agregó 5 números.*/

package clase007;

import java.util.Scanner;

public class Array5Promedio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int contador = 0;
        int suma = 0;

        System.out.println("Ingresa 5 números:");

        while (contador < numeros.length) {
            numeros[contador] = sc.nextInt();
            suma += numeros[contador];
            contador++;
        }

        System.out.println("Los números ingresados son: ");

        contador = 0;

        while (contador < numeros.length) {
            System.out.println(numeros[contador]);
            contador++;
        }

        double promedio = (double) suma / numeros.length;

        int numeroMayor = mayor(numeros);
        int numeroMenor = menor(numeros);

        System.out.println("\nEl mayor número es: " + numeroMayor);
        System.out.println("El menor número es: " + numeroMenor);
        System.out.println("El promedio de los cinco números ingresados es: " + promedio);
    }
    public static int mayor(int[] numeros) {

        int mayor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        return mayor;
    }

    public static int menor(int[] numeros) {

        int menor = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        return menor;
    }
}
