package com.softtek.Abril18CRUD.servicio;

import com.softtek.Abril18CRUD.modelo.Producto;
import com.softtek.Abril18CRUD.repo.IProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProductosServicio implements IProductosServicio{

    @Autowired
    private IProductosRepo repo;

    @Override
    public List<Producto> obtenerTodos() throws ClassNotFoundException, SQLException {
        return repo.obtenerTodos();
    }

    @Override
    public Producto obtenerUno(int id) throws ClassNotFoundException, SQLException {
        return repo.obtenerUno(id);
    }

    @Override
    public Producto insertarProducto(Producto producto) throws ClassNotFoundException, SQLException {
        return repo.insertarProducto(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto) throws ClassNotFoundException, SQLException {
        return repo.actualizarProducto(producto);
    }

    @Override
    public void borrarProducto(int id) throws ClassNotFoundException, SQLException {
        repo.borrarProducto(id);
    }
}
