package com.example.Odontologica2.controller;
import com.example.Odontologica2.persistence.entities.Odontologo;
import com.example.Odontologica2.service.OdontologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("odontologos")
public class OdontologoController {

    @Autowired
    OdontologoService odontologoService;


    @GetMapping("/todos")
    public ResponseEntity<ArrayList<Odontologo>> mostrarOdontologo (){
        ArrayList<Odontologo> listarOdontologos = odontologoService.mostrarTodos();
        return ResponseEntity.ok(listarOdontologos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Odontologo>> mostrarOdontologoPorId(@PathVariable Long id){
        return ResponseEntity.ok(odontologoService.mostrarPorId(id));
    }

    @PostMapping("guardar")
    public ResponseEntity<Odontologo> guardarOdontologo(@RequestBody Odontologo odontologo){
        return ResponseEntity.ok( odontologoService.guardar(odontologo));
    }

    @PutMapping("modificar")
    public ResponseEntity<Odontologo> modificarPaciente(@RequestBody Odontologo odontologo){
        return ResponseEntity.ok(odontologoService.actualizarOdontologo(odontologo));
    }

    @DeleteMapping("/{id}")
    public void eliminarOdontologoPorId(@PathVariable Long id){
        odontologoService.eliminarPorId(id);
    }
}
