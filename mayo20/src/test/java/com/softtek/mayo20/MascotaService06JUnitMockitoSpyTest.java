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
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class MascotaService06JUnitMockitoSpyTest {

    //Spy
    @InjectMocks
    MascotaService mascotaService;

    @Mock
    MascotaRepository mascotaRepository;

    @Mock
    ExternalService externalService;

    @Test
    @DisplayName("Registrar Macota correctamente")
    void testRegistrarMascotaCorrectamente() {
        //arrange
        Propietario propietario = new Propietario("Danny","Lima","987654321");
        Mascota mascota = new Mascota();
        mascota.setNombre("Garfield");
        mascota.setPropietario(propietario);

        when(externalService.validarVacunas(any(Mascota.class))).thenReturn(true);
        when(externalService.verificarRegistroMunicipal(any(Mascota.class))).thenReturn(true);
        when(mascotaRepository.findById(any())).thenReturn(Optional.empty());
        when(mascotaRepository.guardar(any(Mascota.class))).thenReturn(mascota);

        //act
        Mascota registrada = mascotaService.registrarMascota(mascota);

        //Verifica que el objeto no es null
        assertNotNull(registrada, "La mascota registrada no deberia ser null");

        //verifica que dos referencias apuntern al mismo objeto
        assertSame(mascota,registrada,"La mascota registrada deberia ser la misma que la ingresada");

        //verify(mascotaService).enviarCorreoNotificacion(mascota);
    }
}
