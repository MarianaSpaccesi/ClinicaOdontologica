package com.example.Odontologica2.controller;
import com.example.Odontologica2.exceptions.ResourceNotFoundExceptions;
import com.example.Odontologica2.persistence.entities.Turno;
import com.example.Odontologica2.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("turnos")
public class TurnoController {

    @Autowired
    TurnoService turnoService;

    @GetMapping("/todos")
    public ResponseEntity<ArrayList<Turno>> mostrarTurnos (){
        ArrayList<Turno> listarTurnos = turnoService.mostrarTodos();
        return ResponseEntity.ok(listarTurnos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Turno>> mostrarTurnoPorId(@PathVariable Long id) throws ResourceNotFoundExceptions {
        return ResponseEntity.ok(turnoService.mostrarPorId(id));
    }

    @PostMapping("guardar")
    public ResponseEntity<Turno> guardarTurno(@RequestBody Turno turno){
        return ResponseEntity.ok(turnoService.guardar(turno));
    }

    @PutMapping("modificar")
    public ResponseEntity<Turno> modificarTurno(@RequestBody Turno turno){
        return ResponseEntity.ok(turnoService.actualizarTurno(turno));
    }

    @DeleteMapping("/{id}")
    public void eliminarTurnoPorId(@PathVariable Long id){
        turnoService.eliminarPorId(id);
    }
}
