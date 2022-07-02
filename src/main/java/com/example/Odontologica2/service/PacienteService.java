package com.example.Odontologica2.service;

import com.example.Odontologica2.model.PacienteDTO;
import com.example.Odontologica2.persistence.entities.Paciente;
import com.example.Odontologica2.persistence.repository.PacienteRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PacienteService {
    private static final org.apache.log4j.Logger logger = Logger.getLogger(PacienteService.class);

    @Autowired
    private PacienteRepository repository;


    public ArrayList<Paciente> mostrarTodos() {
        return new ArrayList<>(repository.findAll());
    }

    public Optional<Paciente> mostrarPorId(Integer id){
        return repository.findById(id);
    }

    public Paciente guardar(Paciente paciente){
        if(paciente.getFechaIngreso() != null) {
            repository.save(paciente);
            logger.info("Se ha guardado el paciente correctamente.");
        }else{
            logger.error("No es posible guardar el paciente");
        }
        return paciente;
    }

    public void eliminarPorId(Integer id){
        repository.deleteById(id);
    }
}
