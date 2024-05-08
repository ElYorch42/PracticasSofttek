package com.softtek.mayo7.repositorio;

import com.softtek.mayo7.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductosRepo extends JpaRepository<Producto, Integer> {
}
