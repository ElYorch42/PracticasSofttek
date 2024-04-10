package ej1.vista;

import ej1.modelo.Producto;
import ej1.persistencia.AccesoProducto;
import ej1.persistencia.Conexion;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        try {
            conexion.abrirConexion();
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (SQLException e) {
            System.out.println(e);
        }

        AccesoProducto accesoProducto = new AccesoProducto();
        try {
            for (Producto producto: accesoProducto.obtenerTodos()) {
                System.out.println(producto);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            accesoProducto.crearUno(81,"prueba2",21.3,12,1,1,"cantidad",1,1);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(accesoProducto.obtenerUno(81));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
