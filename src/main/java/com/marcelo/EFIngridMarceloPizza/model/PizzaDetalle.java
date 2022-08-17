package com.marcelo.EFIngridMarceloPizza.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


@Setter
@Getter
@Entity
@Table(name = "pizzeria_pizza")
public class PizzaDetalle {

    @EmbeddedId
    private PizzaPizzeriaFK fk = new PizzaPizzeriaFK();
}
