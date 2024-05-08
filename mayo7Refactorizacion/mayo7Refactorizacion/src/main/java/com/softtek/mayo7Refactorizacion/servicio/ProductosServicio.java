package com.softtek.mayo7Refactorizacion.servicio;


import com.softtek.mayo7Refactorizacion.modelo.Producto;
import com.softtek.mayo7Refactorizacion.repositorio.IGenericoRepo;
import com.softtek.mayo7Refactorizacion.repositorio.IProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductosServicio extends CRUDImpl<Producto, Integer> implements IProductosServicio{

    @Autowired
    private IProductosRepo repo;

    @Override
    protected IGenericoRepo<Producto, Integer> getRepo() {
        return repo;
    }

}
