/*Arma un buscador de tweets para Twitter.com. Es bastante similar al anterior.
Pídele al usuario que ingrese el nombre de una celebridad (de una sola palabra), por ejemplo: “Messi”.
Después muestra en consola la concatenación de:
“https://twitter.com/search?q=” + palabra*/

package clase006;

import java.util.Scanner;

public class BuscadorTweetsTwitter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el nombre de una celebridad: ");
        String palabra = sc.nextLine();

        String url = "https://twitter.com/search?q=" + palabra;

        System.out.println("URL del buscador de tweets de celebridades: " + url);
    }
}
