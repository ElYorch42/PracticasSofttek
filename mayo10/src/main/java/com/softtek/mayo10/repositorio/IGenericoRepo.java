package com.softtek.mayo10.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface IGenericoRepo<T, ID> extends JpaRepository<T, ID> {
}
