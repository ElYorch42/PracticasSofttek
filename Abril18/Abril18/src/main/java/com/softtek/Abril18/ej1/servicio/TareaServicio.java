package com.softtek.Abril18.ej1.servicio;

import com.softtek.Abril18.ej1.modelo.Tarea;
import com.softtek.Abril18.ej1.repo.ITareaRepo;
import com.softtek.Abril18.ej1.repo.TareaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TareaServicio implements ITareaServicio{

    @Autowired
    private ITareaRepo repo;


    @Override
    public Tarea obtenerTarea() {
        return repo.obtenerTarea();
    }

    @Override
    public Tarea crearTarea(Tarea t) {
        return repo.crearTarea(t);
    }

    @Override
    public void eliminarTarea(int id) {
        repo.eliminarTarea(id);
    }
}
