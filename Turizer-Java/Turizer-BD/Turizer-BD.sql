create database Turizer;

use Turizer;

create table Guia(
id int(3) auto_increment primary key,
Nome varchar (50),
Sobrenome varchar(30),
Email varchar(50),
Senha varchar(10));

create table Turista(
id int(3) auto_increment primary key,
Nome varchar (50),
Sobrenome varchar(30),
Email varchar(50),
Senha varchar(10));

create table Trilhas(
id int(3) auto_increment primary key,
Nome varchar(50),
Endereco varchar(50),
Distancia varchar(50));

Insert into Trilhas (Nome, Endereco, Distancia) values ("Trilha da raposa", "Av. Dep. Ulisses Guimarães, Registro - SP", "30,06KM"), ("Trilha do sabao", "Rua Morato Aoki", "22,48KM"), ("Rota do cha", "Rua Leodato Rodrigues", "24,68KM");

