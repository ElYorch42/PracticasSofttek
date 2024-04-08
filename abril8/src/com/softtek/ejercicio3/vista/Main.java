package com.softtek.ejercicio3.vista;

import com.softtek.ejercicio3.modelo.Coche;
import com.softtek.ejercicio3.modelo.Conductor;

public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche(500);
        Conductor conductor = new Conductor(coche);


        System.out.println(conductor.conducir());
        coche.setDeposito(0);
        conductor.setVehiculo(coche);
        System.out.println(conductor.conducir());
    }
}
