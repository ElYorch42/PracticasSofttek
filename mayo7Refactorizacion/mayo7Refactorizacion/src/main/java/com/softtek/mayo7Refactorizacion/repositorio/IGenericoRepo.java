package com.softtek.mayo7Refactorizacion.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenericoRepo<T, ID> extends JpaRepository<T, ID> {
}
