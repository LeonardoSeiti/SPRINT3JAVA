DROP TABLE IF EXISTS cliente;
CREATE TABLE cliente (
    id SERIAL PRIMARY KEY,
    email VARCHAR(255),
    senha VARCHAR(255),
    usuario VARCHAR(255),
    empresa VARCHAR(255),
    departamento VARCHAR(255)
);