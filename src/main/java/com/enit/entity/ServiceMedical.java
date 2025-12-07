package com.enit.entity;


import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ServiceMedical")
public class ServiceMedical implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int numSM; // Clé primaire

    @Column(length = 100, nullable = false)
    private String nomSM;

    @Column(length = 100)
    private String typeSM; // ex: Chirurgie, Soin, Radio...

    @Lob // Permet de stocker un long texte
    private String descriptionSM;

    @Column(nullable = false)
    private float tarifSM;

    // Constructeur vide obligatoire pour JPA
    public ServiceMedical() {}

    // Getters et Setters...
}
