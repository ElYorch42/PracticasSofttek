package stream.persistencia;

import lombok.NoArgsConstructor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@NoArgsConstructor
public class Conexion {

    protected Connection miConexion;

    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        miConexion = DriverManager.getConnection(
                "jdbc:postgresql://127.0.0.1:5432/Northwind",
                "postgres","1234");
        System.out.println("Exito al abrir la conexion");
    }


}
