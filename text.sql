drop database if exists escola;
create database escola;

use escola;

create table aluno (
matricula int,
numero_camisa varchar(50),
turma varchar(50),
posicao varchar(50)
);

show tables;
desc aluno;

insert into aluno values('123','23','3BII','goleiro');

select*from aluno;