package com.example.Parcial1Programacion.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "libro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
    public class Libro extends Base {
    @Column(name = "titulo")
    private String titulo;
    @Column(name = "fecha")
    private int fecha;
    @Column(name = "genero")
    private String genero;
    @Column(name = "pagina")
    private int pagina;

    @ManyToMany(cascade = CascadeType.REFRESH) //  BUSCAR PARA QUE SIRVE
    private List<Autor> autores;


}
