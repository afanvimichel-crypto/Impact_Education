package com.impacteducation.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.List;
import java.time.LocalDate;
@Entity
public class Eleve {
    @Id
   @GeneratedValue(strategy =
   GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenoms;
    private LocalDate dateDeNaissance;
    private String lieuDeNaissance;
    @Enumerated(EnumType.STRING)
    private Sexe sexe;
    @Enumerated(EnumType.STRING)
    private TypeEleve typeEleve;
    @OneToMany(mappedBy = "eleve")
    private List<ResponsableEleve> responsables;
    @OneToMany(mappedBy = "eleve")
    private List<HistoriqueScolaire> historiqueScolaire;
    @OneToMany(mappedBy = "eleve")
    private List<Candidature> candidatures;

    public Eleve(){

    }

    public Eleve(String nom, String prenoms, LocalDate dateDeNaissance, String lieuDeNaissance, Sexe sexe, TypeEleve typeEleve) {
        this.nom = nom;
        this.prenoms = prenoms;
        this.dateDeNaissance = dateDeNaissance;
        this.lieuDeNaissance = lieuDeNaissance;
        this.sexe = sexe;
        this.typeEleve = typeEleve;
    }

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

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getLieuDeNaissance() {
        return lieuDeNaissance;
    }

    public void setLieuDeNaissance(String lieuDeNaissance) {
        this.lieuDeNaissance = lieuDeNaissance;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public TypeEleve getTypeEleve() {
        return typeEleve;
    }

    public void setTypeEleve(TypeEleve typeEleve) {
        this.typeEleve = typeEleve;
    }

    public List<ResponsableEleve> getResponsables() {
        return responsables;
    }

    public void setResponsables(List<ResponsableEleve> responsables) {
        this.responsables = responsables;
    }

    public List<HistoriqueScolaire> getHistoriqueScolaire() {
        return historiqueScolaire;
    }

    public void setHistoriqueScolaire(List<HistoriqueScolaire> historiqueScolaire) {
        this.historiqueScolaire = historiqueScolaire;
    }

    public List<Candidature> getCandidatures() {
        return candidatures;
    }

    public void setCandidatures(List<Candidature> candidatures) {
        this.candidatures = candidatures;
    }
}
