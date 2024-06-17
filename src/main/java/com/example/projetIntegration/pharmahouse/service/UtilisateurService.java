package com.example.projetIntegration.pharmahouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.example.projetIntegration.pharmahouse.entity.Utilisateur;
import com.example.projetIntegration.pharmahouse.repository.UtilisateurRepo;
@Service
public class UtilisateurService {
    @Autowired
    private UtilisateurRepo util_Repo;

    private PasswordEncoder encoder = new BCryptPasswordEncoder();
    
    public Utilisateur getActuelUtilisateur(Long id) {
        return this.util_Repo.getById(id);
    }

    public Utilisateur ajouterUser(Utilisateur user){
        if(this.util_Repo.findUtilisateurByEmail(user.getEmail()) == null)
        {
            String hashedPassword = encoder.encode(user.getPassword());
            user.setPassword(hashedPassword);
            return util_Repo.save(user);
        }
        return null;
    }

    public Utilisateur authenticated(Utilisateur u){
        Utilisateur user =  util_Repo.findUtilisateurByEmail(u.getEmail());
        if(user != null ) {
			boolean isPasswordValid = encoder.matches(u.getPassword(), user.getPassword());
			if(isPasswordValid)
				return user;
            else
                return null;
        }else
           return null;
            

    }
}
