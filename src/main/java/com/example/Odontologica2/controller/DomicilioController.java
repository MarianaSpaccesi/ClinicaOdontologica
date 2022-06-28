package com.example.Odontologica2.controller;

import com.example.Odontologica2.model.DomicilioDTO;
import com.example.Odontologica2.persistence.entities.Domicilio;
import com.example.Odontologica2.service.DomicilioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/domicilios")
public class DomicilioController {

    @Autowired
    DomicilioService domicilioService;

    @GetMapping("/todos")
    public ResponseEntity<ArrayList<Domicilio>> mostrarDomicilios (){
        ArrayList<Domicilio> listarDomicilios = domicilioService.mostrarTodos();
        return ResponseEntity.ok(listarDomicilios);
    }

    @GetMapping("{id}")
    public Optional<Domicilio> mostrarDomicilioPorId(@PathVariable Integer id){
        return domicilioService.mostrarPorId(id);
    }

    @PostMapping("/guardar")
    public Domicilio guardarDomicilio(@RequestBody Domicilio domicilio){
        return domicilioService.guardar(domicilio);
    }

    @DeleteMapping("/{id}")
    public void eliminarDomicilioPorId(@PathVariable Integer id){
        domicilioService.eliminarPorId(id);
    }
}
