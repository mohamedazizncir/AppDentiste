package com.enit.service;

import com.enit.entity.Patient;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import java.util.List;

@Stateless
public class GestionCabinetLocalImpl implements IGestionCabinetLocal {

    @PersistenceContext(unitName = "ProjetDentisteDS")
    private EntityManager em;

    @Override
    public void ajouterPatient(Patient p) {
        em.persist(p);
    }

    @Override
    public Patient authentifierPatient(String email, String password) {
        // Requête JPQL pour trouver le patient
        String jpql = "SELECT p FROM Patient p WHERE p.emailP = :mail AND p.mdpP = :pass";
        TypedQuery<Patient> query = em.createQuery(jpql, Patient.class);
        query.setParameter("mail", email);
        query.setParameter("pass", password);

        List<Patient> results = query.getResultList();
        if (results.isEmpty()) {
            return null;
        }
        return results.get(0);
    }
}