package stream.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Ordenes {
    private int idOrden;
    private int idProducto;
    private double precioUnidad;
    private int cantidad;
    private double descuento;
}
