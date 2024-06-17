package com.example.projetIntegration.pharmahouse.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.projetIntegration.pharmahouse.entity.Ordonnance;
import com.example.projetIntegration.pharmahouse.entity.Prise;
import com.example.projetIntegration.pharmahouse.repository.PriseRepo;
@Service
public class PriseService {
    @Autowired
    private PriseRepo priseRepo;
    
    public Prise ajouterPrise(Prise p){
        return priseRepo.save(p); 
        }
        public List<Prise>getAll(){
            return priseRepo.findAll();
        }
        public List<Prise>getallbyords(Ordonnance o){
            return priseRepo.findAllByOrd(o);
        }
        
        public Prise update(Prise p){
        Prise new_p=new Prise();
        priseRepo.delete(p);
        
        new_p.setId(p.getId());
        new_p.setDatefinprise(p.getDatefinprise());
        new_p.setDateprise(p.getDateprise());
        new_p.setMed(p.getMed());
        new_p.setOrd(p.getOrd());
        new_p.setPris(true);
        new_p.setPrisejour(p.getPrisejour());
        new_p.setPrisemidi(p.getPrisemidi());
        new_p.setPrisesoir(p.getPrisesoir());
 
        return priseRepo.save(new_p);
        }
        public List<Prise> updateall(List<Prise> p){
            priseRepo.deleteAll(p);
            return priseRepo.saveAll(p);
        }
    }