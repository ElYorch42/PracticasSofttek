package com.softtek.mayo13Back.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Profesores")
public class Profesor {
    @Id
    @GeneratedValue
    private int id;
    @Column(length = 40, nullable = false)
    private String nombre;
    @Column(length = 40, nullable = false)
    private String correo;
    @Column(length = 40, nullable = false)
    private String especialidad;

}
