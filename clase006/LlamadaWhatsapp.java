/*Arma un programa que permita llamar a una persona por Whatsapp. Es similar al anterior.
Pídele al usuario que ingrese un número de telefono sin espacios, por ejemplo: 5493541539405
Después muestra en consola la concatenación de:
“https://api.whatsapp.com/send?phone=” + telefono*/

package clase006;

import java.util.Scanner;

public class LlamadaWhatsapp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa un número de teléfono: ");
        String telefono = sc.nextLine();

        String url = "https://api.whatsapp.com/send?phone=" + telefono;

        System.out.println("URL para hacer una llamada por WhatsApp: " + url);
    }
}
