create table usuarios
(
    id            bigint       not null auto_increment,
    login        varchar(100) not null,
    contrasenia  varchar(255) not null,
    primary key (id)
);