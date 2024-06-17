package com.example.projetIntegration.pharmahouse.entity;
import java.io.Serializable;
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
public class Ordonnance implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOrd;
    @ManyToOne
    @JoinColumn(name="id")
    private Utilisateur utilisateur;

    private String piece_jointe;
	private String porteur;
    @Basic
    @Column(name="date_insertion",nullable=true)
    private Date dateInsertion;
	public Long getIdOrd() {
		return idOrd;
	}
	public void setIdOrd(Long idOrd) {
		this.idOrd = idOrd;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public String getPiece_jointe() {
		return piece_jointe;
	}
	public void setPiece_jointe(String piece_jointe) {
		this.piece_jointe = piece_jointe;
	}
	public Date getDateInsertion() {
		return dateInsertion;
	}
	public void setDateInsertion(Date dateInsertion) {
		this.dateInsertion = dateInsertion;
	}
    
    
}
