package com.cibertec.T2exa.model;



import jakarta.persistence.*;

@Entity
@Table(name = "genero")
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idgenero;

    private String nombre;

    public Genero() {
    }

    public Integer getIdgenero() {
        return idgenero;
    }

    public void setIdgenero(Integer idgenero) {
        this.idgenero = idgenero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


