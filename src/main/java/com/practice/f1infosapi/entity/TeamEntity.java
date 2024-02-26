package com.practice.f1infosapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "teams")
public class TeamEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "team_principal_first_name")
    private String teamPrincipalFirstName;

    @Column(name = "team_principal_last_name")
    private String teamPrincipalLastName;
}
