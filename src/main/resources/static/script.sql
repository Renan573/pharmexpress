create database pharmexpressDB

use pharmexpressDB

create table cliente (
	id_cliente bigint primary key not null,
	cpf int not null,
	nome varchar(60) not null,
	email varchar(60) not null,
	senha varchar(30) not null,
	dataNasc date not null
)

alter table cliente drop column id_cliente
alter table cliente drop constraint PK__cliente__677F38F5C061FCDB

select CONSTRAINT_NAME, CONSTRAINT_TYPE from INFORMATION_SCHEMA.TABLE_CONSTRAINTS where TABLE_NAME='cliente'