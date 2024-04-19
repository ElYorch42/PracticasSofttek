package com.softtek.Abril16.ejercicio3.modelo;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class TallerPintura implements ITaller{

    public String reparar(Coche c) {
        return "coche "+c.getModelo()+" matricula:"+c.getMatricula()+" repintado";
    }
}
