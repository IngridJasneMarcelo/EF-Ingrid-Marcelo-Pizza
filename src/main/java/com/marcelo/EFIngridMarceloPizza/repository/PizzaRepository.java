package com.marcelo.EFIngridMarceloPizza.repository;

import com.marcelo.EFIngridMarceloPizza.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {
}
