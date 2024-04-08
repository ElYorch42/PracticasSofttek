package com.softtek.ejercicio4.vista;

import com.softtek.ejercicio4.modelo.Coche;
import com.softtek.ejercicio4.modelo.SeguroCoche;
import com.softtek.ejercicio4.modelo.TallerMecanica;
import com.softtek.ejercicio4.modelo.TallerPintura;

public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("54lv","Hyundai");
        Coche coche2 = new Coche("79ki","Ford");
        TallerMecanica tallerMecanica = new TallerMecanica();
        TallerPintura tallerPintura = new TallerPintura();
        SeguroCoche seguroCoche = new SeguroCoche(tallerMecanica,"Ocaso");


        System.out.println(seguroCoche.reparar(coche1));
        seguroCoche.setTaller(tallerPintura);
        System.out.println(seguroCoche.reparar(coche2));

    }
}
