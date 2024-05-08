package com.softtek.mayo7Refactorizacion.servicio;

import com.softtek.mayo7Refactorizacion.repositorio.IGenericoRepo;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;

public abstract class CRUDImpl<T, ID> implements ICRUD<T, ID>{


    protected abstract IGenericoRepo<T, ID> getRepo();


    @Override
    public List<T> consultarTodos() {
        return getRepo().findAll();
    }

    @Override
    public T consultarUno(ID id) {
        return getRepo().findById(id).orElse(null);
    }

    @Override
    public T insertar(T t) {
        return getRepo().save(t);
    }

    @Override
    public T modificar(T t) {
        return getRepo().save(t);
    }

    @Override
    public void eliminar(ID id) {
        getRepo().deleteById(id);
    }
}
