package com.practice.f1infosapi.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeamDto {
    private Integer id;

    @NotNull(message = "Name field can't be null")
    private String name;

    private String team_principal_first_name;

    private String team_principal_last_name;

}
