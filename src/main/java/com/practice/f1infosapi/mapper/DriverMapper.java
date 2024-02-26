package com.practice.f1infosapi.mapper;

import com.practice.f1infosapi.dto.DriverFormDto;
import com.practice.f1infosapi.dto.DriverResponseDto;
import com.practice.f1infosapi.entity.DriverEntity;
import com.practice.f1infosapi.entity.TeamEntity;
import org.springframework.stereotype.Service;

@Service
public class DriverMapper {
    public DriverResponseDto toDto(DriverEntity driverEntity) {
        DriverResponseDto driverResponseDto = new DriverResponseDto();

        driverResponseDto.setId(driverEntity.getId());
        driverResponseDto.setName(driverEntity.getFirstName());
        driverResponseDto.setSurname(driverEntity.getLastName());
        driverResponseDto.setAge(driverEntity.getAge());
        driverResponseDto.setWin(driverEntity.getWin());
        driverResponseDto.setMain(driverEntity.getMain());
        driverResponseDto.setTeamName(driverEntity.getTeam().getName());

        return driverResponseDto;
    }

    public DriverEntity toEntity(DriverFormDto driverResponseDto, TeamEntity teamEntity) {
        DriverEntity driverEntity = new DriverEntity();

        driverEntity.setFirstName(driverResponseDto.getFirstName());
        driverEntity.setLastName(driverResponseDto.getLastName());
        driverEntity.setAge(driverResponseDto.getAge());
        driverEntity.setWin(driverResponseDto.getWin());
        driverEntity.setMain(driverResponseDto.getMain());
        driverEntity.setTeam(teamEntity);

        return driverEntity;
    }
}
