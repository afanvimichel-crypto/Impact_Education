package com.impacteducation.service;

import com.impacteducation.entity.PieceJustificative;
import com.impacteducation.repository.PieceJustificativeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PieceJustificativeService {

    private final PieceJustificativeRepository pieceJustificativeRepository;

    public PieceJustificativeService(PieceJustificativeRepository pieceJustificativeRepository) {
        this.pieceJustificativeRepository = pieceJustificativeRepository;
    }

    public PieceJustificative enregistrer(PieceJustificative piece) {
        return pieceJustificativeRepository.save(piece);
    }

    public List<PieceJustificative> trouverToutes() {
        return pieceJustificativeRepository.findAll();
    }

    public Optional<PieceJustificative> trouverParId(Long id) {
        return pieceJustificativeRepository.findById(id);
    }

    public void supprimer(Long id) {
        pieceJustificativeRepository.deleteById(id);
    }
}