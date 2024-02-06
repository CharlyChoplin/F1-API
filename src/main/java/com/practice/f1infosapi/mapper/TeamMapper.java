package com.practice.f1infosapi.mapper;

import com.practice.f1infosapi.dto.TeamDto;
import com.practice.f1infosapi.entity.TeamEntity;
import org.springframework.stereotype.Service;

@Service
public class TeamMapper {
    public TeamDto toDto(TeamEntity teamEntity) {
        TeamDto teamDto = new TeamDto();

        teamDto.setId(teamEntity.getId());
        teamDto.setName(teamEntity.getName());
        teamDto.setTeamPrincipalName(teamEntity.getTeamPrincipalName());
        teamDto.setTeamPrincipalSurname(teamEntity.getTeamPrincipalSurname());

        return teamDto;
    }

    public TeamEntity toEntity(TeamDto teamDto) {
        TeamEntity teamEntity = new TeamEntity();

        teamEntity.setName(teamDto.getName());
        teamEntity.setTeamPrincipalName(teamDto.getTeamPrincipalName());
        teamEntity.setTeamPrincipalSurname(teamDto.getTeamPrincipalSurname());

        return teamEntity;
    }
}
