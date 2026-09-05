package com.impacteducation.controller;

import com.impacteducation.entity.Responsable;
import com.impacteducation.service.ResponsableService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/responsables")
public class ResponsableController {

    private final ResponsableService responsableService;

    public ResponsableController(ResponsableService responsableService) {
        this.responsableService = responsableService;
    }

    @PostMapping
    public Responsable enregistrer(@RequestBody Responsable responsable) {
        return responsableService.enregistrer(responsable);
    }

    @GetMapping
    public List<Responsable> trouverTous() {
        return responsableService.trouverTous();
    }

    @GetMapping("/{id}")
    public Optional<Responsable> trouverParId(@PathVariable Long id) {
        return responsableService.trouverParId(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        responsableService.supprimer(id);
    }
}
