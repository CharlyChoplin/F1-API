package com.practice.f1infosapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TeamDto {
    private Integer id;
    @NotNull(message = "Name field can't be null")
    @NotBlank(message = "Name field can't be empty")
    private String name;
    @NotNull(message = "team_principal_name field can't be null")
    @NotBlank(message = "team_principal_name field can't be empty")
    private String teamPrincipalName;
    @NotNull(message = "team_principal_surname field can't be null")
    @NotBlank(message = "team_principal_surname field can't be empty")
    private String teamPrincipalSurname;

}
