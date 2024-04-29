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
@Table(name="departamento") //table para cambiar nombre de l tabla nada mas
public class Departamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementar hayq poner la estrategia
    private int idDepartamento;
    @Column(length = 60, nullable = false)
    private  String descripcionDepartamento;

    @OneToMany(mappedBy = "d1",cascade = CascadeType.ALL,orphanRemoval = true,fetch = FetchType.EAGER)
    List<Empleado> empleados;
}
