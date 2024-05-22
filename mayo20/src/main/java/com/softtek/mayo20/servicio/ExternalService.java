package com.softtek.mayo20.servicio;

import com.softtek.mayo20.modelo.Mascota;

public interface ExternalService {

    boolean validarVacunas(Mascota mascota);
    boolean verificarRegistroMunicipal(Mascota mascota);
}
