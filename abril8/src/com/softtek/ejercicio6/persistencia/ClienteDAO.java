package com.softtek.ejercicio6.persistencia;

import com.softtek.ejercicio6.modelo.Cliente;

public class ClienteDAO {
    private IDAO conexion;

    public ClienteDAO(IDAO conexion) {
        this.conexion = conexion;
    }

    public ClienteDAO() {
    }

    public String insertar(Cliente c1){
        return conexion.insertar(c1);
    }

    public IDAO getConexion() {
        return conexion;
    }

    public void setConexion(IDAO conexion) {
        this.conexion = conexion;
    }
}
