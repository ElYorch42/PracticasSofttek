package Ej1.persistencia;

import Ej1.modelo.Empleado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccesoEmpleado extends Conexion{

    public Empleado obtenerUno(int id) throws SQLException, ClassNotFoundException {
        ResultSet resultado;
        String sql = "Select employee_id, first_name, last_name, reports_to from employees where employee_id = ?";
        abrirConexion();

        PreparedStatement preparedStatement = miConexion.prepareStatement(sql);
        preparedStatement.setInt(1, id);
        resultado = preparedStatement.executeQuery();

        Empleado empleado = null;
        resultado.next();
        empleado = new Empleado(
                resultado.getInt("employee_id"),
                resultado.getString("first_name"),
                resultado.getString("last_name"),
                resultado.getInt("reports_to")
        );

        return empleado;
    }

    public List<Empleado> obtenerTodos() throws SQLException, ClassNotFoundException {
        ResultSet resultado;
        String sql = "Select employee_id, first_name, last_name, reports_to from employees";
        List<Empleado> empleados = new ArrayList<>();
        abrirConexion();
        PreparedStatement preparedStatement = miConexion.prepareStatement(sql);
        resultado = preparedStatement.executeQuery();

        while (resultado.next()) {
            empleados.add(new Empleado(
                    resultado.getInt("employee_id"),
                    resultado.getString("first_name"),
                    resultado.getString("last_name"),
                    resultado.getInt("reports_to")
            ));
        }
        return empleados;
    }

    public String crearUno(Empleado empleado) throws SQLException, ClassNotFoundException {        String sql = "INSERT INTO employees (employee_id, first_name, last_name, reports_to) VALUES (?, ?, ?, ?)";
        abrirConexion();
        PreparedStatement preparedStatement = miConexion.prepareStatement(sql);
        preparedStatement.setInt(1, empleado.getEmpleadoId());
        preparedStatement.setString(2, empleado.getNombre());
        preparedStatement.setString(3, empleado.getApellidos());
        preparedStatement.setInt(4, empleado.getReportaAJefe());
        preparedStatement.executeUpdate();
        return "Empleado creado";
    }

    public String modificarUno(Empleado empleado) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE employees SET first_name = ?, last_name = ?, reports_to = ? WHERE employee_id = ?";

        abrirConexion();
        PreparedStatement preparedStatement = miConexion.prepareStatement(sql);

        preparedStatement.setString(1, empleado.getNombre());
        preparedStatement.setString(2, empleado.getApellidos());
        preparedStatement.setInt(3, empleado.getReportaAJefe());
        preparedStatement.setInt(4, empleado.getEmpleadoId());
        preparedStatement.executeUpdate();
        return "empleado modificado";
    }
    public String BorrarUno(Empleado empleado) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM employees WHERE employee_id = ?";
        abrirConexion();
        PreparedStatement preparedStatement = miConexion.prepareStatement(sql);
        preparedStatement.setInt(1, empleado.getEmpleadoId());
        preparedStatement.executeUpdate();
        return "Empleado borrado";
    }
}
