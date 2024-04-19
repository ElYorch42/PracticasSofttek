package com.softtek.Abril16.ejercicio5.persistencia;


import com.softtek.Abril16.ejercicio5.modelo.Cliente;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class AccesoProduccion implements IDAO{

    @Override
    public String insertar(Cliente c1) {
        return "el cliente "+ c1.getNombre()+" nif:"+ c1.getNif()+" ha sido insertado en produccion";
    }
}
