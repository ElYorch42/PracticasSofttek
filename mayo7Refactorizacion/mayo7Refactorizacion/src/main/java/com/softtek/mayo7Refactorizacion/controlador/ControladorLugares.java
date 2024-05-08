package com.softtek.mayo7Refactorizacion.controlador;


import com.softtek.mayo7Refactorizacion.modelo.Lugar;
import com.softtek.mayo7Refactorizacion.servicio.LugaresServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/lugares")
public class ControladorLugares {
    @Autowired
    private LugaresServicio servicio;


    @GetMapping
    public List<Lugar> obtenerTodos() throws SQLException, ClassNotFoundException {
        return servicio.consultarTodos();
    }
    @GetMapping("/{id}")
    public Lugar obtenerUno(@PathVariable int id) throws SQLException, ClassNotFoundException {
        return servicio.consultarUno(id);
    }
    @PostMapping
    public Lugar insertarLugar(@RequestBody Lugar producto) throws SQLException, ClassNotFoundException {
        return servicio.insertar(producto);
    }
    @PutMapping
    public Lugar actualizarLugar(@RequestBody Lugar productos) throws SQLException, ClassNotFoundException {
        return servicio.modificar(productos);
    }
    @DeleteMapping("/{id}")
    public void borrarLugar(@PathVariable int id) throws SQLException, ClassNotFoundException {
        servicio.eliminar(id);
    }
}
