/*Armar un programa que permita cargar 3 números y mostrar cual es el número promedio*/

package clase006;

import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrea el primer número: ");
        double numero1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double numero3 = sc.nextDouble();

        double promedio = (numero1 + numero2 + numero3) / 3;

        System.out.println("El número promedio es: " + promedio);
    }
}
