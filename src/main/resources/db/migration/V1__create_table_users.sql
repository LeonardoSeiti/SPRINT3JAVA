CREATE TABLE T_USUARIO(
    id bigint PRIMARY KEY AUTO_INCREMENT,
    ds_email varchar(255) NOT NULL,
    ds_senha varchar(255) NOT NULL,
    nm_usuario varchar(255) NOT NULL,
    nm_empresa varchar(255) NOT NULL,
    nm_departamento varchar(255) NOT NULL,
    dt_procura datetime
);