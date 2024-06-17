package com.example.projetIntegration.pharmahouse.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetIntegration.pharmahouse.entity.Consomation;
import com.example.projetIntegration.pharmahouse.entity.ConsomationKey;
import com.example.projetIntegration.pharmahouse.entity.Utilisateur;

public interface ConsomationRepo extends JpaRepository<Consomation,ConsomationKey> {

    public List<Consomation> findAllByPat(Utilisateur u);
}