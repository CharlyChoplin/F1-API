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

CREATE TABLE Role
(
    id serial not null primary key,
    name varchar not null
);

CREATE TABLE User
(
    id serial not null primary key,
    username varchar not null,
    password varchar not null,
);

CREATE TABLE User_Role
(
    user_id integer not null primary key,
    role_id integer not null primary key,
)

ALTER TABLE Driver
    ADD CONSTRAINT DRIVER_TEAM_ID_FK
        FOREIGN KEY (team_id) REFERENCES Team (id);

ALTER TABLE User_Role
    ADD CONSTRAINT USER_ROLE_USER_FK
        FOREIGN KEY (user_id) REFERENCES User (id);

ALTER TABLE User_Role
    ADD CONSTRAINT USER_ROLE_ROLE_FK
        FOREIGN KEY (role_id) REFERENCES Role (id);