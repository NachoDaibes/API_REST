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
@Table(name = "Localidad")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Audited
public class Localidad extends Base{

    @Column(name = "Denominación")
    private String denominacion;

    //Relaciones
}
