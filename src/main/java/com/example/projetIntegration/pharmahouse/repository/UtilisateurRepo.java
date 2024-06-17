package com.example.projetIntegration.pharmahouse.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.example.projetIntegration.pharmahouse.entity.Utilisateur;
public interface UtilisateurRepo extends JpaRepository<Utilisateur,Long> {

    public Utilisateur findUtilisateurByEmail(String email);
}
