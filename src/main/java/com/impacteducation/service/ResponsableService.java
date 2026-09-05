package com.impacteducation.service;

import com.impacteducation.entity.Responsable;
import com.impacteducation.repository.ResponsableRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ResponsableService {

    private final ResponsableRepository responsableRepository;

    public ResponsableService(ResponsableRepository responsableRepository) {
        this.responsableRepository = responsableRepository;
    }

    public Responsable enregistrer(Responsable responsable) {
        return responsableRepository.save(responsable);
    }

    public List<Responsable> trouverTous() {
        return responsableRepository.findAll();
    }

    public Optional<Responsable> trouverParId(Long id) {
        return responsableRepository.findById(id);
    }

    public void supprimer(Long id) {
        responsableRepository.deleteById(id);
    }
}
