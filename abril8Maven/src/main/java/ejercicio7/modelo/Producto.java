package ejercicio7.modelo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Producto {

    private int id;
    private String nombre;
    private double precio;
    private String proveedor;
    private String descripcion;

    public String comprobar() {
        try {
            if (id == 0) {
                throw new ProductoException("No tiene ID");
            } else {
                return "todo bien";
            }
        } catch (ProductoException e) {
            System.out.println(e.getMessage());
            return "error";
        }
    }
}
