package com.softtek.mayo10.dto;

import com.softtek.mayo10.modelo.Producto;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProductoDTO {

    private int idProducto;
    @NotEmpty
    @Size(min = 3, max = 30)
    private String nombreProducto;
    private double precioUnitario;
    @Min(2)
    @Max(3000)
        private int unidadesStock;
    private int idCategoria;

    public Producto castProducto(){
        Producto p = new Producto();
        p.setIdProducto(idProducto);
        p.setNombreProducto(nombreProducto);
        p.setPrecioUnitario(precioUnitario);
        p.setUnidadesStock(unidadesStock);
        p.setIdCategoria(idCategoria);
        return p;
    }

    public ProductoDTO castProdcutoADTO(Producto p){
        idProducto = p.getIdProducto();
        nombreProducto = p.getNombreProducto();
        precioUnitario = p.getPrecioUnitario();
        unidadesStock = p.getUnidadesStock();
        idCategoria = p.getIdCategoria();
        return this;
    }
}
