package com.example.projetIntegration.pharmahouse.entity;
import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;
@Entity
@Table
@Data
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idmedicament")
    private Long id;
    @Basic
    @Column(length=30, nullable=false)
    private String nom;
    @Basic
    @Column(length=70, nullable=true)
    private String description;
    @Basic
    @Column(length=70, nullable=true)
    private String img ;
    @Basic
    @Column(name="date_expiration")
    private Date dateExpiration;
    @Basic
    @Column(name="prix",nullable=false)
    private double prix;
    @Basic
    @Column(name="quantite",nullable=false)
    private int quantite;
    @Basic
    @Column(name="fabricant",length=25, nullable=false)
    private String fabricant;
    @Basic
    @Column(length=4, nullable=false)
    private int dosage;
    @ManyToOne
    @JoinColumn( name="id_unite",referencedColumnName="id")
    private Unite unite;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public String getFabricant() {
		return fabricant;
	}
	public void setFabricant(String fabricant) {
		this.fabricant = fabricant;
	}
	public int getDosage() {
		return dosage;
	}
	public void setDosage(int dosage) {
		this.dosage = dosage;
	}
	public Unite getUnite() {
		return unite;
	}
	public void setUnite(Unite unite) {
		this.unite = unite;
	}
    
    
}
