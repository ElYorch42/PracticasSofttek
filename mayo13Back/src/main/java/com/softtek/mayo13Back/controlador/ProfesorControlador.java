package com.softtek.mayo13Back.controlador;

import com.softtek.mayo13Back.modelo.Profesor;
import com.softtek.mayo13Back.servicio.ProfesorServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/profesores")
@CrossOrigin(origins = "http://localhost:4200")
public class ProfesorControlador {

    @Autowired
    private ProfesorServicio servicio;


    @GetMapping
    public List<Profesor> obtenerTodos() throws SQLException, ClassNotFoundException {
        return servicio.consultarTodos();
    }
    @GetMapping("/{id}")
    public Profesor obtenerUno(@PathVariable int id) throws SQLException, ClassNotFoundException {
        return servicio.consultarUno(id);
    }
    @PostMapping
    public Profesor insertarProducto(@RequestBody Profesor profesor) throws SQLException, ClassNotFoundException {
        return servicio.insertar(profesor);
    }
    @PutMapping
    public Profesor actualizarProducto(@RequestBody Profesor profesor) throws SQLException, ClassNotFoundException {
        return servicio.modificar(profesor);
    }
    @DeleteMapping("/{id}")
    public void borrarProducto(@PathVariable int id) throws SQLException, ClassNotFoundException {
        servicio.eliminar(id);
    }
}
