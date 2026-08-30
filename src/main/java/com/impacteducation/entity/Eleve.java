package com.impacteducation.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Eleve {
    @Id
   @GeneratedValue(strategy =
   GenerationType.IDENTITY)
    private Long id;

}
