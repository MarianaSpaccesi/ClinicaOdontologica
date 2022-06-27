package com.example.Odontologica2.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "turnos")
public class Turno {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE)
    @Column(name = "turno_id", nullable = false)
    private Integer id;


    private Date date;

    @ManyToOne
    @JoinColumn(name = "odontologo_id")
    private Odontologo odontologo;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;


    public Turno() {
    }

    public Turno(Date date, Paciente paciente, Odontologo odontologo) {
        this.date = date;
        this.paciente = paciente;
        this.odontologo = odontologo;
    }

    public Odontologo getOdonto() {
        return odontologo;
    }

    public void setOdonto(Odontologo odonto) {
        this.odontologo = odonto;
    }

    public Paciente getPac() {
        return paciente;
    }

    public void setPac(Paciente pac) {
        this.paciente = pac;
    }

    public Integer getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Odontologo getOdontologo() {
        return odontologo;
    }

    public void setOdontologo(Odontologo odontologo) {
        this.odontologo = odontologo;
    }
}
