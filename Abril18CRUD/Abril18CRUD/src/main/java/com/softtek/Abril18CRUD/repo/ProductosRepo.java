package com.softtek.Abril18CRUD.repo;

import com.softtek.Abril18CRUD.modelo.Producto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductosRepo extends ConexionRepo implements IProductosRepo{


    @Override
    public List<Producto> obtenerTodos() throws ClassNotFoundException, SQLException {

        String sql = "Select product_id, product_name, unit_price, units_in_stock from products";
        List<Producto> productos = new ArrayList<>();
        abrirConexion();
        Statement sentencia = miConexion.createStatement();
        ResultSet resultado = sentencia.executeQuery(sql);

        while (resultado.next()) {
            productos.add(new Producto(resultado.getInt("product_id"),
                    resultado.getString("product_name"),
                    resultado.getDouble("unit_price"),
                    resultado.getInt("units_in_stock"),
                    resultado.getInt("category_id")));
        }

        return productos;
    }

    @Override
    public Producto obtenerUno(int id) throws ClassNotFoundException, SQLException {
        String sql = "Select product_id, product_name, unit_price, units_in_stock from products where product_id = "+id;
        List<Producto> productos = new ArrayList<>();
        abrirConexion();
        Statement sentencia = miConexion.createStatement();
        ResultSet resultado = sentencia.executeQuery(sql);

        resultado.next();
        Producto producto = new Producto(resultado.getInt("product_id"),
                resultado.getString("product_name"),
                resultado.getDouble("unit_price"),
                resultado.getInt("units_in_stock"),
                resultado.getInt("category_id"));
        return producto;
    }

    @Override
    public Producto insertarProducto(Producto producto) throws ClassNotFoundException, SQLException {
        if (!comprobarProducto(producto.getIdProducto())) {
            String sql = "INSERT INTO products (product_id, product_name, unit_price, units_in_stock,discontinued) " +
                    "VALUES " +
                    "(" + producto.getIdProducto() + ", '" + producto.getNombreProducto() + "', " + producto.getPrecioUnitario() + ", " + producto.getUnidadesStock() + ", 0)";


            abrirConexion();
            Statement sentencia = miConexion.createStatement();
            int resultado = sentencia.executeUpdate(sql);

            System.out.println("Correctamente añadido");
        }else {
            System.out.println("No se puede insertar porque ya existe");
        }

        return producto;
    }

    @Override
    public Producto actualizarProducto(Producto producto) throws ClassNotFoundException, SQLException {
        if (comprobarProducto(producto.getIdProducto())){
            String sql = "UPDATE products SET product_id=" + producto.getIdProducto() + ", product_name='" + producto.getNombreProducto() +
                    "', unit_price=" + producto.getPrecioUnitario() + ", units_in_stock=" + producto.getUnidadesStock() + " WHERE " +
                    "product_id=" + producto.getIdProducto();
            abrirConexion();
            Statement sentencia = miConexion.createStatement();
            int resultado = sentencia.executeUpdate(sql);

            System.out.println("Correctamente actualizado");}
        else {
            System.out.println("No existe el producto");
        }
        return producto;
    }

    @Override
    public void borrarProducto(int id) throws ClassNotFoundException, SQLException {
        if (comprobarProducto(id)) {

            String sql = "DELETE FROM products WHERE product_id=" + id;

            Statement sentencia = miConexion.createStatement();
            int filasAfectadas = sentencia.executeUpdate(sql);

            System.out.println("Borrado correctamente");
        }
        else {
            System.out.println("No existe producto");
        }
    }

    public boolean comprobarProducto(int idProducto) throws ClassNotFoundException, SQLException {
        abrirConexion();

        String sql = "Select COUNT(*) from products where product_id="+idProducto;

        Statement sentencia;
        ResultSet resultado;
        sentencia = miConexion.createStatement();
        resultado = sentencia.executeQuery(sql);
        resultado.next();

        int cantidadEncontrados = resultado.getInt(1);
        return cantidadEncontrados > 0;


    }
}
