/*Después de realizar el ejercicio anterior, agregar que muestre el número mayor y el número menor.*/

package clase007;

import java.util.Scanner;

public class Array5MayorMenor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];
        int contador = 0;

        System.out.println("Ingresa 5 números:");

        while (contador < numeros.length) {
            numeros[contador] = sc.nextInt();
            contador++;
        }

        System.out.println("Los números ingresados son: ");

        contador = 0;

        while (contador < numeros.length) {
            System.out.println(numeros[contador]);
            contador++;
        }

        int numeroMayor = mayor(numeros);
        int numeroMenor = menor(numeros);

        System.out.println("\nEl mayor número es: " + numeroMayor);
        System.out.println("El menor número es: " + numeroMenor);
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
