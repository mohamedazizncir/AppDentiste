package com.enit.entity;


import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.sql.Time;

@Entity
@Table(name = "Rendezvous")
public class Rendezvous implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRv;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dateRv;

    @Column(nullable = false)
    private Time heureRv; // Type Time [cite: 233]

    @Column(length = 100, nullable = false)
    private String statutRv;

    @Lob // Pour le type "text"
    private String descriptionRv;

    // Relation ManyToOne: Un RDV appartient à un Patient
    @ManyToOne
    @JoinColumn(name = "idP", nullable = false)
    private Patient patient;

    // Relation ManyToOne: Un RDV est géré par un Dentiste
    @ManyToOne
    @JoinColumn(name = "idD", nullable = false)
    private Dentiste dentiste;

    public Rendezvous() {}
}
