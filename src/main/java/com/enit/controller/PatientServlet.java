package com.enit.controller;

import com.enit.entity.Patient;
import com.enit.service.IGestionCabinetLocal;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {

    @EJB
    private IGestionCabinetLocal service;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            // Récupération des données du formulaire
            String nom = request.getParameter("nomP");
            String prenom = request.getParameter("prenomP");
            String email = request.getParameter("emailP");
            String mdp = request.getParameter("mdpP");
            String adresse = request.getParameter("adresseP"); // Assurez-vous d'avoir ajouté ce champ dans l'entité Patient si nécessaire
            String recouvrement = request.getParameter("recouvrementP");

            // Gestion de la date (String -> Date)
            String dateStr = request.getParameter("dateNP");
            Date dateN = null;
            if(dateStr != null && !dateStr.isEmpty()){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); // Format standard HTML5 date
                dateN = sdf.parse(dateStr);
            }

            // Création de l'objet
            Patient p = new Patient();
            p.setNomP(nom);
            p.setPrenomP(prenom);
            p.setEmailP(email);
            p.setMdpP(mdp);
            p.setRecouvrementP(recouvrement);
            p.setDateNP(dateN);
            // p.setAdresseP(adresse);  // Ajoutez ce setter dans votre entité si ce n'est pas fait

            // Appel EJB
            service.ajouterPatient(p);

            // Redirection vers la page de succès demandée [cite: 91]
            response.sendRedirect("ValiderInscription.jsp");

        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("Patient.jsp?error=true");
        }
    }
}