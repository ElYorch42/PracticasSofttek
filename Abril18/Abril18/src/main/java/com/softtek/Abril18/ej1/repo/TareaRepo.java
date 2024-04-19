package com.softtek.Abril18.ej1.repo;

import com.softtek.Abril18.ej1.modelo.Tarea;
import org.springframework.stereotype.Repository;

@Repository
public class TareaRepo implements ITareaRepo{

    @Override
    public Tarea obtenerTarea() {
        return new Tarea(1,"Descripcion");
    }

    @Override
    public Tarea crearTarea(Tarea t) {
        t.setIdTarea(2);
        return t;
    }

    @Override
    public void eliminarTarea(int id) {

    }
}
