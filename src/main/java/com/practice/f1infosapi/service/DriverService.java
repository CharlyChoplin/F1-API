package com.practice.f1infosapi.service;

import ch.qos.logback.classic.encoder.JsonEncoder;
import com.practice.f1infosapi.dto.DriverFormDto;
import com.practice.f1infosapi.entity.DriverEntity;
import com.practice.f1infosapi.entity.TeamEntity;
import com.practice.f1infosapi.exception.F1NotFoundException;
import com.practice.f1infosapi.mapper.DriverMapper;
import com.practice.f1infosapi.repository.DriverRepository;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class DriverService {
    private final DriverRepository driverRepository;
    private final DriverMapper driverMapper;
    private final TeamService teamService;
    private final PasswordEncoder passwordEncoder;

    public List<DriverEntity> getAll() {
        return driverRepository.findAll();
    }

    public DriverEntity getById(@NotNull Integer id) {
        return driverRepository.findById(id).orElseThrow(
                () -> new F1NotFoundException("Pilote not found")
        );
    }

    public DriverEntity createOrUpdatePilote(DriverFormDto form) {
        if (form.getId() == null) {
            TeamEntity team = teamService.getById(form.getTeamId());
            return driverRepository.save(driverMapper.toEntity(form, team));
        } else {
            DriverEntity piloteToUpdate = getById(form.getId());

            piloteToUpdate.setFirstName(form.getFirstName());
            piloteToUpdate.setLastName(form.getLastName());
            return driverRepository.save(piloteToUpdate);
        }
    }

    public void deletePilote(@NotNull Integer id) {
        driverRepository.deleteById(id);
    }
}
