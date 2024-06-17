package com.example.projetIntegration.pharmahouse.entity;
import java.util.Date;
public class Info {
    private Date dateprise;
    private Date datefinprise;
    private Long prisejour;
    private Long prisemidi;
    private Long prisesoir;
    private String piece_jointe;
    public Info(Date dateprise, Date datefinprise, Long prisejour, Long prisemidi, Long prisesoir,
            String piece_jointe) {
        this.dateprise = dateprise;
        this.datefinprise = datefinprise;
        this.prisejour = prisejour;
        this.prisemidi = prisemidi;
        this.prisesoir = prisesoir;
        this.piece_jointe = piece_jointe;
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
    public String getPiece_jointe() {
        return piece_jointe;
    }
    public void setPiece_jointe(String piece_jointe) {
        this.piece_jointe = piece_jointe;
    }
}
