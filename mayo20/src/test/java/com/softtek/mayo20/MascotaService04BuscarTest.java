package com.softtek.mayo20;

import com.softtek.mayo20.modelo.Mascota;
import com.softtek.mayo20.modelo.Propietario;
import com.softtek.mayo20.repositorio.MascotaRepository;
import com.softtek.mayo20.repositorio.MascotaRepositoryImpl;
import com.softtek.mayo20.servicio.ExternalService;
import com.softtek.mayo20.servicio.ExternalServiceImpl;
import com.softtek.mayo20.servicio.MascotaService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MascotaService04BuscarTest {
    MascotaService mascotaService;

    @Test
    @DisplayName("Registrar Macota correctamente")
    void testBuscarMascotaCorrectamente() {
        //arrange
        MascotaRepository mascotaRepository = new MascotaRepositoryImpl();
        ExternalService externalService = new ExternalServiceImpl();
        mascotaService = new MascotaService(mascotaRepository, externalService);

        Propietario propietario = new Propietario("Danny","Lima","987654321");
        Mascota mascota = new Mascota();
        mascota.setNombre("Garfield");
        mascota.setPropietario(propietario);
        //act

    }
}
