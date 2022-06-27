package com.example.Odontologica2.service;

import com.example.Odontologica2.model.PacienteDTO;
import com.example.Odontologica2.persistence.entities.Paciente;
import com.example.Odontologica2.persistence.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;


    public ArrayList<Paciente> mostrarTodos() {
        return new ArrayList<>(repository.findAll());
    }

    public Optional<Paciente> mostrarPorId(Integer id){
        return repository.findById(id);
    }

    public Paciente guardar(Paciente paciente){
        return repository.save(paciente);
    }

    public void eliminarPorId(Integer id){
        repository.deleteById(id);
    }
}
