package com.example.Odontologica2.persistence.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name ="domicilios")
public class Domicilio {

    @Id
    @SequenceGenerator(name = "domicilio_sequence", sequenceName = "domicilio_sequence")
    @GeneratedValue(strategy =  GenerationType.SEQUENCE, generator = "domicilio_sequence")
    @Column(name = "domicilio_id", nullable = false)
    private Integer id;
    private String calle;
    private String numero;
    private String localidad;
    private String provincia;



    public Integer getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
}
