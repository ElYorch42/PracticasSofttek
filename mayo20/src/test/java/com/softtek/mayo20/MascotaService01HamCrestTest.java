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
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

@SpringBootTest
public class MascotaService01HamCrestTest {
    MascotaService mascotaService;

    @Test
    @DisplayName("Registrar Macota correctamente")
    void testRegistrarMascotaCorrectamente() {
        //arrange
        MascotaRepository mascotaRepository = new MascotaRepositoryImpl();
        ExternalService externalService = new ExternalServiceImpl();
        mascotaService = new MascotaService(mascotaRepository, externalService);

        Propietario propietario = new Propietario("Danny","Lima","987654321");
        Mascota mascota = new Mascota();
        mascota.setNombre("Garfield");
        mascota.setPropietario(propietario);

        //Act
        Mascota registrada = mascotaService.registrarMascota(mascota);

        //Assert : HamCrest

        //verificar las propiedades de la mascota resgistrada
        assertThat(registrada, is(notNullValue()));
        assertThat(registrada.getNombre(), is(equalTo("Garfield")));
        assertThat(registrada.getPropietario(), is(notNullValue()));
        assertThat(registrada.getPropietario().getNombre(), is("Danny"));
        assertThat(registrada.getPropietario().getCiudad(), is("Lima"));
        assertThat(registrada.getPropietario().getTelefono(), is("987654321"));
        assertThat(registrada, is(sameInstance(mascota)));
        assertThat(registrada, is(notNullValue()));

    }
}
