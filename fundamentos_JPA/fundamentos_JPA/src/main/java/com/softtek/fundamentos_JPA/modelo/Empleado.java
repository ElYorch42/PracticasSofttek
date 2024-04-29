package com.softtek.fundamentos_JPA.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="empleado")
public class Empleado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEmpleado;

    @Column(length = 60, nullable = false)
    private String nombre;
    @Column(nullable = false)
    private int edad;

    @ManyToOne
    @JoinColumn(name = "id_departamento", nullable = false, foreignKey = @ForeignKey(name = "FK_empleados_departamento"))
    private Departamento d1;
}
