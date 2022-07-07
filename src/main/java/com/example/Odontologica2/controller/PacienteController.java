package com.example.Odontologica2.controller;

import com.example.Odontologica2.model.PacienteDTO;
import com.example.Odontologica2.persistence.entities.Paciente;
import com.example.Odontologica2.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    @Autowired
    PacienteService pacienteService;


    @GetMapping("/todos")
    public ResponseEntity<ArrayList<Paciente>> mostrarPacientes (){
        ArrayList<Paciente> listarPaciente = pacienteService.mostrarTodos();
        return ResponseEntity.ok(listarPaciente);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Paciente>> mostrarPacientePorId(@PathVariable Long id){
        return ResponseEntity.ok(pacienteService.mostrarPorId(id));
    }

    @PostMapping("guardar")
    public ResponseEntity<Paciente> guardarPaciente(@RequestBody Paciente paciente){
        return ResponseEntity.ok(pacienteService.guardar(paciente));
    }

    @DeleteMapping("/{id}")
    public void eliminarPacientePorId(@PathVariable Long id){
        pacienteService.eliminarPorId(id);
    }
}
