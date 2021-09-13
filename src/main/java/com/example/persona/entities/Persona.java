package com.example.persona.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Persona")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Persona extends Base{

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "DNI")
    private int dni;

    //Relaciones
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "FK_Domicilio")
    private Domicilio domicilio;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(
            name = "Persona_Libro",
            joinColumns = @JoinColumn(name = "Persona_ID"),
            inverseJoinColumns = @JoinColumn(name = "Libro_ID")
    )
    private List <Libro> libros = new ArrayList<Libro>();
}
