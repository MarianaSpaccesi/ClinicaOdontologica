package com.example.Odontologica2.service;

import com.example.Odontologica2.model.OdontologoDTO;
import com.example.Odontologica2.persistence.entities.Odontologo;
import com.example.Odontologica2.persistence.repository.OdontologoRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
@Service
public class OdontologoService {

    private static final org.apache.log4j.Logger logger = Logger.getLogger(OdontologoService.class);

    @Autowired
    private OdontologoRepository repository;


    public ArrayList<Odontologo> mostrarTodos() {
        return new ArrayList<>(repository.findAll());
    }

    public Optional<Odontologo> mostrarPorId(Integer id){
        return repository.findById(id);
    }

    public Odontologo guardar(Odontologo odontologo){
        if(odontologo.getMatricula() != null) {
           repository.save(odontologo);
            logger.info("Se ha guardado el odontologo correctamente.");
        }else{
            logger.error("No es posible guardar el odontologo");
        }
        return odontologo;
    }

    public void eliminarPorId(Integer id){
        repository.deleteById(id);
    }
}
