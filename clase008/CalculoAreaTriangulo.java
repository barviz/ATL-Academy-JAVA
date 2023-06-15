/*Hacer una función que calcule el área de un triángulo.
Al llamarla debe devolver el área del triángulo.
*/

package clase008;

public class CalculoAreaTriangulo {

    public class Main {
        public static void main(String[] args) {

            double base = 6.5;
            double altura = 4.2;

            System.out.println("El área del triángulo es: " + calcularAreaTriangulo(base, altura));
        }

        public static double calcularAreaTriangulo(double base, double altura) {
            return (base * altura) / 2;
        }
    }
}