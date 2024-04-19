package com.softtek.ejercicio5.modelo;

public class InformeTrimestre1 implements IInforme{

    private String detalles;

    public InformeTrimestre1(String detalles) {
        this.detalles = detalles;
    }

    public InformeTrimestre1() {
    }

    @Override
    public String getInforme() {
        return "Informe2: "+detalles;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
