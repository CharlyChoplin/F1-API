package com.practice.f1infosapi.mapper;

import com.practice.f1infosapi.dto.PilotesDto;
import com.practice.f1infosapi.entity.PilotesEntity;
import org.springframework.stereotype.Service;

@Service
public class PilotesMapper {
    public PilotesDto toDto(PilotesEntity pilotesEntity) {
        PilotesDto pilotesDto = new PilotesDto();

        pilotesDto.setName(pilotesEntity.getName());
        pilotesDto.setSurname(pilotesEntity.getSurname());

        return pilotesDto;
    }
}
