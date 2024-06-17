package com.example.projetIntegration.pharmahouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.projetIntegration.pharmahouse.entity.Utilisateur;
import com.example.projetIntegration.pharmahouse.service.UtilisateurService;
@RestController
@RequestMapping(value = "/utilisateur")
public class UtilisateurController {
    @Autowired
    UtilisateurService util_service;

    @GetMapping(value = "/actuelleutil/{idutil}")
    public Utilisateur wsGetUtilisateur(@PathVariable("idutil") Long id){
        return this.util_service.getActuelUtilisateur(id);
    }


    @PostMapping(value="/auth")
    public Utilisateur wsAuthentification(@RequestBody Utilisateur u){
        return this.util_service.authenticated(u);
    }

    @PostMapping(value = "/inscription")
    public Utilisateur wsGetUtilisateur(@RequestBody Utilisateur user){
        return this.util_service.ajouterUser(user);
    }

}