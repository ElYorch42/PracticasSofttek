package com.softtek.ejercicio4.modelo;

public class SeguroCoche {
    private ITaller taller;
    private String aseguradora;

    public SeguroCoche(ITaller taller, String aseguradora) {
        this.taller = taller;
        this.aseguradora = aseguradora;
    }

    public SeguroCoche() {
    }

    public String reparar(Coche coche) {
        return taller.reparar(coche);
    }

    public ITaller getTaller() {
        return taller;
    }

    public void setTaller(ITaller taller) {
        this.taller = taller;
    }

    public String getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(String aseguradora) {
        this.aseguradora = aseguradora;
    }
}
