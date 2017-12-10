use test;
create table usuario(
id int primary key auto_increment,
pass varchar(25),
nombre varchar(50)
);
insert into usuario(pass,nombre) values('123','0333152014');
insert into usuario(pass,nombre) values('123456','0333152015');
insert into usuario(pass,nombre) values('123456789','0333152016');