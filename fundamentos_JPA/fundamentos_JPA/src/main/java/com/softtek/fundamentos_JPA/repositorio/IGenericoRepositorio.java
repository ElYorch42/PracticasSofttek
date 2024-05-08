package com.softtek.fundamentos_JPA.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenericoRepositorio<T, ID> extends JpaRepository<T, ID> {
}
