package com.marcelo.EFIngridMarceloPizza.service;

import com.marcelo.EFIngridMarceloPizza.model.Pizza;

import java.util.List;

public interface PizzaService {

    List<Pizza> listar();
    Pizza porId(Integer idPizza);
    void guardar(Pizza pizza);
    void eliminar(Integer idPizza);
    void actualizar(Pizza pizza);
    void asignarPizzeriaPizza();
}
