package com.example.Odontologica2.service;

import com.example.Odontologica2.persistence.entities.Odontologo;
import com.example.Odontologica2.persistence.repository.OdontologoRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Optional;
@Service
public class OdontologoService {

    private static final Logger logger = Logger.getLogger(OdontologoService.class);

    @Autowired
    private OdontologoRepository repository;

    @Autowired
    ObjectMapper mapper;


    public ArrayList<Odontologo> mostrarTodos() {
        ArrayList<Odontologo> listaOdontologos = new ArrayList<>(repository.findAll());
        return listaOdontologos;
    }

    public Optional<Odontologo> mostrarPorId(Long id){
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

    public void eliminarPorId(Long id){
        repository.deleteById(id);
    }
}
