package com.example.Parcial1Programacion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "domicilio")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Domicilio extends Base{


    @Column(name = "calle")
    private String calle;
    @Column(name = "numero")
    private int numero;

    @ManyToOne(optional = false)//no puede ser nula
    @JoinColumn(name = "fk_localidad")
    private Localidad localidad;


}
