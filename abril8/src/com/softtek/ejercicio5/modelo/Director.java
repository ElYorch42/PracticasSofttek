package com.softtek.ejercicio5.modelo;

public class Director implements IEmpleado{
    private IInforme informe;

    public Director(IInforme informe) {
        this.informe = informe;
    }

    public Director() {
    }

    @Override
    public String getTareas() {
        return "tareas Director";
    }
    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }
}
