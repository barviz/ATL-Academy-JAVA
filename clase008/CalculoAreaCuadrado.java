/*Hacer una función que calcule el área de un cuadrado.
Al llamarla debe devolver el área del cuadrado*/

package clase008;

public class CalculoAreaCuadrado {

    public static void main(String[] args) {

        int lado = 5;
        int area = calcularAreaCuadrado(lado);

        System.out.println("El área del cuadrado es: " + area);
    }

    public static int calcularAreaCuadrado(int lado) {
        return lado * lado;
    }
}