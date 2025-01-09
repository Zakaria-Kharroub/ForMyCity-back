package com.example.city.service.impl;

import com.example.city.domain.Reclamation;
import com.example.city.repository.ReclamationRepository;
import com.example.city.service.ReclamationService;
import org.springframework.stereotype.Service;

@Service
public class ReclamationServiceImpl implements ReclamationService {
    private final ReclamationRepository reclamationRepository;
    public ReclamationServiceImpl(ReclamationRepository reclamationRepository) {
        this.reclamationRepository = reclamationRepository;
    }

    @Override
    public Reclamation save(Reclamation reclamation) {
        return reclamationRepository.save(reclamation);
    }
}
