package com.marcelo.EFIngridMarceloPizza.client;

import com.marcelo.EFIngridMarceloPizza.dto.Pizzeria;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name="idat-pizzeria", url="localhost:8082")
public interface OpenFeingClient {

    @GetMapping("/pizzeria/listar")
    public List<Pizzeria> listarPizzeriaSeleccionados();
}
