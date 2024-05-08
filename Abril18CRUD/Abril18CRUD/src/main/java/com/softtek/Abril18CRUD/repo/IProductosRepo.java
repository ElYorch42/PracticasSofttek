package com.softtek.Abril18CRUD.repo;

import com.softtek.Abril18CRUD.modelo.Producto;

import java.sql.SQLException;
import java.util.List;

public interface IProductosRepo {
    public List<Producto> obtenerTodos() throws ClassNotFoundException, SQLException;
    public Producto obtenerUno(int id) throws ClassNotFoundException, SQLException;
    public Producto insertarProducto(Producto producto) throws ClassNotFoundException, SQLException;
    public Producto actualizarProducto(Producto producto) throws ClassNotFoundException, SQLException;
    public void borrarProducto(int id) throws ClassNotFoundException, SQLException;
    int ultimoId() throws ClassNotFoundException, SQLException;
}
