package com.softtek.ejercicio5.modelo;

public class Secretario implements IEmpleado{
    private IInforme informe;
    private String empresa;
    private String email;

    public Secretario(IInforme informe, String empresa, String email) {
        this.informe = informe;
        this.empresa = empresa;
        this.email = email;
    }

    public Secretario() {
    }

    @Override
    public String getTareas() {
        return "tareas secretario";
    }
    @Override
    public String getInforme() {
        return informe.getInforme();
    }

    public void setInforme(IInforme informe) {
        this.informe = informe;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
