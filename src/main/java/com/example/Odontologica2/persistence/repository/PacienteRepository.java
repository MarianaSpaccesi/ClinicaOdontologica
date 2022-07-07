package com.example.Odontologica2.persistence.repository;

import com.example.Odontologica2.model.PacienteDTO;
import com.example.Odontologica2.persistence.entities.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {
}
