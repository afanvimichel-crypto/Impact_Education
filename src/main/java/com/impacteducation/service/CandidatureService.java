package com.impacteducation.service;

import com.impacteducation.entity.Candidature;
import com.impacteducation.entity.StatutCandidature;
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

   public Candidature enregistrer(Candidature candidature){
        candidature.setStatut(StatutCandidature.EN_ATTENTE);
        return candidatureRepository.save(candidature);
   }
    public Candidature mettreEnEtude(Long id) {
        Optional<Candidature> candidatureOptional = candidatureRepository.findById(id);

        if (candidatureOptional.isEmpty()) {
            throw new RuntimeException("Candidature introuvable");
        }

        Candidature candidature = candidatureOptional.get();
        candidature.setStatut(StatutCandidature.EN_ETUDE);

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

