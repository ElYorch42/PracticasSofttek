package com.softtek.ejercicio5.vista;

import com.softtek.ejercicio5.modelo.InformeTrimestre1;
import com.softtek.ejercicio5.modelo.InformeTrimestre2;
import com.softtek.ejercicio5.modelo.Secretario;

public class Main {
    public static void main(String[] args) {
        InformeTrimestre1 informeTrimestre1 = new InformeTrimestre1("detalles1");
        InformeTrimestre2 informeTrimestre2 = new InformeTrimestre2("detalles2");
        Secretario secretario = new Secretario(informeTrimestre1,"microsoft","microsoft@ejemplo.com");

        System.out.println(secretario.getInforme());
        System.out.println(secretario.getTareas());


    }
}
