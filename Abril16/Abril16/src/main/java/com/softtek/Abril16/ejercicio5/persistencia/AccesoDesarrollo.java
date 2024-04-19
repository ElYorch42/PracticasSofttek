package com.softtek.ejercicio6.persistencia;

import com.softtek.ejercicio6.modelo.Cliente;

public class AccesoDesarrollo implements IDAO{
    @Override
    public String insertar(Cliente c1) {
        return "el cliente "+ c1.getNombre()+" nif:"+ c1.getNif()+" ha sido insertado en desarrollo";
    }
}
