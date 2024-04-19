package com.softtek.Abril18.ej1.servicio;

import com.softtek.Abril18.ej1.modelo.Tarea;

public interface ITareaServicio {
    Tarea obtenerTarea();
    Tarea crearTarea(Tarea t);
    void eliminarTarea(int id);
}
