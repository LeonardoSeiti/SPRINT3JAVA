CREATE TABLE T_USUARIO(
    id bigint PRIMARY KEY AUTO_INCREMENT,
    email varchar(255) NOT NULL,
    senha varchar(255) NOT NULL,
    usuario varchar(255) NOT NULL,
    empresa varchar(255) NOT NULL,
    departamento varchar(255) NOT NULL
);
