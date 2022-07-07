package com.example.Odontologica2.persistence.repository;

import com.example.Odontologica2.model.TurnoDTO;
import com.example.Odontologica2.persistence.entities.Turno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurnoRepository extends JpaRepository<Turno, Long> {
}
