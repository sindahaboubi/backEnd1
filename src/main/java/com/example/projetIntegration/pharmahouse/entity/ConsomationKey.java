package com.example.projetIntegration.pharmahouse.entity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;
@Embeddable
public class ConsomationKey implements Serializable {
    @Column(name="idmedicament") 
    public Long idMed;
    @Column(name="id")
    public Long idUtil;
}
