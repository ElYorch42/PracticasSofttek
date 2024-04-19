package com.softtek.Abril18.ej1.repo;

import com.softtek.Abril18.ej1.modelo.Tarea;

public interface ITareaRepo {
    Tarea obtenerTarea();
    Tarea crearTarea(Tarea t);
    void eliminarTarea(int id);
}
