package com.softtek.ejercicio2.modelo;

public class Hidroavion extends Avion implements Nautico{

    public Hidroavion(String nombreAvion) {
        super(nombreAvion);
    }

    @Override
    public String atracar() {
        return getNombreAvion()+" atraca en puerto";
    }

    @Override
    public String navegar() {
        return getNombreAvion()+" atraca en puerto";
    }
}
