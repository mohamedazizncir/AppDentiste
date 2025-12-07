package com.enit.entity;


import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "Patient")
public class Patient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idP; //  int, Clé primaire

    @Column(length = 100, nullable = false)
    private String nomP;

    @Column(length = 100, nullable = false)
    private String prenomP;

    @Column(length = 100, nullable = false, unique = true)
    private String emailP;

    @Temporal(TemporalType.DATE)
    private Date dateNP;

    @Column(length = 100)
    private String photoP;

    public int getIdP() {
        return idP;
    }

    public void setIdP(int idP) {
        this.idP = idP;
    }

    public String getNomP() {
        return nomP;
    }

    public void setNomP(String nomP) {
        this.nomP = nomP;
    }

    public String getPrenomP() {
        return prenomP;
    }

    public void setPrenomP(String prenomP) {
        this.prenomP = prenomP;
    }

    public String getEmailP() {
        return emailP;
    }

    public void setEmailP(String emailP) {
        this.emailP = emailP;
    }

    public Date getDateNP() {
        return dateNP;
    }

    public void setDateNP(Date dateNP) {
        this.dateNP = dateNP;
    }

    public String getPhotoP() {
        return photoP;
    }

    public void setPhotoP(String photoP) {
        this.photoP = photoP;
    }

    public GroupeSanguin getGroupeSanguinP() {
        return groupeSanguinP;
    }

    public void setGroupeSanguinP(GroupeSanguin groupeSanguinP) {
        this.groupeSanguinP = groupeSanguinP;
    }

    public Sexe getSexeP() {
        return sexeP;
    }

    public void setSexeP(Sexe sexeP) {
        this.sexeP = sexeP;
    }

    public String getMdpP() {
        return mdpP;
    }

    public void setMdpP(String mdpP) {
        this.mdpP = mdpP;
    }

    public String getRecouvrementP() {
        return recouvrementP;
    }

    public void setRecouvrementP(String recouvrementP) {
        this.recouvrementP = recouvrementP;
    }

    public enum GroupeSanguin{A ,B , O , AB}

    @Column( length = 2)
    private GroupeSanguin groupeSanguinP; // 'A','B', etc.
    public enum Sexe{M,F}
    @Column( length = 1)
    private Sexe sexeP; // 'M' ou 'F'

    @Column(length = 10)
    private String mdpP;

    @Column(length = 100)
    private String recouvrementP;

    // Constructeurs, Getters et Setters (ou utiliser @Data de Lombok)
    public Patient() {}
}