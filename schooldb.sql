create database schooldb;
use schooldb;

create table area (
idarea int auto_increment primary key,
tituloarea varchar(30) not null
);																													 
																												
create table unidade(												
idunidade int auto_increment primary key,
nomeunidade varchar(30) not null,
endereco text not null
);

create table curso(
idcurso int auto_increment primary key,
titulocurso varchar(50) not null,
descricao text not null,
cargahoraria varchar(30) not null,
idarea int not null,
idunidade int not null
);