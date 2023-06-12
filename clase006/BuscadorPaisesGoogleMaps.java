/*Arma un buscador de países con Google Maps.
Primero, pidele al usuario que ingrese un país (Ej: Colombia).
Después muestra en consola la concatenación de:
“https://www.google.com/maps/search/” + pais
Entonces, cuando hagas click en el link que aparece en consola, te abrirá esa ubicación.
*/

package clase006;

import java.util.Scanner;

public class BuscadorPaisesGoogleMaps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre de un país: ");
        String pais = sc.nextLine();

        String url = "https://www.google.com/maps/search/" + pais;

        System.out.println("URL del buscador de países en Google Maps: " + url);
    }
}




