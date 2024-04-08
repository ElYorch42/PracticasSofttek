package com.softtek.ejercicio6.vista;

import com.softtek.ejercicio6.modelo.Cliente;
import com.softtek.ejercicio6.persistencia.AccesoDesarrollo;
import com.softtek.ejercicio6.persistencia.AccesoProduccion;
import com.softtek.ejercicio6.persistencia.ClienteDAO;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Manuel","39713971w");
        AccesoProduccion accesoProduccion = new AccesoProduccion();
        AccesoDesarrollo accesoDesarrollo = new AccesoDesarrollo();
        ClienteDAO clienteDAO = new ClienteDAO(accesoDesarrollo);

        System.out.println(clienteDAO.insertar(cliente));
        clienteDAO.setConexion(accesoProduccion);
        System.out.println(clienteDAO.insertar(cliente));

    }
}
