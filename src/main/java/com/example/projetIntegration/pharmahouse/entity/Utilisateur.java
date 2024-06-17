package com.example.projetIntegration.pharmahouse.entity;
import java.sql.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
@Entity
@Table
@Data
public class Utilisateur {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Basic
    @Column(name="nom",nullable = false,length=25)
    private String nom ;
    @Basic
    @Column(name="prenom",nullable = false,length=25)
    private String prenom ="";
    @Basic
    @Column(name="email",nullable = false,length=50,unique=true)
    private String email ;
    @Basic
    @Column(name="telephone",nullable = false,length=25)
    private String telephone ;
    @Basic
    @Column(name="password",nullable = false,length=255)
    private String password ;
    @Basic
    @Column(name="adresse",nullable = false,length=40)
    private String adresse ;
    @Basic
    @Column(name="date_naissence")
    private Date dateNaissence;
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
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Date getDateNaissence() {
		return dateNaissence;
	}
	public void setDateNaissence(Date dateNaissence) {
		this.dateNaissence = dateNaissence;
	}    
    
    
}
