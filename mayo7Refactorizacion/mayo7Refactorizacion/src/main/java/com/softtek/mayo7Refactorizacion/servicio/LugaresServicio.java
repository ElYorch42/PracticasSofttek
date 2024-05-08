package com.softtek.mayo7Refactorizacion.servicio;


import com.softtek.mayo7Refactorizacion.modelo.Lugar;
import com.softtek.mayo7Refactorizacion.repositorio.IGenericoRepo;
import com.softtek.mayo7Refactorizacion.repositorio.ILugaresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LugaresServicio extends CRUDImpl<Lugar, Integer> implements ILugaresServicio{

    @Autowired
    private ILugaresRepo repo;

    @Override
    protected IGenericoRepo<Lugar, Integer> getRepo() {
        return repo;
    }

}
