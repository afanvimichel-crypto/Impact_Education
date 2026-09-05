package com.impacteducation.service;

import com.impacteducation.entity.ResponsableEleve;
import com.impacteducation.repository.ResponsableEleveRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponsableEleveService {

    private final ResponsableEleveRepository responsableEleveRepository;

    public ResponsableEleveService(ResponsableEleveRepository responsableEleveRepository) {
        this.responsableEleveRepository = responsableEleveRepository;
    }

    public ResponsableEleve enregistrer(ResponsableEleve responsableEleve) {
        return responsableEleveRepository.save(responsableEleve);
    }

    public List<ResponsableEleve> trouverTous() {
        return responsableEleveRepository.findAll();
    }

    public Optional<ResponsableEleve> trouverParId(Long id) {
        return responsableEleveRepository.findById(id);
    }

    public void supprimer(Long id) {
        responsableEleveRepository.deleteById(id);
    }
}
