package com.softtek.mayo7.servicio;


import com.softtek.mayo7.modelo.Producto;
import com.softtek.mayo7.repositorio.IProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ProductosServicio implements IProductosServicio{

    @Autowired
    private IProductosRepo repo;


    @Override
    public List<Producto> obtenerTodos() {
        return repo.findAll();
    }

    @Override
    public Producto obtenerUno(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Producto insertar(Producto producto) {
        return repo.save(producto);
    }

    @Override
    public Producto actualizar(Producto producto) {
        return repo.save(producto);
    }

    @Override
    public void eliminar(int id) {
        repo.deleteById(id);
    }
}
