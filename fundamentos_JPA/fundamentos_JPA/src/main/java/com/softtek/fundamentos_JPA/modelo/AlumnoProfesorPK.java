package com.softtek.fundamentos_JPA.modelo;

import jakarta.persistence.Embeddable;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Embeddable //tiene como requisito meterle serializable y esto es lo que indica que es la clase para comparar las claves
public class AlumnoProfesorPK implements Serializable {
    @ManyToOne
    @JoinColumn(name = "id_profesor", nullable = false, foreignKey = @ForeignKey(name = "FK_ap_profesores"))
    private Profesor profesor;
    @ManyToOne
    @JoinColumn(name = "id_alumno",nullable = false, foreignKey = @ForeignKey(name = "FK_ap_alumnos"))
    private Alumno alumno;

    //Se necesita poner los metodos equals() y hashcode(), aqui no esta puesto por que lo cubre @data
}
