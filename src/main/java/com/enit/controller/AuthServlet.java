// java
package com.enit.controller;

import com.enit.entity.Patient;
import com.enit.service.IGestionCabinetLocal;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/AuthServlet")
public class AuthServlet extends HttpServlet {

    @EJB
    private IGestionCabinetLocal service;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Show login page when GET is requested
        request.getRequestDispatcher("/Connexion.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String email = request.getParameter("login");
        String password = request.getParameter("password");

        if (service == null) {
            // Optional: handle missing EJB
            request.setAttribute("erreurConnexion", "Internal error. Please try later.");
            request.getRequestDispatcher("/Connexion.jsp").forward(request, response);
            return;
        }

        Patient patient = service.authentifierPatient(email, password);

        if (patient != null) {
            HttpSession session = request.getSession(true);
            session.setAttribute("patientConnecte", patient);
            response.sendRedirect(request.getContextPath() + "/Rendezvous.jsp");
        } else {
            request.setAttribute("erreurConnexion", "Email ou mot de passe incorrect.");
            request.getRequestDispatcher("/Connexion.jsp").forward(request, response);
        }
    }
}
