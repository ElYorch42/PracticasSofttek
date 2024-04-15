package stream.persistencia;

import stream.modelo.Ordenes;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AccesoOrdenes extends Conexion{
    public List<Ordenes> obtenerTodos() throws SQLException, ClassNotFoundException {
        ResultSet resultado;
        String sql = "Select order_id, product_id, unit_price, quantity, discount from order_details";
        List<Ordenes> ordenes = new ArrayList<>();
        abrirConexion();
        PreparedStatement preparedStatement = miConexion.prepareStatement(sql);
        resultado = preparedStatement.executeQuery();

        while (resultado.next()) {
            ordenes.add(new Ordenes(
                    resultado.getInt("order_id"),
                    resultado.getInt("product_id"),
                    resultado.getDouble("unit_price"),
                    resultado.getInt("quantity"),
                    resultado.getDouble("discount")
            ));
        }
        return ordenes;
    }
}
