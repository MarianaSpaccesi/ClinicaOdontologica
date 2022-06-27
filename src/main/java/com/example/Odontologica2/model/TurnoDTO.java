package com.example.Odontologica2.model;

import com.example.Odontologica2.persistence.entities.Odontologo;

import java.util.Date;

public class TurnoDTO {
    private Integer id;
    private Date date;
    private PacienteDTO pacienteDTO;
    private OdontologoDTO odontologoDTO;

    public PacienteDTO getPacienteDTO() {
        return pacienteDTO;
    }

    public void setPacienteDTO(PacienteDTO pacienteDTO) {
        this.pacienteDTO = pacienteDTO;
    }

    public OdontologoDTO getOdontologoDTO() {
        return odontologoDTO;
    }

    public void setOdontologoDTO(OdontologoDTO odontologoDTO) {
        this.odontologoDTO = odontologoDTO;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
