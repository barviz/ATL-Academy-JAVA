/*Hacer nuevamente el juego de Piedra, Papel o Tijeras
pero utilizando funciones, arreglos y bucles*/

package clase008;

import java.util.Scanner;
import java.util.Random;

public class PiedraPapelTijera {

    public static void main(String[] args) {
        jugarPiedraPapelTijera();
    }

    public static void jugarPiedraPapelTijera() {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        System.out.println("Piedra Papel o Tijera!");

        String[] opciones = {"piedra", "papel", "tijera"};

        boolean jugarDeNuevo = true;

        while (jugarDeNuevo) {

            System.out.print("Elegí piedra, papel o tijera (o 'salir' para terminar el juego): ");
            String eleccion = sc.nextLine().toLowerCase();

            if (eleccion.equals("salir")) {
                break;
            }

            if (!esEleccionValida(eleccion)) {
                System.out.println("Elegiste una opción inválida. Intenta de nuevo.");
                continue;
            }

            int indiceAleatorio = r.nextInt(opciones.length);
            String computadora = opciones[indiceAleatorio];

            System.out.println("La computadora eligió: " + computadora);

            String resultado = determinarGanador(eleccion, computadora);

            System.out.println(resultado);

            System.out.print("¿Quieres jugar de nuevo? (s/n): ");
            String respuesta = sc.nextLine().toLowerCase();

            if (!respuesta.equals("s")) {
                jugarDeNuevo = false;
            }
        }

        System.out.println("¡Gracias por jugar!");
    }

    public static boolean esEleccionValida(String eleccion) {

        String[] opciones = {"piedra", "papel", "tijera"};

        for (String opcion : opciones) {
            if (opcion.equals(eleccion)) {
                return true;
            }
        }

        return false;
    }

    public static String determinarGanador(String eleccionUsuario, String eleccionComputadora) {

        if (eleccionUsuario.equals(eleccionComputadora)) {
            return "Empate";
        } else if ((eleccionUsuario.equals("piedra") && eleccionComputadora.equals("tijera")) ||
                (eleccionUsuario.equals("papel") && eleccionComputadora.equals("piedra")) ||
                (eleccionUsuario.equals("tijera") && eleccionComputadora.equals("papel"))) {
            return "¡Ganaste!";
        } else {
            return "Perdiste";
        }
    }
}
