package org.example.ejercicio2.vista;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        List<Integer> listaInteger = new ArrayList<>();
        listaInteger.add(1);
        int posicion= 0;

        Optional<List<Integer>> optionalIntegers= Optional.of(listaInteger);


        if (optionalIntegers.isPresent() && listaInteger.size() > posicion){
            System.out.printf(String.valueOf("\n"+listaInteger.get(posicion)));

        } else {
            System.out.println("\nsdajsidasd");
        }
    }
}
