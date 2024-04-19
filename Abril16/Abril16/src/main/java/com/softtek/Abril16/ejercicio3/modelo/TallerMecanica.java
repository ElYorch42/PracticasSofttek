package com.softtek.ejercicio4.modelo;

public class TallerMecanica implements ITaller{

    public TallerMecanica() {
    }

    @Override
    public String reparar(Coche c) {
        return "coche "+c.getModelo()+" matricula:"+c.getMatricula()+" reparado";
    }
}
