package com.impacteducation.entity;
import jakarta.persistence.*;
import java.util.List;
@Entity
public class Responsable {
    @Id
    @GeneratedValue(strategy =
    GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenoms;
    private String email;
    private String telephone;
    @OneToMany(mappedBy = "responsable")
    private List<ResponsableEleve> eleves;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public List<ResponsableEleve> getEleves() {
        return eleves;
    }

    public void setEleves(List<ResponsableEleve> eleves) {
        this.eleves = eleves;
    }
    public Responsable(){

    }

    public Responsable(String nom, String prenoms, String email, String telephone) {
        this.nom = nom;
        this.prenoms = prenoms;
        this.email = email;
        this.telephone = telephone;
    }
}
