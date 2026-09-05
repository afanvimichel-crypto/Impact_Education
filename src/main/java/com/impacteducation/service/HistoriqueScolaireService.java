package com.impacteducation.service;

import com.impacteducation.entity.HistoriqueScolaire;
import com.impacteducation.repository.HistoriqueScolaireRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistoriqueScolaireService {

    private final HistoriqueScolaireRepository historiqueScolaireRepository;

    public HistoriqueScolaireService(HistoriqueScolaireRepository historiqueScolaireRepository) {
        this.historiqueScolaireRepository = historiqueScolaireRepository;
    }

    public HistoriqueScolaire enregistrer(HistoriqueScolaire historique) {
        return historiqueScolaireRepository.save(historique);
    }

    public List<HistoriqueScolaire> trouverTous() {
        return historiqueScolaireRepository.findAll();
    }

    public Optional<HistoriqueScolaire> trouverParId(Long id) {
        return historiqueScolaireRepository.findById(id);
    }

    public void supprimer(Long id) {
        historiqueScolaireRepository.deleteById(id);
    }
}
