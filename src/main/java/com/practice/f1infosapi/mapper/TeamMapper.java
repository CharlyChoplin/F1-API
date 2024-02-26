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
        teamDto.setTeam_principal_first_name(teamEntity.getTeamPrincipalFirstName());
        teamDto.setTeam_principal_last_name(teamEntity.getTeamPrincipalLastName());

        return teamDto;
    }

    public TeamEntity toEntity(TeamDto teamDto) {
        TeamEntity teamEntity = new TeamEntity();

        teamEntity.setName(teamDto.getName());
        teamEntity.setTeamPrincipalFirstName(teamDto.getTeam_principal_first_name());
        teamEntity.setTeamPrincipalLastName(teamDto.getTeam_principal_last_name());

        return teamEntity;
    }
}
