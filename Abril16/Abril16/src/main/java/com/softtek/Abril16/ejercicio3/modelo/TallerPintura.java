package com.softtek.ejercicio4.modelo;

public class TallerPintura implements ITaller{

    public TallerPintura() {
    }

    @Override
    public String reparar(Coche c) {
        return "coche "+c.getModelo()+" matricula:"+c.getMatricula()+" repintado";
    }
}
