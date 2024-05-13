package com.softtek.mayo10.servicio;


import com.softtek.mayo10.modelo.Producto;
import com.softtek.mayo10.repositorio.IGenericoRepo;
import com.softtek.mayo10.repositorio.IProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductosServicio extends CRUDImpl<Producto, Integer> implements IProductosServicio{

    @Autowired
    private IProductosRepo repo;

    @Override
    protected IGenericoRepo<Producto, Integer> getRepo() {
        return repo;
    }

}
