package com.example.projetIntegration.pharmahouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetIntegration.pharmahouse.service.UniteService;

@RestController
@RequestMapping(value = "/unite")
public class UniteController {

    @Autowired
    UniteService uniteservice;
    
}
