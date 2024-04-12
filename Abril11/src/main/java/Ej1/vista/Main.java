package Ej1.vista;

import Ej1.modelo.Empleado;
import Ej1.persistencia.AccesoEmpleado;
import Ej1.persistencia.Conexion;

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

        AccesoEmpleado accesoEmpleado = new AccesoEmpleado();
        try {
            for (Empleado empleado: accesoEmpleado.obtenerTodos()) {
                System.out.println(empleado);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(accesoEmpleado.obtenerUno(1));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Empleado empleado = new Empleado(10,"nombrep","apellidoP",2);
            System.out.println(accesoEmpleado.crearUno(empleado));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(accesoEmpleado.obtenerUno(10));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            Empleado empleado = new Empleado(10,"nombreMod","apellidoMod",2);
            System.out.println(accesoEmpleado.modificarUno(empleado));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(accesoEmpleado.obtenerUno(10));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Empleado empleado = new Empleado(10,"nombreMod","apellidoMod",5);
            System.out.println(accesoEmpleado.BorrarUno(empleado));
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
