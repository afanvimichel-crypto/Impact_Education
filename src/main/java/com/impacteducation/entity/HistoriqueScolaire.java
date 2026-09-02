package com.impacteducation.entity;

import jakarta.persistence.*;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity
public class HistoriqueScolaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String anneeScolaire;
@Enumerated(EnumType.STRING)
    private ClasseScolaire classe;
@Enumerated(EnumType.STRING)
    private SituationScolaire situation;
@Enumerated(EnumType.STRING)
    private DecisionScolaire decision;
@ManyToOne
    private Eleve eleve;

public HistoriqueScolaire(){

}

    public HistoriqueScolaire(String anneeScolaire, ClasseScolaire classe, SituationScolaire situation, DecisionScolaire decision, Eleve eleve) {
        this.anneeScolaire = anneeScolaire;
        this.classe = classe;
        this.situation = situation;
        this.decision = decision;
        this.eleve = eleve;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnneeScolaire() {
        return anneeScolaire;
    }

    public void setAnneeScolaire(String anneeScolaire) {
        this.anneeScolaire = anneeScolaire;
    }

    public ClasseScolaire getClasse() {
        return classe;
    }

    public void setClasse(ClasseScolaire classe) {
        this.classe = classe;
    }

    public SituationScolaire getSituation() {
        return situation;
    }

    public void setSituation(SituationScolaire situation) {
        this.situation = situation;
    }

    public DecisionScolaire getDecision() {
        return decision;
    }

    public void setDecision(DecisionScolaire decision) {
        this.decision = decision;
    }

    public Eleve getEleve() {
        return eleve;
    }

    public void setEleve(Eleve eleve) {
        this.eleve = eleve;
    }
}
