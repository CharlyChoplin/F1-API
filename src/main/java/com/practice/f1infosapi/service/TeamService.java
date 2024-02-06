package com.practice.f1infosapi.service;

import com.practice.f1infosapi.dto.TeamDto;
import com.practice.f1infosapi.entity.TeamEntity;
import com.practice.f1infosapi.exception.F1NotFoundException;
import com.practice.f1infosapi.mapper.TeamMapper;
import com.practice.f1infosapi.repository.TeamRepository;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {
    private final TeamRepository teamRepository;
    private final TeamMapper teamMapper;

    public List<TeamEntity> getAll() {
        return teamRepository.findAll();
    }

    public TeamEntity getById(@NotNull Integer id) {
        return teamRepository.findById(id).orElseThrow(
                () -> new F1NotFoundException("team not found")
        );
    }

    public TeamEntity createOrUpdateTeam(TeamDto form) {
        if (form.getId() == null) {
            return teamRepository.save(teamMapper.toEntity(form));
        } else {
            TeamEntity teamToUpdate = getById(form.getId());

            teamToUpdate.setName(form.getName());
            teamToUpdate.setTeamPrincipalName(form.getTeamPrincipalName());
            teamToUpdate.setTeamPrincipalSurname(form.getTeamPrincipalSurname());
            return teamRepository.save(teamToUpdate);
        }
    }

    public void deleteTeam(@NotNull Integer id) {
        teamRepository.deleteById(id);
    }
}
