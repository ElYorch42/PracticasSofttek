package ejconsumer.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Producto {

    private String nombre;
    private double precio;
    private  String desc;


}
