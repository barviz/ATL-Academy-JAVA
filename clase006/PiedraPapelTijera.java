/*Escribe un programa que permita al usuario jugar el juego clásico de
"piedra, papel, tijeras" contra la computadora.
El programa debe solicitar al usuario que ingrese su elección (piedra, papel o tijeras)
y luego generar una elección aleatoria para la computadora.
Después de eso, el programa debe determinar el ganador según las reglas del juego
y mostrar el resultado.*/

package clase006;

import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Piedra Papel o Tijera!");

        System.out.print("Elegí piedra, papel o tijera: ");
        String eleccion = sc.nextLine().toLowerCase();

        String[] opciones = {"piedra", "papel", "tijera"};

        int indiceAleatorio = r.nextInt(opciones.length);
        String computadora = opciones[indiceAleatorio];

        System.out.println("La computadora eligió: " + computadora);

        String resultado = "";

        if (eleccion.equals(computadora)) {
            resultado = "Empate";
        } else if ((eleccion.equals("piedra") && computadora.equals("tijera")) ||
                (eleccion.equals("papel") && computadora.equals("piedra")) ||
                (eleccion.equals("tijera") && computadora.equals("papel"))) {
            resultado = "Ganaste!";
        } else {
            resultado = "Perdiste";
        }

        System.out.println(resultado);
    }
}
