package com.softtek.ejercicio5.modelo;

public class Jefe implements  IEmpleado{

    private IInforme informe;

    public Jefe(IInforme informe) {
        this.informe = informe;
    }

    public Jefe() {
    }

    @Override
    public String getTareas() {
        return "tareas Jefe";
    }
    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }
}
