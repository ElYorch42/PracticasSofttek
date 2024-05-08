package com.softtek.mayo7.servicio;



import com.softtek.mayo7.modelo.Producto;

import java.util.List;

public interface IProductosServicio {

    List<Producto> obtenerTodos();

    Producto obtenerUno(int id);

    Producto insertar(Producto producto);

    Producto actualizar(Producto producto);

    void eliminar(int id);
}
