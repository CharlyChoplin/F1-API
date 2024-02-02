package com.practice.f1infosapi.service;

import com.practice.f1infosapi.entity.PilotesEntity;
import com.practice.f1infosapi.exception.F1NotFoundException;
import com.practice.f1infosapi.repository.PilotesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PilotesService {
    private final PilotesRepository pilotesRepository;
    public List<PilotesEntity> getAll() {
        return pilotesRepository.findAll();
    }

    public PilotesEntity getById(int id) {
        return pilotesRepository.findById(id).orElseThrow(
                () -> new F1NotFoundException("Pilote not found")
        );
    }
}
