package com.enit.entity;


import jakarta.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ActeMedical")
public class ActeMedical implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAM;

    @Column(length = 255)
    private String descriptionAM; // Description spécifique à l'acte réalisé

    @Column(nullable = false)
    private float tarifAM; // Prix facturé (peut différer du prix catalogue)

    // --- RELATIONS (Clés étrangères) ---

    // Un Acte est réalisé lors d'un Rendez-vous spécifique
    @ManyToOne
    @JoinColumn(name = "idRv", nullable = false)
    private Rendezvous rendezvous;

    // Un Acte correspond à un Service Medical standard
    @ManyToOne
    @JoinColumn(name = "numSM", nullable = false)
    private ServiceMedical serviceMedical;

    public ActeMedical() {}

    // Getters et Setters...
}
