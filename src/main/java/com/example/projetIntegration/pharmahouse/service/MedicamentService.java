package com.example.projetIntegration.pharmahouse.service;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.projetIntegration.pharmahouse.entity.Medicament;
import com.example.projetIntegration.pharmahouse.repository.MedicamentRepo;
@Service
public class MedicamentService {
    @Autowired
    private MedicamentRepo medicamentRepo;
    public List<Medicament> getAll(){
        return   this.medicamentRepo.findAll();
    }
    public Medicament ajouterMed(Medicament medicament){
        return medicamentRepo.save(medicament);
    }
    public List<Medicament> RechercherMedicament(String nom){
        return medicamentRepo.findAllByNom(nom);
    }
    public Optional<Medicament> getMedicamentById(Long id){
        return medicamentRepo.findById(id);
    }
    /*public void ajouterPatient(Long id,Utilisateur patient){
        
        Medicament new_med= this.medicamentRepo.getById(id);
        new_med.getPatients().add(patient);
        this.medicamentRepo.save(new_med);
        
    }*/
}
