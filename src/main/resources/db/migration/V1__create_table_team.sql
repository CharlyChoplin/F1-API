CREATE TABLE Teams
(
    id                  serial  not null primary key,
    name                varchar not null,
    team_principal_first_name varchar,
    team_principal_last_name varchar
);

CREATE TABLE Drivers
(
    id      serial  not null primary key,
    first_name    varchar not null,
    last_name varchar not null,
    age     integer,
    win     integer,
    main    boolean,
    team_id integer
);

CREATE TABLE Users
(
    id serial not null primary key,
    first_name varchar,
    last_name varchar,
    email varchar not null,
    password varchar not null,
    created_at date,
    updated_at date,
    role varchar
);

ALTER TABLE Drivers
    ADD CONSTRAINT DRIVERS_TEAMS_ID_FK
        FOREIGN KEY (team_id) REFERENCES Teams (id);

INSERT INTO Teams (id, name, team_principal_first_name, team_principal_last_name)
VALUES
    (1, 'Scuderia Ferrari', 'Frédéric', 'Vasseur'),
    (2, 'Oracle Red Bull Racing', 'Christian', 'Horner');

INSERT INTO Drivers (id, first_name, last_name, age, win, main, team_id)
VALUES
    (1, 'Charles', 'Leclerc', 26, 5, true, 1),
    (2, 'Carlos', 'Sainz', 29, 2, true, 1),
    (3, 'Max', 'Verstappen', 26, 54, true, 2),
    (4, 'Sergio', 'Perez', 34, 6, true, 2);

INSERT INTO Users (id, first_name, last_name, email, password, role)
VALUES
    (1, 'admin', 'admin', 'admin@admin.fr', '$2a$10$MFB8pvvtama9Va4sglnUAu4Bx7tKR7IR2cmkzFlxo6xeeA/3FtVbq', 'ROLE_ADMIN'),
    (2, 'user', 'user', 'user@user.com', '$2a$10$KHPWrK3QF00/dQoND.o9q.Z1Ea3RDHyh8VGFC9IpZhJPEYDwlSLpu', 'ROLE_USER');

-- todo : fix starting count while creating