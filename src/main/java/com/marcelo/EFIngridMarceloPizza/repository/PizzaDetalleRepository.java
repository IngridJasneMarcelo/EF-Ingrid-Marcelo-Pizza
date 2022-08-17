package com.marcelo.EFIngridMarceloPizza.repository;

import com.marcelo.EFIngridMarceloPizza.model.PizzaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaDetalleRepository extends JpaRepository<PizzaDetalle, Integer> {
}
