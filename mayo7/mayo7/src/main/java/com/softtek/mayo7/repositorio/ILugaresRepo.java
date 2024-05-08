package com.softtek.mayo7.repositorio;

import com.softtek.mayo7.modelo.Lugar;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILugaresRepo extends JpaRepository<Lugar, Integer> {
}
