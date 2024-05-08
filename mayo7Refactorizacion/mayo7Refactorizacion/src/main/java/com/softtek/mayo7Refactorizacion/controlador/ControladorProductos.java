package com.softtek.mayo7.controlador;


import com.softtek.mayo7.modelo.Producto;
import com.softtek.mayo7.servicio.ProductosServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ControladorProductos {
    @Autowired
    private ProductosServicio servicio;


    @GetMapping
    public List<Producto> obtenerTodos() throws SQLException, ClassNotFoundException {
        return servicio.obtenerTodos();
    }
    @GetMapping("/{id}")
    public Producto obtenerUno(@PathVariable int id) throws SQLException, ClassNotFoundException {
        return servicio.obtenerUno(id);
    }
    @PostMapping
    public Producto insertarProducto(@RequestBody Producto producto) throws SQLException, ClassNotFoundException {
        return servicio.insertar(producto);
    }
    @PutMapping
    public Producto actualizarProducto(@RequestBody Producto productos) throws SQLException, ClassNotFoundException {
        return servicio.actualizar(productos);
    }
    @DeleteMapping("/{id}")
    public void borrarProducto(@PathVariable int id) throws SQLException, ClassNotFoundException {
        servicio.eliminar(id);
    }
}
