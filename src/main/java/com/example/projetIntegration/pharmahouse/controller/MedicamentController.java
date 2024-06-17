package com.example.projetIntegration.pharmahouse.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetIntegration.pharmahouse.entity.Medicament;

import com.example.projetIntegration.pharmahouse.service.MedicamentService;

@RestController
@RequestMapping(value = "/medicament")
public class MedicamentController {
    

    @Autowired
    MedicamentService medicamentService;


    @GetMapping(value="/getall")
    public List<Medicament> wsGetAll(){
        return medicamentService.getAll();
    }
    @PostMapping(value="/addmedic")
    public Medicament wsAjouter(@RequestBody Medicament medicament){
       return medicamentService.ajouterMed(medicament);
    }
    @GetMapping(value="/rechercher")
    public List<Medicament> wsRechercher(@RequestBody String nom){
        return medicamentService.RechercherMedicament(nom);
    }
    @PostMapping(value="/getmedbyid")
    public Optional<Medicament> wsGetById(@RequestBody Long id){
        return medicamentService.getMedicamentById(id);
    }
}
