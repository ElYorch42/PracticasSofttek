package com.softtek.Abril16.ejercicio3.modelo;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public class TallerMecanica implements ITaller {


    public String reparar(Coche c) {
        return "coche "+c.getModelo()+" matricula:"+c.getMatricula()+" reparado";
    }
}
