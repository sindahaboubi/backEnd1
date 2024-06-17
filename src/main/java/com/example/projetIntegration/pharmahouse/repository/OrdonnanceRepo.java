package com.example.projetIntegration.pharmahouse.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projetIntegration.pharmahouse.entity.Ordonnance;
import com.example.projetIntegration.pharmahouse.entity.Utilisateur;
public interface OrdonnanceRepo extends JpaRepository<Ordonnance,Long>{
    public List<Ordonnance>findAllByUtilisateur(Utilisateur u);
}
