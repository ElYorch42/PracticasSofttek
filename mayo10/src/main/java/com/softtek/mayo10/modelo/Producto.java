package com.softtek.mayo10.modelo;

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
    @Column(length = 30, nullable = false)
    private String nombreProducto;
    private double precioUnitario;
    private int unidadesStock;
    private int idCategoria;
}
