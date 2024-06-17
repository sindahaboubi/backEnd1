package com.example.projetIntegration.pharmahouse.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetIntegration.pharmahouse.entity.Consomation;
import com.example.projetIntegration.pharmahouse.entity.ConsomationKey;
import com.example.projetIntegration.pharmahouse.entity.Utilisateur;
import com.example.projetIntegration.pharmahouse.repository.ConsomationRepo;

@Service
public class ConsomationService {

    @Autowired
    private ConsomationRepo consomRep;


    public List<Consomation> getConsomationsUtilisateur(Utilisateur u) {
        return this.consomRep.findAllByPat(u);
    }
 
    public Consomation ajouterConsomation(Consomation c){
        return this.consomRep.save(c);
    }
    public Consomation modifierConsomation(Consomation c){
        Consomation new_c=new Consomation();
        consomRep.deleteById(c.getId());
        new_c.setId(c.getId());
        new_c.setMed(c.getMed());
        new_c.setPat(c.getPat());
        new_c.setQte_stock(c.getQte_stock());
        return this.consomRep.save(new_c);
    }
	public List<Consomation> findAll() {
		return consomRep.findAll();
	}
	public Optional<Consomation> getByUtiletMed(ConsomationKey k){
        return consomRep.findById(k);
    }
}
