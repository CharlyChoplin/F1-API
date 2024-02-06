package com.practice.f1infosapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DriverFormDto {
    private Integer id;
    @NotNull(message = "Name field can't be null")
    @NotBlank(message = "Name field can't be empty")
    private String name;
    private String surname;
    private Integer age;
    private Integer win;
    private Boolean main;
    @JsonProperty("team_id")
    private Integer teamId;
}
