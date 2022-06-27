package com.example.Odontologica2.service;

import com.example.Odontologica2.model.DomicilioDTO;
import com.example.Odontologica2.persistence.entities.Domicilio;
import com.example.Odontologica2.persistence.repository.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class DomicilioService {

    @Autowired
    private DomicilioRepository repository;



    public ArrayList<Domicilio> mostrarTodos() {
        return new ArrayList<>(repository.findAll());
    }

    public Optional<Domicilio> mostrarPorId(Integer id){
        return repository.findById(id);
    }

    public Domicilio guardar(Domicilio domicilioDto){
        return repository.save(domicilioDto);
    }

    public void eliminarPorId(Integer id){
        repository.deleteById(id);
    }
}
