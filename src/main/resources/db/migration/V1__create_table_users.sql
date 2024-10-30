--Drop das tabelas caso existam
DROP TABLE IF EXISTS pesquisa;
DROP TABLE IF EXISTS cliente;
--tabelas a serem criadas
CREATE TABLE cliente (
    id INT IDENTITY(1,1) PRIMARY KEY,
    email VARCHAR(255),
    senha VARCHAR(255),
    usuario VARCHAR(255),
    empresa VARCHAR(255),
    departamento VARCHAR(255)
);
CREATE TABLE pesquisa(
    id INT IDENTITY(1,1) PRIMARY KEY,
    indicador VARCHAR(255),
    tipo VARCHAR(255),
    url VARCHAR(255),
    cliente_id INT,
    CONSTRAINT fk_cliente FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);