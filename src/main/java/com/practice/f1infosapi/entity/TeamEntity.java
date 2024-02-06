package com.practice.f1infosapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "team")
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "team_principal_name")
    private String teamPrincipalName;
    @Column(name = "team_principal_surname")
    private String teamPrincipalSurname;
}
