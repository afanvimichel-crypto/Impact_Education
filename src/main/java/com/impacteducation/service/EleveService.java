
package com.impacteducation.service;

import com.impacteducation.entity.Eleve;
import com.impacteducation.repository.EleveRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EleveService {

    private final EleveRepository eleveRepository;

    public EleveService(EleveRepository eleveRepository) {
        this.eleveRepository = eleveRepository;
    }

    public Eleve enregistrer(Eleve eleve) {
        return eleveRepository.save(eleve);
    }

    public List<Eleve> trouverTous() {
        return eleveRepository.findAll();
    }

    public Optional<Eleve> trouverParId(Long id) {
        return eleveRepository.findById(id);
    }

    public void supprimer(Long id) {
        eleveRepository.deleteById(id);
    }
}
