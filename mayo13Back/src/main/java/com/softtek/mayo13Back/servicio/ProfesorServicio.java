package com.softtek.mayo13Back.servicio;

import com.softtek.mayo13Back.modelo.Profesor;
import com.softtek.mayo13Back.repositorio.IGenericoRepo;
import com.softtek.mayo13Back.repositorio.IProfesorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServicio extends CRUDImpl<Profesor, Integer> implements IProfesorServicio{

    @Autowired
    private IProfesorRepo repo;

    @Override
    protected IGenericoRepo<Profesor, Integer> getRepo() {
        return repo;
    }
}
