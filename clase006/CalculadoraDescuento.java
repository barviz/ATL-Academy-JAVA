package clase006;/*Calculadora de descuento:
Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula:
precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.
*/

import java.util.Scanner;

public class CalculadoraDescuento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio original del producto: ");
        double precioOriginal = scanner.nextDouble();

        System.out.print("Ingrese el porcentaje de descuento: ");
        double descuento = scanner.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        // Imprimir el resultado
        System.out.println("El precio final luego de aplicar el descuento es: " + precioFinal);
    }
}
