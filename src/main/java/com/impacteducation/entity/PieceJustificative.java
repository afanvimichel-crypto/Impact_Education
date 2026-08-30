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
    private Long Id;
    @Enumerated(EnumType.STRING)
    private TypePieceJustificative typePieceJustificative;
    private String nomDuFichier;
    private String cheminDuFichier;
    private LocalDateTime dateDeDepot;
    @ManyToOne
    private Candidature candidature;

}
