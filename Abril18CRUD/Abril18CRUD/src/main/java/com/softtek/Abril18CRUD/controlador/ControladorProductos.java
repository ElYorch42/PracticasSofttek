package com.softtek.Abril18CRUD.controlador;

import com.softtek.Abril18CRUD.modelo.Producto;
import com.softtek.Abril18CRUD.servicio.ProductosServicio;
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
        return servicio.insertarProducto(producto);
    }
    @PutMapping
    public Producto actualizarProducto(@RequestBody Producto productos) throws SQLException, ClassNotFoundException {
        return servicio.actualizarProducto(productos);
    }
    @DeleteMapping("/{id}")
    public void borrarProducto(@PathVariable int id) throws SQLException, ClassNotFoundException {
        servicio.borrarProducto(id);
    }
}
