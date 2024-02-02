package com.practice.f1infosapi.controller;

import com.practice.f1infosapi.dto.PilotesDto;
import com.practice.f1infosapi.mapper.PilotesMapper;
import com.practice.f1infosapi.service.PilotesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class PilotesController {
    private final PilotesService pilotesService;
    private final PilotesMapper pilotesMapper;

    // Get all drivers
    @GetMapping("/api/v1/pilotes")
    public List<PilotesDto> getAll() {
        return pilotesService.getAll().stream().map(pilotesMapper::toDto).toList();
    }

    // Get driver by ID
    @GetMapping("/api/v1/pilotes/{id}")
    public PilotesDto getById(@PathVariable int id) {
       return pilotesMapper.toDto(pilotesService.getById(id));
    }

    // Create driver
    @PostMapping("/api/v1/pilotes")
    public PilotesDto createOrUpdatePilote(@RequestBody PilotesDto form) {
        return pilotesMapper.toDto(pilotesService.createOrUpdatePilote(form));
    }
}

