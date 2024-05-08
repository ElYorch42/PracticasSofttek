package com.softtek.mayo7Refactorizacion.repositorio;

import com.softtek.mayo7Refactorizacion.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductosRepo<T, ID> extends IGenericoRepo<T, ID> {
}
