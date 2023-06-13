package com.atlacademy.proyectoclase8;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/generar-password")
    public String generarPassword() {
        String password = generatePassword();
        return password;
    }

    private String generatePassword() {

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        /* StringBuilder: clase en Java que se utiliza para construir y manipular cadenas de caracteres de manera eficiente
        * ya que con String no se puede modificar una vez creada*/
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < 8; i++) {
            int index = (int) (Math.random() * chars.length());
            /*metodo append de la clase StringBuilder: se utiliza para agregar nuevos caracteres o cadenas al final de la cadena existente*/
            password.append(chars.charAt(index));
        }
        return password.toString();
    }
}
