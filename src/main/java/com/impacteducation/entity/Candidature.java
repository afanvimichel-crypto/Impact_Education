package com.impacteducation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.time.LocalDate;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class Candidature {
    @Id
    @GeneratedValue(strategy =
    GenerationType.IDENTITY)
    private Long id;
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



}
