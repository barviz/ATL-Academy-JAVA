/*Hacer un programa que permita al usuario ingresar 5 números y mostrarlos.*/

package clase007;

import java.util.Scanner;

    public class Array5Numeros {

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
        }
    }
