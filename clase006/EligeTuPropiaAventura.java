/*Crear un programa que cuente una historia al estilo de “Elige tu propia Aventura”.

Los libros de “Elige tu propia aventura” eran historias interactivas,
en el que el lector en un momento podía elegir a qué página ir.
El ejercicio consiste en hacer un pequeño cuento de este estilo. Por ejemplo:

Es una noche estrellada, te encuentras en un bosque misterioso:
1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante
2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora

El usuario escoge “2”:
Decides seguir el sendero iluminado hacia la pequeña cabaña acogedora.
Al llegar a la cabaña, te das cuenta de que hay dos puertas:
1) Entras por la puerta de la izquierda
2) Optas por la puerta de la derecha

El usuario escoge “1”:
Al abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos.
Te maravillas con las joyas y los objetos preciosos que llenan la sala.
Te das cuenta de que has encontrado el legendario tesoro perdido del bosque.
Con tu corazón lleno de emoción y riquezas,
decides regresar a casa para compartir tu increíble aventura con el mundo.
¡Felicidades, has tenido un final exitoso en tu búsqueda!*/

package clase006;

import java.util.Scanner;

public class EligeTuPropiaAventura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Es una noche estrellada, te encuentras en un bosque misterioso:");
        System.out.println("1) Exploras la oscuridad en busca de la fuente de un susurro escalofriante");
        System.out.println("2) Sigues el sendero iluminado hacia una pequeña cabaña acogedora");

        System.out.print("\nElige una opción: ");
        int opcion1 = sc.nextInt();
        sc.nextLine();

        if (opcion1 == 2) {
            System.out.println("\nDecides seguir el sendero iluminado hacia la pequeña cabaña acogedora.\nAl llegar a la cabaña, te das cuenta de que hay dos puertas:");
            System.out.println("1) Entras por la puerta de la izquierda");
            System.out.println("2) Optas por la puerta de la derecha");

            System.out.print("\nElige una opción: ");
            int opcion2 = sc.nextInt();
            sc.nextLine();

            if (opcion2 == 1) {
                System.out.println("\nAl abrir la puerta de la izquierda, te encuentras con una habitación llena de tesoros brillantes y mágicos.\nTe maravillas con las joyas y los objetos preciosos que llenan la sala.\nTe das cuenta de que has encontrado el legendario tesoro perdido del bosque.\nCon tu corazón lleno de emoción y riquezas, decides regresar a casa para compartir tu increíble aventura con el mundo.\n¡Felicidades, has tenido un final exitoso en tu búsqueda!");
            } else {
                System.out.println("\nHas optado por la puerta de la derecha.\nSigues el camino y te encuentras en una sala vacía.\nTe das cuenta de que no hay mucho más que explorar aquí.\nDecides regresar al bosque y continuar tu aventura.");
            }
        } else {
            System.out.println("\nDecides explorar la oscuridad en busca del susurro escalofriante.\nTe adentras en el bosque y encuentras un antiguo pozo.\nSin embargo, algo te dice que es mejor no acercarte demasiado.\nDecides dar media vuelta y seguir el sendero hacia la cabaña acogedora.\nLa aventura continúa...");
        }
    }
}
