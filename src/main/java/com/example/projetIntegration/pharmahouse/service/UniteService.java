package com.example.projetIntegration.pharmahouse.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.projetIntegration.pharmahouse.repository.UniteRepo;
@Service
public class UniteService {
    @Autowired
    private UniteRepo uniteRepo; 
}
