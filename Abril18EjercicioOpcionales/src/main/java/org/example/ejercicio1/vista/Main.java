package org.example.ejercicio1.vista;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String usuario = teclado.next();
        Optional<String> usuarioValido = Optional.ofNullable(usuario);

        if (usuarioValido.isPresent()) {
            System.out.println("usuario valido");
        } else {
            System.out.println("usuario no valido");
        }
    }
}
