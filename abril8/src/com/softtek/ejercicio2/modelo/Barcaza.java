package com.softtek.ejercicio2.modelo;

public class Barcaza extends Vehiculo implements Nautico{

    private String nombreBarco;

    public Barcaza(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }

    @Override
    public String atracar() {
        return nombreBarco+" atraca en puerto";
    }

    @Override
    public String navegar() {
        return nombreBarco+" atraca en puerto";
    }

    public String getNombreBarco() {
        return nombreBarco;
    }

    public void setNombreBarco(String nombreBarco) {
        this.nombreBarco = nombreBarco;
    }
}
