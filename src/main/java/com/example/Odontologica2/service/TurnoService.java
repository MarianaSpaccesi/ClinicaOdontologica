package com.example.Odontologica2.service;
import com.example.Odontologica2.model.TurnoDTO;
import com.example.Odontologica2.persistence.entities.Turno;
import com.example.Odontologica2.persistence.repository.TurnoRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;


@Service
public class TurnoService {

    private static final org.apache.log4j.Logger logger = Logger.getLogger(TurnoService.class);

    @Autowired
    private TurnoRepository repository;



    public ArrayList<Turno> mostrarTodos() {
        return new ArrayList<>(repository.findAll());
    }

    public Optional<Turno> mostrarPorId(Integer id){
        return repository.findById(id);
    }

    public Turno guardar(Turno turno){
        if(turno.getFecha().isAfter(LocalDate.now())){
            repository.save(turno);
            logger.info("Se ha guardado el turno correctamente.");
        }else {
            logger.error("No es posible guardar el turno.");
        }
        return turno;
    }

    public void eliminarPorId(Integer id){
        repository.deleteById(id);
    }
}
