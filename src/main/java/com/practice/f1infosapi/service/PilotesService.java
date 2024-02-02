package com.practice.f1infosapi.service;

import com.practice.f1infosapi.dto.PilotesDto;
import com.practice.f1infosapi.entity.PilotesEntity;
import com.practice.f1infosapi.exception.F1NotFoundException;
import com.practice.f1infosapi.mapper.PilotesMapper;
import com.practice.f1infosapi.repository.PilotesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PilotesService {
    private final PilotesRepository pilotesRepository;
    private final PilotesMapper pilotesMapper;

    public List<PilotesEntity> getAll() {
        return pilotesRepository.findAll();
    }

    public PilotesEntity getById(int id) {
        return pilotesRepository.findById(id).orElseThrow(
                () -> new F1NotFoundException("Pilote not found")
        );
    }

    public PilotesEntity createOrUpdatePilote(PilotesDto form) {
        if (form.getId() == null) {
            return pilotesRepository.save(pilotesMapper.toEntity(form));
        } else {
            PilotesEntity piloteToUpdate = getById(form.getId());

            piloteToUpdate.setName(form.getName());
            piloteToUpdate.setSurname(form.getSurname());
            return pilotesRepository.save(piloteToUpdate);
        }
    }

    public void deletePilote(Integer id) {
        pilotesRepository.deleteById(id);
    }
}
