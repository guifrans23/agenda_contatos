/*---------------------------------criar banco-----------------------*/
create database agendacontatos;
/*--------------------------------usar tabela--------------------------*/
use agendacontatos;
/*---------------------------------criar tabela------------------*/
create table agenda(
id int primary key auto_increment,
nome varchar(255)not null,
fone varchar(255)not null,
email varchar(255) 
);
-- ------------------------------verificar tabela---------------------------
show tables;
-- ------------------------------Descrever tabela---------------------------
describe agenda;
-- ------------------------------Excluir tabela-----------------------------
drop table agenda;
-- ------------------------------Excluir banco ------------------------------
drop database AgendaContatos;

-- ------------------------------adição de usuarios na tabela------------------------------

insert into agenda(nome,fone,email)
value ('guifrans','950101-4339', 'guifrans23@gmail.com');

insert into agenda(nome,fone,email)
value ('cazujm','935678-3533', 'cazujm@gmail.com');

-- --------------------------------------crud read-----------------------------------------
-- ----------------------------------------seção de todos registros da tabela contatos-----------------------------------------------------------
select*from agenda;
-- select*from agenda( selecionar todos os registros na tabela)
-- selecão de um registro (constatos) específico
select*from agenda where id=1;
-- select*from agenda where id=?(? = id do usuario)
select*from agenda where nome='guifrans';
-- select*from agenda where nome='guifrans'; (selecionar o usuario pelo nome)
 -- --------------------------------------------------selecionar campo especifico------------------------------------------------------------
select nome,fone from agenda;
-- select nome,fone from agenda;(selecionr apenas nome e telefone)
select nome,fone,email from agenda order by nome;
-- select nome,fone,email from agenda order by nome; (selecionr nome,telefone e email pelo nome)
select nome,fone,email from agenda order by nome desc;
-- select nome,fone,email from agenda order by nome desc; (selecionr nome,telefone e email pelo nome com descrisão)
-- criação de bons apelidos dos compos
select nome as nome,fone as telefone, email as gmail
from agenda order by nome;
/* select nome as nome,fone as telefone, email as gmail
from agenda order by nome; (dar um apelido para nome,fone e email*/
--  crud update (atualizar usuario)
update agenda set email='bill@outlook'where id='8';
--  fazer uma atualização no email do usuario
update agenda set nome='josé'where id='8';
--  fazer uma atualização no nome do usuario
update agenda set nome='robson da silva',fone='92222-2222',email='vaamonde@gamail.com'where id=30;
--  fazer uma atualização no nome,fone email do usuario 

-- crud delete(usuario)

delete from agenda where id=18;
-- deletar usuario pelo ID
