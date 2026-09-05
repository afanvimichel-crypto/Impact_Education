package com.impacteducation.controller;

import com.impacteducation.entity.HistoriqueScolaire;
import com.impacteducation.service.HistoriqueScolaireService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/historiques-scolaires")
public class HistoriqueScolaireController {

    private final HistoriqueScolaireService historiqueScolaireService;

    public HistoriqueScolaireController(HistoriqueScolaireService historiqueScolaireService) {
        this.historiqueScolaireService = historiqueScolaireService;
    }

    @PostMapping
    public HistoriqueScolaire enregistrer(@RequestBody HistoriqueScolaire historique) {
        return historiqueScolaireService.enregistrer(historique);
    }

    @GetMapping
    public List<HistoriqueScolaire> trouverTous() {
        return historiqueScolaireService.trouverTous();
    }

    @GetMapping("/{id}")
    public Optional<HistoriqueScolaire> trouverParId(@PathVariable Long id) {
        return historiqueScolaireService.trouverParId(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        historiqueScolaireService.supprimer(id);
    }
}
