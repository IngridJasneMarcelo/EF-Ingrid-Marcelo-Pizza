package com.marcelo.EFIngridMarceloPizza.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "pizza")
public class Pizza {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPizza;
    private String nombrePizza;
    private String descripcion;
}
