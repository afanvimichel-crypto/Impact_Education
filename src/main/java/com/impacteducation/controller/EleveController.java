package com.impacteducation.controller;

import com.impacteducation.entity.Eleve;
import com.impacteducation.service.EleveService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/eleves")
public class EleveController {

    private final EleveService eleveService;

    public EleveController(EleveService eleveService) {
        this.eleveService = eleveService;
    }

    @PostMapping
    public Eleve enregistrer(@RequestBody Eleve eleve) {
        return eleveService.enregistrer(eleve);
    }

    @GetMapping
    public List<Eleve> trouverTous() {
        return eleveService.trouverTous();
    }

    @GetMapping("/{id}")
    public Optional<Eleve> trouverParId(@PathVariable Long id) {
        return eleveService.trouverParId(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        eleveService.supprimer(id);
    }
}