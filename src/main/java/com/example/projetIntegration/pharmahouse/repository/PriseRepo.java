package com.example.projetIntegration.pharmahouse.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.projetIntegration.pharmahouse.entity.Ordonnance;
import com.example.projetIntegration.pharmahouse.entity.Prise;
public interface PriseRepo extends JpaRepository<Prise,Long>{
    public List<Prise> findAllByOrd(Ordonnance o);
}
