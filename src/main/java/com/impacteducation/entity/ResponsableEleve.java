package com.impacteducation.entity;

import jakarta.persistence.*;
@Entity
public class ResponsableEleve {
    @Id
    @GeneratedValue(strategy =
    GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Eleve eleve;
    @ManyToOne
    private Responsable responsable;
    @Enumerated(EnumType.STRING)
    private TypeResponsabilite typeResponsabilite;

    public ResponsableEleve(){

    }

    public ResponsableEleve( Eleve eleve, Responsable responsable, TypeResponsabilite typeResponsabilite) {
        this.eleve = eleve;
        this.responsable = responsable;
        this.typeResponsabilite = typeResponsabilite;
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

    public Responsable getResponsable() {
        return responsable;
    }

    public void setResponsable(Responsable responsable) {
        this.responsable = responsable;
    }

    public TypeResponsabilite getTypeResponsabilite() {
        return typeResponsabilite;
    }

    public void setTypeResponsabilite(TypeResponsabilite typeResponsabilite) {
        this.typeResponsabilite = typeResponsabilite;
    }
}

