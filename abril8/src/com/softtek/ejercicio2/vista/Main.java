package com.softtek.ejercicio2.vista;

import com.softtek.ejercicio2.modelo.Barcaza;
import com.softtek.ejercicio2.modelo.Helicoptero;
import com.softtek.ejercicio2.modelo.Hidroavion;

public class Main {
    public static void main(String[] args) {
        Hidroavion hidroavion = new Hidroavion("Hidro-avion");
        Helicoptero helicoptero = new Helicoptero("helicoptero");
        Barcaza barcaza = new Barcaza("barcaza");

        System.out.println(hidroavion.atracar());
        System.out.println(hidroavion.navegar());
        System.out.println(hidroavion.aterrizar());
        System.out.println(hidroavion.despegar());
        System.out.println(hidroavion.volar());
    }
}
