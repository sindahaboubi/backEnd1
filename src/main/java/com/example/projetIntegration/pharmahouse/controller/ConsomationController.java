package com.example.projetIntegration.pharmahouse.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.projetIntegration.pharmahouse.entity.Consomation;
import com.example.projetIntegration.pharmahouse.entity.ConsomationKey;
import com.example.projetIntegration.pharmahouse.entity.Utilisateur;
import com.example.projetIntegration.pharmahouse.service.ConsomationService;
@RestController
@RequestMapping(value = "/consommation")
public class ConsomationController {
    @Autowired
    private ConsomationService consommationService;
    @PostMapping(value="/getallbypat")
    public List<Consomation> wsGetAllByUser(@RequestBody Utilisateur u){
        return consommationService.getConsomationsUtilisateur(u);
    }
    @GetMapping(value="/getall")
    public List<Consomation> wsGetAll(){
        return consommationService.findAll();
    }
    @PostMapping(value="/addconsom")
    public Consomation wsAjouter(@RequestBody Consomation consm){
       return consommationService.ajouterConsomation(consm);
    }  
    @PutMapping("/modifier")
	public Consomation modifierStock(@RequestBody Consomation consomation){
		 return consommationService.ajouterConsomation(consomation);
	}
    @PostMapping(value="/getbyid")
    public Optional<Consomation> wsGetById(@RequestBody ConsomationKey k){
        return consommationService.getByUtiletMed(k);
    }
}
