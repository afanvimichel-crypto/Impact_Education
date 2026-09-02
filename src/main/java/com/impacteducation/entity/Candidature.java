package com.impacteducation.entity;

import jakarta.persistence.*;
import java.util.List;
import java.time.LocalDate;

@Entity
public class Candidature {
    @Id
    @GeneratedValue(strategy =
    GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Eleve eleve;

    private String nom;
    private String prenoms;
    private LocalDate dateDeNaissance;
    private String emailDemandeur;
    @Enumerated(EnumType.STRING)
    private TypeDemandeur typeDemandeur;
    private String etablissementDeProvenance;
    @Enumerated(EnumType.STRING)
    private ClasseScolaire classeDemandee;

    @Enumerated(EnumType.STRING)
    private StatutCandidature statut;

    private String anneeScolaire;
    @Enumerated(EnumType.STRING)
    private TypeEleve typeEleve;
    @Enumerated(EnumType.STRING)
    private TypeClasse typeClasse;
    @Enumerated(EnumType.STRING)
    private SituationScolaire situationScolaire;
    @OneToMany(mappedBy = "candidature",
    cascade = CascadeType.ALL,
    orphanRemoval = true)
    private List<PieceJustificative>
    pieceJustificatives;

public Candidature(){

}

    public Candidature(Eleve eleve, String nom, String prenoms, LocalDate dateDeNaissance, String emailDemandeur, TypeDemandeur typeDemandeur, String etablissementDeProvenance, ClasseScolaire classeDemandee, StatutCandidature statut, String anneeScolaire, TypeEleve typeEleve, TypeClasse typeClasse, SituationScolaire situationScolaire) {
        this.eleve = eleve;
        this.nom = nom;
        this.prenoms = prenoms;
        this.dateDeNaissance = dateDeNaissance;
        this.emailDemandeur = emailDemandeur;
        this.typeDemandeur = typeDemandeur;
        this.etablissementDeProvenance = etablissementDeProvenance;
        this.classeDemandee = classeDemandee;
        this.statut = statut;
        this.anneeScolaire = anneeScolaire;
        this.typeEleve = typeEleve;
        this.typeClasse = typeClasse;
        this.situationScolaire = situationScolaire;
    }
    public List<PieceJustificative>getPieceJustificatives(){
    return pieceJustificatives;
    }
    public void setPieceJustificatives(List<PieceJustificative> pieceJustificatives){
    this.pieceJustificatives=pieceJustificatives;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
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

    public String getEmailDemandeur() {
        return emailDemandeur;
    }

    public void setEmailDemandeur(String emailDemandeur) {
        this.emailDemandeur = emailDemandeur;
    }

    public TypeDemandeur getTypeDemandeur() {
        return typeDemandeur;
    }

    public void setTypeDemandeur(TypeDemandeur typeDemandeur) {
        this.typeDemandeur = typeDemandeur;
    }

    public String getEtablissementDeProvenance() {
        return etablissementDeProvenance;
    }

    public void setEtablissementDeProvenance(String etablissementDeProvenance) {
        this.etablissementDeProvenance = etablissementDeProvenance;
    }

    public ClasseScolaire getClasseDemandee() {
        return classeDemandee;
    }

    public void setClasseDemandee(ClasseScolaire classeDemandee) {
        this.classeDemandee = classeDemandee;
    }

    public StatutCandidature getStatut() {
        return statut;
    }

    public void setStatut(StatutCandidature statut) {
        this.statut = statut;
    }

    public String getAnneeScolaire() {
        return anneeScolaire;
    }

    public void setAnneeScolaire(String anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }

    public TypeEleve getTypeEleve() {
        return typeEleve;
    }

    public void setTypeEleve(TypeEleve typeEleve) {
        this.typeEleve = typeEleve;
    }

    public TypeClasse getTypeClasse() {
        return typeClasse;
    }

    public void setTypeClasse(TypeClasse typeClasse) {
        this.typeClasse = typeClasse;
    }

    public SituationScolaire getSituationScolaire() {
        return situationScolaire;
    }

    public void setSituationScolaire(SituationScolaire situationScolaire) {
        this.situationScolaire = situationScolaire;
    }
}
