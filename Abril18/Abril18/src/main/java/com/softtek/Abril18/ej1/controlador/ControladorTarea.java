package com.softtek.Abril18.ej1.controlador;

import com.softtek.Abril18.ej1.modelo.Tarea;
import com.softtek.Abril18.ej1.servicio.ITareaServicio;
import com.softtek.Abril18.ej1.servicio.TareaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tareas")
public class ControladorTarea {
    @Autowired
    private ITareaServicio servicio;

    @GetMapping
    public Tarea obtenerTarea() {
        return servicio.obtenerTarea();
    }

    @PostMapping
    public Tarea crearTarea(@RequestBody Tarea t) {
        return servicio.crearTarea(t);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable int id) {
        servicio.eliminarTarea(id);
    }
}
