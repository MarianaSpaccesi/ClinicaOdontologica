package com.example.Odontologica2.persistence.repository;

import com.example.Odontologica2.model.OdontologoDTO;
import com.example.Odontologica2.persistence.entities.Odontologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OdontologoRepository extends JpaRepository<Odontologo, Integer> {
}
