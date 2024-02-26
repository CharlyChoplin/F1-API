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

    private String firstName;

    private String lastName;

    private Integer age;

    private Integer win;

    private Boolean main;

    private Integer teamId;
}
