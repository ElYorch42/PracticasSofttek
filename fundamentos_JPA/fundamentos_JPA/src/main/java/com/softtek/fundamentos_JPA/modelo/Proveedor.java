package com.softtek.fundamentos_JPA.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="proveedores")
public class Proveedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProveedor;
    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(length = 60, nullable = false)
    private String ubicacion;
    //en caso de que e front lo necesite
    @ManyToMany(mappedBy = "proveedores", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Producto> productos;
}
