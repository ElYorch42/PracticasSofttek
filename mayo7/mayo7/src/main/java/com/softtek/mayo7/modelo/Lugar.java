package com.softtek.mayo7.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Lugares")
public class Lugar {
    @Id
    @GeneratedValue
    private int idLugar;
    @Column(length = 40, nullable = false)
    private String nombre;

}
