package polimorfismo.modelo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Factura {
    private IImpuesto iImpuesto;
    private List<Producto> productos;

    public double calcularFactura() {
        double facturaTotaL=0;
        for (int i = 0; i < productos.size(); i++) {
            facturaTotaL += iImpuesto.calcularImpuesto(productos.get(i));
        }
        return facturaTotaL;
    }
}
