package com.practice.f1infosapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DriverResponseDto {
    private Integer id;

    private String name;

    private String surname;

    private Integer age;

    private Integer win;

    private Boolean main;

    private String teamName;
}
