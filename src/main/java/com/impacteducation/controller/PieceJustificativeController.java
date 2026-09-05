package com.impacteducation.controller;

import com.impacteducation.entity.PieceJustificative;
import com.impacteducation.service.PieceJustificativeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pieces-justificatives")
public class PieceJustificativeController {

    private final PieceJustificativeService pieceJustificativeService;

    public PieceJustificativeController(PieceJustificativeService pieceJustificativeService) {
        this.pieceJustificativeService = pieceJustificativeService;
    }

    @PostMapping
    public PieceJustificative enregistrer(@RequestBody PieceJustificative piece) {
        return pieceJustificativeService.enregistrer(piece);
    }

    @GetMapping
    public List<PieceJustificative> trouverToutes() {
        return pieceJustificativeService.trouverToutes();
    }

    @GetMapping("/{id}")
    public Optional<PieceJustificative> trouverParId(@PathVariable Long id) {
        return pieceJustificativeService.trouverParId(id);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        pieceJustificativeService.supprimer(id);
    }
}
