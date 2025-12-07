package com.enit.entity;


import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Dentiste")
public class Dentiste implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idD;

    @Column(length = 100, nullable = false)
    private String nomD;

    @Column(length = 100, nullable = false)
    private String prenomD;

    @Column(length = 100, nullable = false, unique = true)
    private String emailD;

    @Column(length = 100)
    private String specialiteD;

    @Column(length = 10)
    private String mdpD;

    @Column(length = 1)
    private String sexeD;

    private int telD;

    @Column(length = 100)
    private String photoD;

    public Dentiste() {}
}
