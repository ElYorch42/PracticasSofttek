package com.softtek.mayo7.servicio;


import com.softtek.mayo7.modelo.Lugar;
import com.softtek.mayo7.modelo.Producto;
import com.softtek.mayo7.repositorio.ILugaresRepo;
import com.softtek.mayo7.repositorio.IProductosRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LugaresServicio implements ILugaresServicio{

    @Autowired
    private ILugaresRepo repo;


    @Override
    public List<Lugar> obtenerTodos() {
        return repo.findAll();
    }

    @Override
    public Lugar obtenerUno(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public Lugar insertar(Lugar lugar) {
        return repo.save(lugar);
    }

    @Override
    public Lugar actualizar(Lugar lugar) {
        return repo.save(lugar);
    }

    @Override
    public void eliminar(int id) {
        repo.deleteById(id);
    }
}
