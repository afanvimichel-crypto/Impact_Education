package com.impacteducation.controller;

import com.impacteducation.entity.Candidature;
import com.impacteducation.service.CandidatureService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/candidatures")
public class CandidatureController {

    private final CandidatureService candidatureService;

    public CandidatureController(CandidatureService candidatureService) {
        this.candidatureService = candidatureService;
    }

    @PostMapping
    public Candidature enregistrer(@RequestBody Candidature candidature) {
        return candidatureService.enregistrer(candidature);
    }

    @GetMapping
    public List<Candidature> trouverToutes() {
        return candidatureService.trouverToutes();
    }

    @GetMapping("/{id}")
    public Optional<Candidature> trouverParId(@PathVariable Long id) {
        return candidatureService.trouverParId(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        candidatureService.supprimer(id);
    }
}