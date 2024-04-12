package Ej1.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Empleado {

    private int empleadoId;
    private String nombre;
    private String apellidos;
    private int reportaAJefe;


}
