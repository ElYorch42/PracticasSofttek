package com.softtek.mayo10.controlador;


import com.softtek.mayo10.dto.ProductoDTO;
import com.softtek.mayo10.modelo.Producto;
import com.softtek.mayo10.servicio.ProductosServicio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/productos")
public class ControladorProductos {
    @Autowired
    private ProductosServicio servicio;


    @GetMapping
    public ResponseEntity<List<ProductoDTO>> obtenerTodos() {
        List<Producto> listaBBDD = servicio.consultarTodos();
        List<ProductoDTO> listaDTO = new ArrayList<>();
        for (Producto producto:listaBBDD) {
            ProductoDTO productoDTO = new ProductoDTO();
            listaDTO.add(productoDTO.castProdcutoADTO(producto));
        }
        return new ResponseEntity<>(listaDTO,HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductoDTO> obtenerUno(@PathVariable int id) {
        Producto producto = servicio.consultarUno(id);
        return new ResponseEntity<>((new ProductoDTO()).castProdcutoADTO(producto), HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<ProductoDTO> insertarProducto(@Valid @RequestBody ProductoDTO productoDTO) {
        Producto producto = productoDTO.castProducto();
        servicio.insertar(producto);
        return new ResponseEntity<>(productoDTO.castProdcutoADTO(producto), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<ProductoDTO> actualizarProducto(@Valid @RequestBody ProductoDTO productoDTO) {
        Producto producto = productoDTO.castProducto();
        servicio.modificar(producto);
        return new ResponseEntity<>(productoDTO.castProdcutoADTO(producto), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> borrarProducto(@PathVariable int id) {
        servicio.eliminar(id);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
