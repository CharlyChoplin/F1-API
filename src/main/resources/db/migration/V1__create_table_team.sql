CREATE TABLE Team
(
    id                  serial  not null primary key,
    name                varchar not null,
    team_principal_name varchar not null,
    team_principal_surname varchar not null
);

CREATE TABLE Driver
(
    id      serial  not null primary key,
    name    varchar not null,
    surname varchar not null,
    age     integer,
    win     integer,
    main    boolean,
    team_id integer
);

ALTER TABLE Driver
    ADD CONSTRAINT DRIVER_TEAM_ID_FK
        FOREIGN KEY (team_id) REFERENCES Team (id);