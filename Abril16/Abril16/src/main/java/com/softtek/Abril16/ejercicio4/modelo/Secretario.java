package com.softtek.Abril16.ejercicio4.modelo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class Secretario implements IEmpleado{
    @Autowired
    private IInforme informe;
    private String empresa;
    private String email;

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
