package com.marcelo.EFIngridMarceloPizza.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;


@Setter
@Getter
@Embeddable
public class PizzaPizzeriaFK implements Serializable {

    @Column(name = "idPizza", nullable = false, unique = false)
    private Integer idPizza;

    @Column(name = "idPizzeria", nullable = false, unique = true)
    private Integer idPizzeria;
}
