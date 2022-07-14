package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.products.Vent;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vent")
public class VentController {

    @GetMapping
    public List<Vent> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Vent getById(@PathVariable("id") Long id){
        return null;
    }
}
