package com.example.projetIntegration.pharmahouse.entity;
import java.util.Date;
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
public class Prise {
    @EmbeddedId
    private PriseKey id;
    @ManyToOne
    @MapsId("idMed")
    @JoinColumn(name="idmedicament")
    private Medicament med;
    @ManyToOne
    @MapsId("idOrd")
    @JoinColumn(name="id_ord")
    private Ordonnance ord;
    private Date dateprise;
    private Date datefinprise;
    private Long prisejour;
    private Long prisemidi;
    private Long prisesoir;
    private boolean pris;
    
	public PriseKey getId() {
		return id;
	}
	public void setId(PriseKey id) {
		this.id = id;
	}
	public Medicament getMed() {
		return med;
	}
	public void setMed(Medicament med) {
		this.med = med;
	}
	public Ordonnance getOrd() {
		return ord;
	}
	public void setOrd(Ordonnance ord) {
		this.ord = ord;
	}
	public Date getDateprise() {
		return dateprise;
	}
	public void setDateprise(Date dateprise) {
		this.dateprise = dateprise;
	}
	public Date getDatefinprise() {
		return datefinprise;
	}
	public void setDatefinprise(Date datefinprise) {
		this.datefinprise = datefinprise;
	}
	public Long getPrisejour() {
		return prisejour;
	}
	public void setPrisejour(Long prisejour) {
		this.prisejour = prisejour;
	}
	public Long getPrisemidi() {
		return prisemidi;
	}
	public void setPrisemidi(Long prisemidi) {
		this.prisemidi = prisemidi;
	}
	public Long getPrisesoir() {
		return prisesoir;
	}
	public void setPrisesoir(Long prisesoir) {
		this.prisesoir = prisesoir;
	}
	public boolean isPris() {
		return pris;
	}
	public void setPris(boolean pris) {
		this.pris = pris;
	} 
    
    
}
