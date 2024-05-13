package com.softtek.mayo13Back.servicio;

import java.util.List;

public interface ICRUD<T, ID> {
    List<T> consultarTodos();

    T consultarUno(ID id);

    T insertar(T t);

    T modificar(T t);

    void eliminar(ID id);
}
