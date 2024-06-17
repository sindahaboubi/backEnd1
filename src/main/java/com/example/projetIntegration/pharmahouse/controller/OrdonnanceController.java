package com.example.projetIntegration.pharmahouse.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetIntegration.pharmahouse.entity.Ordonnance;
import com.example.projetIntegration.pharmahouse.entity.Utilisateur;
import com.example.projetIntegration.pharmahouse.service.OrdonnanceService;
@RestController
@RequestMapping(value = "/ordonnance")
public class OrdonnanceController {

    @Autowired
    private OrdonnanceService ordServ;

    @PostMapping(value="/addOrd")
    public Ordonnance wsAjouter(@RequestBody Ordonnance o){
       return ordServ.ajouterOrd(o);
    }
    
    @GetMapping(value="/getOrd")
    public List<Ordonnance> wsGetAll(){
       return ordServ.getAll();
    }

    @PostMapping(value="/get/UtilOrd")
    public List<Ordonnance> wsGetAllUtilOrd(@RequestBody Utilisateur u ){
      return ordServ.getAllUtilisateurOrd(u);
   }

   @DeleteMapping(value="/kill/ord/{idord}")
   public void wsDeleteUtilOrdById(@PathVariable("idord") Long id){
      this.ordServ.deleteOrdById(id);
   }
   
	@GetMapping("/all/{id}")
	public ResponseEntity<Ordonnance> getOrdonnanceById(@PathVariable Long id){
		return new ResponseEntity<>(ordServ.findById(id),HttpStatus.OK);
	}
}
