package com.enit.service;


import com.enit.entity.Patient;
import jakarta.ejb.Local;

@Local
public interface IGestionCabinetLocal {
    void ajouterPatient(Patient p);
    Patient authentifierPatient(String email, String password);
}
