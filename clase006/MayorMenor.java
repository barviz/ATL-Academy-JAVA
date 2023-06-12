/*Armar un programa que permita cargar 3 números y mostrar cual es el mayor y cual es el menor.*/

package clase006;

import java.util.Scanner;

public class MayorMenor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = sc.nextInt();

        int mayor = Math.max(numero1, Math.max(numero2, numero3));
        int menor = Math.min(numero1, Math.min(numero2, numero3));

        System.out.println("El mayor número es: " + mayor);
        System.out.println("El menor número es: " + menor);
    }
}
