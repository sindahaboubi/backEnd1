package com.example.projetIntegration.pharmahouse.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetIntegration.pharmahouse.entity.Ordonnance;
import com.example.projetIntegration.pharmahouse.entity.Prise;
import com.example.projetIntegration.pharmahouse.entity.Utilisateur;
import com.example.projetIntegration.pharmahouse.repository.OrdonnanceRepo;
import com.example.projetIntegration.pharmahouse.repository.PriseRepo;
@Service
public class OrdonnanceService {
    @Autowired
    private OrdonnanceRepo ordRepo;
    @Autowired
    private PriseRepo priseRepo;

	public Ordonnance findById(Long id) {
		return ordRepo.findById(id).orElse(null);
	}

    public Ordonnance ajouterOrd(Ordonnance o){
        return ordRepo.save(o);
    }
    public List<Ordonnance>getAll(){
        return ordRepo.findAll();
    }

    public List<Ordonnance>getAllUtilisateurOrd(Utilisateur u){

        return this.ordRepo.findAllByUtilisateur(u);

    }

    public void deleteOrdById(Long id){


         Ordonnance ord = this.ordRepo.getById(id);
         if(ord != null){
            List<Prise>list_prises = this.priseRepo.findAllByOrd(ord);
            if(list_prises.size() > 0){
                this.priseRepo.deleteAll(list_prises);
            }
            this.ordRepo.deleteById(id);
         }

    }
    



}
