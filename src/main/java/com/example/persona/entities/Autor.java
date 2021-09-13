package com.example.persona.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Autor")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Autor extends Base {

    @Column(name = "Nombre")
    private String nombre;

    @Column(name = "Apellido")
    private String apellido;

    @Column(name = "Biografía", length = 1500)
    private String biografia;

    //Relaciones
}
