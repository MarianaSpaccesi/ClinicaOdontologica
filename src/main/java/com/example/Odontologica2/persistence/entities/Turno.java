package com.example.Odontologica2.persistence.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "turnos")
public class Turno {
    @Id
    @SequenceGenerator(name = "turno_sequence", sequenceName = "turno_sequence")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "turno_sequence") //genera secuencia en turno, que los IDs tengan una secuencia propia
    @Column(name = "turno_id", nullable = false)
    private Long id;
    private LocalDate fecha;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "odontologo_id")
    private Odontologo odontologo;

    @ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;


    public Turno() {
    }

    public Turno(LocalDate date, Paciente paciente, Odontologo odontologo) {
        this.fecha = date;
        this.paciente = paciente;
        this.odontologo = odontologo;
    }


    public Long getId() {
        return id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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
