package com.example.persona.entities;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Libro")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Libro extends Base {

    @Column(name = "Título")
    private String titulo;

    @Column(name = "Fecha")
    private int fecha;

    @Column(name = "Género")
    private String genero;

    @Column(name = "Páginas")
    private int paginas;

    //Relaciones
    @ManyToMany(cascade = CascadeType.REFRESH)
    private List<Autor> autores;
}
