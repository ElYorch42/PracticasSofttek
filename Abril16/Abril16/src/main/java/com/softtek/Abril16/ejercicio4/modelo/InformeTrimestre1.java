package com.softtek.Abril16.ejercicio4.modelo;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
@AllArgsConstructor
public class InformeTrimestre1 implements IInforme{

    private String detalles;

    @Override
    public String getInforme() {
        return "Informe: "+detalles;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
}
