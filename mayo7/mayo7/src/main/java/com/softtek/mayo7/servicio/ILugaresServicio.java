package com.softtek.mayo7.servicio;



import com.softtek.mayo7.modelo.Lugar;
import com.softtek.mayo7.modelo.Producto;

import java.util.List;

public interface ILugaresServicio {

    List<Lugar> obtenerTodos();

    Lugar obtenerUno(int id);

    Lugar insertar(Lugar lugar);

    Lugar actualizar(Lugar lugar);

    void eliminar(int id);
}
