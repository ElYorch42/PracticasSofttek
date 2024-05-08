package com.softtek.Abril18CRUD.servicio;

import com.softtek.Abril18CRUD.modelo.Producto;
import com.softtek.Abril18CRUD.repo.IProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.List;

public interface IProductosServicio {

    public List<Producto> obtenerTodos() throws ClassNotFoundException, SQLException;

    public Producto obtenerUno(int id) throws ClassNotFoundException, SQLException;

    public Producto insertarProducto(Producto producto) throws ClassNotFoundException, SQLException;

    public Producto actualizarProducto(Producto producto) throws ClassNotFoundException, SQLException;

    public void borrarProducto(int id) throws ClassNotFoundException, SQLException;
}
