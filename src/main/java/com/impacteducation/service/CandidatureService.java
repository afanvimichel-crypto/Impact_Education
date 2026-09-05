package com.impacteducation.service;

import com.impacteducation.entity.Candidature;
import com.impacteducation.repository.CandidatureRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidatureService {

    private final CandidatureRepository candidatureRepository;

    public CandidatureService(CandidatureRepository candidatureRepository) {
        this.candidatureRepository = candidatureRepository;
    }

    public Candidature enregistrer(Candidature candidature) {
        return candidatureRepository.save(candidature);
    }

    public List<Candidature> trouverToutes() {
        return candidatureRepository.findAll();
    }

    public Optional<Candidature> trouverParId(Long id) {
        return candidatureRepository.findById(id);
    }

    public void supprimer(Long id) {
        candidatureRepository.deleteById(id);
    }
}

