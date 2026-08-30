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

}
