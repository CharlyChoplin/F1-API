package com.practice.f1infosapi.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "driver")
public class DriverEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "age")
    private Integer age;
    @Column(name = "win")
    private Integer win;
    @Column(name = "main")
    private Boolean main;
    @JoinColumn(name = "team_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private TeamEntity team;
}
