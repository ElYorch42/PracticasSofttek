package com.softtek.fundamentos_JPA.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="profesores")
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProfesor;
    @Column(length = 9, nullable = false)
    private String dni;


}
