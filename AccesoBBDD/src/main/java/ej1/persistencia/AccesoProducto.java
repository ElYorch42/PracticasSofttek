package ej1.persistencia;

import ej1.modelo.Producto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccesoProducto extends Conexion{

    public Producto obtenerUno(int id) throws SQLException, ClassNotFoundException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "Select product_id, product_name, unit_price, units_in_stock from products where product_id = "+id;

        abrirConexion();
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);

        resultado.next();
        Producto producto = new Producto(resultado.getInt("product_id"),
                    resultado.getString("product_name"),
                    resultado.getDouble("unit_price"),
                    resultado.getInt("units_in_stock"));

        return producto;
    }

    public List<Producto> obtenerTodos() throws SQLException, ClassNotFoundException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "Select product_id, product_name, unit_price, units_in_stock from products";
        List<Producto> productos = new ArrayList<>();
        abrirConexion();
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);

        while (resultado.next()) {
            productos.add(new Producto(resultado.getInt("product_id"),
            resultado.getString("product_name"),
            resultado.getDouble("unit_price"),
            resultado.getInt("units_in_stock")));
        }

        return productos;
    }

    public void crearUno(int id, String nombre, double precio, int unidades, int proveedorId, int categoriaId, String cantidadPorUnidad, int reOrderlevel, int discontinued) throws SQLException, ClassNotFoundException {
        Statement sentencia;
        ResultSet resultado;
        String sql = "INSERT INTO products (product_id, product_name, supplier_id, category_id, quantity_per_unit, unit_price, units_in_stock, reorder_level, discontinued) VALUES (" +
                id + ", '" + nombre + "', " + proveedorId + ", " + categoriaId + ", '" + cantidadPorUnidad + "', " + precio + ", " + unidades + ", " + reOrderlevel + ", " + discontinued + ")";
        abrirConexion();
        sentencia = miConexion.createStatement();
        int filasafectadas =sentencia.executeUpdate(sql);

    }
}
