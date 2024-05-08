package com.softtek.mayo7Refactorizacion.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Productos")
public class Producto {
    @Id
    @GeneratedValue
    private int idProducto;
    @Column(length = 20, nullable = false)
    private String nombreProducto;
    private double precioUnitario;
    private int unidadesStock;
    private int idCategoria;
}
