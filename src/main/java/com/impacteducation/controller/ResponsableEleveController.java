package com.impacteducation.controller;

import com.impacteducation.entity.ResponsableEleve;
import com.impacteducation.service.ResponsableEleveService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/responsables-eleves")
public class ResponsableEleveController {

    private final ResponsableEleveService responsableEleveService;

    public ResponsableEleveController(ResponsableEleveService responsableEleveService) {
        this.responsableEleveService = responsableEleveService;
    }

    @PostMapping
    public ResponsableEleve enregistrer(@RequestBody ResponsableEleve responsableEleve) {
        return responsableEleveService.enregistrer(responsableEleve);
    }

    @GetMapping
    public List<ResponsableEleve> trouverTous() {
        return responsableEleveService.trouverTous();
    }

    @GetMapping("/{id}")
    public Optional<ResponsableEleve> trouverParId(@PathVariable Long id) {
        return responsableEleveService.trouverParId(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        responsableEleveService.supprimer(id);
    }
}
