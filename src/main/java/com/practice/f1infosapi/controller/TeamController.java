package com.practice.f1infosapi.controller;

import com.practice.f1infosapi.dto.TeamDto;
import com.practice.f1infosapi.mapper.TeamMapper;
import com.practice.f1infosapi.service.TeamService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TeamController {
    private final TeamService teamService;
    private final TeamMapper teamMapper;

    // Get all teams
    @GetMapping("/api/v1/teams")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public List<TeamDto> getAll() {
        return teamService.getAll().stream().map(teamMapper::toDto).toList();
    }

    // Get team by ID
    @GetMapping("/api/v1/teams/{id}")
    @PreAuthorize("hasAnyRole('ADMIN', 'USER')")
    public TeamDto getById(@PathVariable Integer id) {
        return teamMapper.toDto(teamService.getById(id));
    }

    // Create team
    @PostMapping("/api/v1/teams")
    @PreAuthorize("hasRole('ADMIN')")
    public TeamDto createOrUpdateTeam(@RequestBody @Valid TeamDto form) {
        return teamMapper.toDto(teamService.createOrUpdateTeam(form));
    }

    // Delete team
    @DeleteMapping("/api/v1/teams/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteTeam(@PathVariable Integer id) {
        teamService.deleteTeam(id);
    }

}
