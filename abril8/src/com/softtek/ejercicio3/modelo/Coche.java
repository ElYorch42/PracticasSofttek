package com.softtek.ejercicio3.modelo;

public class Coche implements IVehiculo {

    private int deposito;

    public Coche(int deposito) {
        this.deposito = deposito;
    }

    @Override
    public String moverse() {

        if (deposito!=0) {
            return "El coche se mueve";
        } else {
            return "No hay gasolina en el deposito";
        }
    }

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }
}
