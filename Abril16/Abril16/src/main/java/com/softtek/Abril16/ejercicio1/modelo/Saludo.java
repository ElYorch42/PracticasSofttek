package com.softtek.Abril16.ejercicio1.modelo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Saludo {
    private String mensaje;

    public String saludar() {
        return "saludo";
    }

}
