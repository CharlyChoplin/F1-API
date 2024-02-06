package com.practice.f1infosapi.controller;

import com.practice.f1infosapi.dto.DriverFormDto;
import com.practice.f1infosapi.dto.DriverResponseDto;
import com.practice.f1infosapi.mapper.DriverMapper;
import com.practice.f1infosapi.service.DriverService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class DriverController {
    private final DriverService driverService;
    private final DriverMapper driverMapper;

    // Get all drivers
    @GetMapping("/api/v1/drivers")
    public List<DriverResponseDto> getAll() {
        return driverService.getAll().stream().map(driverMapper::toDto).toList();
    }

    // Get driver by ID
    @GetMapping("/api/v1/drivers/{id}")
    public DriverResponseDto getById(@PathVariable Integer id) {
        return driverMapper.toDto(driverService.getById(id));
    }

    // Create driver
    @PostMapping("/api/v1/drivers")
    public DriverResponseDto createOrUpdateDriver(@RequestBody @Valid DriverFormDto form) {
        return driverMapper.toDto(driverService.createOrUpdatePilote(form));
    }


    // Delete driver
    @DeleteMapping("/api/v1/drivers/{id}")
    public void deleteDriver(@PathVariable Integer id) {
        driverService.deletePilote(id);
    }

    // example with @Transactional : You can add this tag to check if everything is doable or cancel everything
}

