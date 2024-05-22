package com.softtek.mayo20.repositorio;

import com.softtek.mayo20.modelo.Mascota;

import java.util.Optional;

public interface MascotaRepository {
    Mascota guardar(Mascota mascota);
    Optional<Mascota> findById(Integer id);
    void deleteById(Integer id);
}
