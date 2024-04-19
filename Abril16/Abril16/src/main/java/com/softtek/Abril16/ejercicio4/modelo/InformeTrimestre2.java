package com.softtek.ejercicio5.modelo;

public class InformeTrimestre2 implements IInforme{

    private String detalles;

    public InformeTrimestre2(String detalles) {
        this.detalles = detalles;
    }

    public InformeTrimestre2() {
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
