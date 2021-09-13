package com.example.persona.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.*;


@Entity
@Table(name = "Domicilio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Domicilio extends Base{

    @Column(name = "Calle")
    private String calle;

    @Column(name = "Número")
    private int numero;

    //Relaciones
    @ManyToOne(optional = false)
    @JoinColumn(name = "FK_Localidad")
    private Localidad localidad;
}
