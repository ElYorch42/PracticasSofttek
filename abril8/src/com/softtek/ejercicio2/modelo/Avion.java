package com.softtek.ejercicio2.modelo;

public class Avion extends Vehiculo implements ObjetoVolador{

    private String nombreAvion;

    public Avion(String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }

    @Override
    public String despegar() {
        return nombreAvion+" despega del aeropuerto";
    }

    @Override
    public String aterrizar() {
        return nombreAvion+" aterriza en el aeropuerto";
    }

    @Override
    public String volar() {
        return nombreAvion+" vuela en el cielo";
    }

    public String getNombreAvion() {
        return nombreAvion;
    }

    public void setNombreAvion(String nombreAvion) {
        this.nombreAvion = nombreAvion;
    }
}
