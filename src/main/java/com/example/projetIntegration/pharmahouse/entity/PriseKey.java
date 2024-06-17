package com.example.projetIntegration.pharmahouse.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class PriseKey implements Serializable {
    @Column(name="idmedicament") 
    public Long idMed;
    @Column(name="idOrd")
    public Long idOrd;
}
