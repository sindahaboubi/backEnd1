package com.example.projetIntegration.pharmahouse.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetIntegration.pharmahouse.entity.Ordonnance;
import com.example.projetIntegration.pharmahouse.entity.Prise;
import com.example.projetIntegration.pharmahouse.repository.PriseRepo;
import com.example.projetIntegration.pharmahouse.service.PriseService;

@RestController
@RequestMapping(value = "/prise")
public class PriseController {
    @Autowired
    private PriseService priseServ;
    

    @Autowired
    PriseRepo tutorialRepository;
    
    @PostMapping(value="/ajouter")
    public Prise wsAjouter(@RequestBody Prise p){
        return priseServ.ajouterPrise(p);
    }
    @GetMapping(value="/getAll")
    public List<Prise> wsGetAll() {
        return priseServ.getAll();
    }
    
    @PostMapping(value="/getallbyords")
    public List<Prise> wsgetallbyords(@RequestBody Ordonnance o){
        return priseServ.getallbyords(o);
    }
    
    @PutMapping(value="/update") 
    public Prise wsUpdate(@RequestBody Prise p){
        return priseServ.update(p);
    }

    @PutMapping(value="/updateAll")
    public List<Prise> wsUpdateAll(@RequestBody List<Prise> p){
        return priseServ.updateall(p);
    }
}
