package com.example.projetIntegration.pharmahouse.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.projetIntegration.pharmahouse.entity.Medicament;

public interface MedicamentRepo extends JpaRepository<Medicament,Long>{
    public List<Medicament> findAllByNom(String nom);    
}
