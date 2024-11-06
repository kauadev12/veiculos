CREATE DATABASE sistema_veiculos;

USE sistema_veiculos;

CREATE TABLE Veiculo (
    id INT PRIMARY KEY AUTO_INCREMENT,
    placa VARCHAR(10) NOT NULL,
    ano INT NOT NULL
);

CREATE TABLE Caminhao (
    id INT PRIMARY KEY,
    eixos INT,
    FOREIGN KEY (id) REFERENCES Veiculo(id)
);

CREATE TABLE Onibus (
    id INT PRIMARY KEY,
    assentos INT,
    FOREIGN KEY (id) REFERENCES Veiculo(id)
);

