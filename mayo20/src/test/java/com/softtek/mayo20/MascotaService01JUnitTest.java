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

import static org.junit.jupiter.api.Assertions.*;

public class MascotaService01JUnitTest {
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

        //Assert : JUnit

        //Verifica que el objeto no es null
        assertNotNull(registrada,"la mascota no deberia ser null");

        //verifica que dos referencias apuntern al mismo objeto
        assertSame(mascota,registrada,"La mascota registrada deberia ser la misma que la ingresada");

        //verifica que el valor esperado coincida con el actual
        assertEquals("Garfield",registrada.getNombre(), "El nombre de la mascota registrada deberia ser Garfield");

        //Confirma que el prpietario de la mascota registrada es el mismo que se proporciono
        assertSame(propietario, registrada.getPropietario(), "El propietario de la mascota registrada debe ser el mismo");

        //comprueba los detalles del propietario
        assertEquals("Danny", registrada.getPropietario().getNombre(), "El nombre del propietario deberia ser Danny");
        assertEquals("Lima", registrada.getPropietario().getCiudad(), "La ciudad del propietario deberia ser Lima");
        assertEquals("987654321", registrada.getPropietario().getTelefono(), "El telefono del propietario deberia ser 987654321");

        //comprobar con mas asercoiones de JUnit 5
        assertTrue(registrada.getId() >0, "ID debe ser positivo");

        //verificacion adicional agrupando varias aserciones
        assertAll("Propiedades de la mascota",
                () -> assertEquals("Garfield",registrada.getNombre(), "El nombre debe coincidir"),
                () -> assertNotNull(registrada.getPropietario(), "El propietario no debe ser null"),
                () -> assertEquals("Danny", registrada.getPropietario().getNombre(), "El nombre del propietario debe ser Danny"),
                () -> assertEquals("Lima", registrada.getPropietario().getCiudad(), "La ciudad del propietario debe ser Lima"),
                () -> assertEquals("987654321", registrada.getPropietario().getTelefono(), "El telefono del propietario debe ser 987654321")
        );

        //Comprueba que las siguientes operaciones no lanzan excepciones, lo cual es util para confirmar que propiedades esenciales estan existentes
        assertDoesNotThrow(() -> registrada.getNombre(),"Obtener el nombre de la mascota no deberia lanzar excepcion");
        assertDoesNotThrow(() ->registrada.getPropietario().getCiudad(), "Obtener la ciudad del propietario no deberia lanzar excepcion");

    }

}
