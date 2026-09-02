package com.impacteducation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;
@Entity
public class PieceJustificative {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Enumerated(EnumType.STRING)
    private TypePieceJustificative typePieceJustificative;
    private String nomDuFichier;
    private String cheminDuFichier;
    private LocalDateTime dateDeDepot;
    @ManyToOne
    private Candidature candidature;





    public PieceJustificative(){

    }

    public PieceJustificative(TypePieceJustificative typePieceJustificative, String nomDuFichier, String cheminDuFichier, LocalDateTime dateDeDepot, Candidature candidature) {
        this.typePieceJustificative = typePieceJustificative;
        this.nomDuFichier = nomDuFichier;
        this.cheminDuFichier = cheminDuFichier;
        this.dateDeDepot = dateDeDepot;
        this.candidature = candidature;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TypePieceJustificative getTypePieceJustificative() {
        return typePieceJustificative;
    }

    public void setTypePieceJustificative(TypePieceJustificative typePieceJustificative) {
        this.typePieceJustificative = typePieceJustificative;
    }

    public String getNomDuFichier() {
        return nomDuFichier;
    }

    public void setNomDuFichier(String nomDuFichier) {
        this.nomDuFichier = nomDuFichier;
    }

    public String getCheminDuFichier() {
        return cheminDuFichier;
    }

    public void setCheminDuFichier(String cheminDuFichier) {
        this.cheminDuFichier = cheminDuFichier;
    }

    public LocalDateTime getDateDeDepot() {
        return dateDeDepot;
    }

    public void setDateDeDepot(LocalDateTime dateDeDepot) {
        this.dateDeDepot = dateDeDepot;
    }

    public Candidature getCandidature() {
        return candidature;
    }

    public void setCandidature(Candidature candidature) {
        this.candidature = candidature;
    }
}
