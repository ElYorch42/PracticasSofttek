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

import static org.assertj.core.api.Assertions.assertThat;

public class MascotaService03AssertJTest {
    MascotaService mascotaService;

    @Test
    @DisplayName("Registrar Macota correctamente")
    void testRegistrarMascotaCorrectamente() {
        //arrange
        MascotaRepository mascotaRepository = new MascotaRepositoryImpl();
        ExternalService externalService = new ExternalServiceImpl();
        mascotaService = new MascotaService(mascotaRepository, externalService);

        Propietario propietario = new Propietario("Danny", "Lima", "987654321");
        Mascota mascota = new Mascota();
        mascota.setNombre("Garfield");
        mascota.setPropietario(propietario);

        //Act
        Mascota registrada = mascotaService.registrarMascota(mascota);

        //Assert : HamCrest

        //verificar las propiedades de la mascota resgistrada
        assertThat(registrada).isNotNull();
        assertThat(registrada.getNombre()).isEqualTo("Garfield");
        assertThat(registrada.getPropietario()).isNotNull();
        ;
        assertThat(registrada.getPropietario().getNombre()).isEqualTo("Danny");
        assertThat(registrada.getPropietario().getCiudad()).isEqualTo("Lima");
        assertThat(registrada.getPropietario().getTelefono()).isEqualTo("987654321");
        assertThat(registrada).isSameAs(mascota);

        assertThat(registrada.getId()).isPositive();
    }
}
