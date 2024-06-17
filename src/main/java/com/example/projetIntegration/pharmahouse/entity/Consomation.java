package com.example.projetIntegration.pharmahouse.entity;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;
import lombok.Data;
@Entity
@Table
@Data
public class Consomation implements Serializable{
    @EmbeddedId
    private ConsomationKey id;
    @ManyToOne
    @MapsId("idMed")
    @JoinColumn(name="idmedicament")
    private Medicament med;
    @ManyToOne
    @MapsId("idUtil")
    @JoinColumn(name="id")
    private Utilisateur pat;
    @Basic
    @Column(name="qte_stock",length=4)
    private  Long qte_stock;
	public ConsomationKey getId() {
		return id;
	}
	public void setId(ConsomationKey id) {
		this.id = id;
	}
	public Medicament getMed() {
		return med;
	}
	public void setMed(Medicament med) {
		this.med = med;
	}
	public Utilisateur getPat() {
		return pat;
	}
	public void setPat(Utilisateur pat) {
		this.pat = pat;
	}
	public Long getQte_stock() {
		return qte_stock;
	}
	public void setQte_stock(Long qte_stock) {
		this.qte_stock = qte_stock;
	}
    
    
}
