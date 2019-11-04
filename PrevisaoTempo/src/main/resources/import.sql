INSERT INTO tb_semana(id_semana,dia_semana) VALUES (1,'Segunda-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (2,'Terça-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (3,'Quarta-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (4,'Quinta-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (5,'Sexta-Ferira')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (6,'Sábado')
INSERT INTO tb_semana(id_semana,dia_semana) VALUES (7,'Domingo')

INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (1,'Guaianazes',28.0,-27.0)
INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (2,'São Paulo',65,-54.0)
INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (3,'Bahia',98.0,-25.0)
INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (4,'Rio de Janeiro',78.0,-45.0)
INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (5,'Minas Gerais',36.0,-54.0)
INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (6,'São Mateus',15.0,-57.0)
INSERT INTO tb_cidade(id_cidade,nome_cidade,lat_cidade,lon_cidade) VALUES (7,'Rio Grande Do Sul',38.0,-17.0)




insert into tb_previsao (id_previsao,id_cidade,id_semana,tempmin_previsao,tempmax_previsao,humidade_previsao, desc_previsao) values (1,1,1,21.4,27.2,56,'Muito Boa');
insert into tb_previsao  (id_previsao,id_cidade,id_semana,tempmin_previsao,tempmax_previsao,humidade_previsao, desc_previsao) values (2,2,2,21.4,27.2,56,'Ruim demais');
insert into tb_previsao  (id_previsao,id_cidade,id_semana,tempmin_previsao,tempmax_previsao,humidade_previsao, desc_previsao) values (3,3,3,20.6,27.8,0,'Vai Melhorar');
insert into tb_previsao  (id_previsao,id_cidade,id_semana,tempmin_previsao,tempmax_previsao,humidade_previsao, desc_previsao) values (4,4,4,20.8,27.8,34,'Eita');
insert into tb_previsao  (id_previsao,id_cidade,id_semana,tempmin_previsao,tempmax_previsao,humidade_previsao, desc_previsao) values (5,5,5,20.1,27.7,56,'Melhorou');
insert into tb_previsao  (id_previsao,id_cidade,id_semana,tempmin_previsao,tempmax_previsao,humidade_previsao, desc_previsao) values (6,6,6,20.4,25.5,24,'Piorou');
insert into tb_previsao  (id_previsao,id_cidade,id_semana,tempmin_previsao,tempmax_previsao,humidade_previsao, desc_previsao) values (7,7,7,22.3,27.2,56,'Eita');

insert into usuario (id, login, senha) values (1, 'admin', '12345');