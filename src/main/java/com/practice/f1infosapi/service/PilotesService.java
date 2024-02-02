package com.practice.f1infosapi.service;

import com.practice.f1infosapi.entity.PilotesEntity;
import com.practice.f1infosapi.repository.PilotesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PilotesService {
    private final PilotesRepository pilotesRepository;
    public List<PilotesEntity> getAll() {
        return pilotesRepository.findAll();
    }

    public Optional<PilotesEntity> getById(int id) {
        return pilotesRepository.findById(id);
    }
}
