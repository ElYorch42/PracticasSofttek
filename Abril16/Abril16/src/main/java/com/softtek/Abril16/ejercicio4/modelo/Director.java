package com.softtek.Abril16.ejercicio4.modelo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@AllArgsConstructor
public class Director implements IEmpleado{
    @Autowired
    private IInforme informe;

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
