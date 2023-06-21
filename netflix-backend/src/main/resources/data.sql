INSERT INTO SECAO (nome, nome_chave) VALUES ('Em alta', 'ALTA');
INSERT INTO SECAO (nome, nome_chave) VALUES ('Adicionados recentemente', 'RECENTEMENTE');
INSERT INTO SECAO (nome, nome_chave) VALUES ('Populares no Netflix', 'POPULARES');

INSERT INTO TITULO (capa, idade, nome, partes, relevancia, secao_id) VALUES ('/assets/images/guardios-da-galaxia.jpg', 0, 'Guardiões da Galáxia', 0, 98, (select id from SECAO where nome_chave = 'ALTA'));

INSERT INTO TITULO (capa, idade, nome, partes, relevancia, secao_id) VALUES ('/assets/images/better-call-saul.jpg', 0, 'Better call Saul', 0, 98, (select id from SECAO where nome_chave = 'RECENTEMENTE'));

INSERT INTO TITULO (capa, idade, nome, partes, relevancia, secao_id) VALUES ('/assets/images/capitao-america-o-primeiro-vingador.jpg', 0, 'Capitão América: o primeiro vingador', 0, 98, (select id from SECAO where nome_chave = 'RECENTEMENTE'));

INSERT INTO TITULO (capa, idade, nome, partes, relevancia, secao_id) VALUES ('/assets/images/thor-o-mundo-sombrio.jpg', 0, 'Thor: o mundo sombrio', 0, 98, (select id from SECAO where nome_chave = 'RECENTEMENTE'));

INSERT INTO TITULO (capa, idade, nome, partes, relevancia, secao_id) VALUES ('/assets/images/greys-anatomy.jpg', 0, CONCAT('Grey','''s',' Anatomy'), 19, 98, (select id from SECAO where nome_chave = 'POPULARES'));

INSERT INTO TITULO (capa, idade, nome, partes, relevancia, secao_id) VALUES ('/assets/images/nosso-planeta.jpg', 0, 'Nosso planeta', 1, 98, (select id from SECAO where nome_chave = 'POPULARES'));

INSERT INTO TITULO (capa, idade, nome, partes, relevancia, secao_id) VALUES ('/assets/images/eu-sou-a-lenda.jpg', 18, 'Eu sou a lenda', 0, 98, (select id from SECAO where nome_chave = 'ALTA'));

INSERT INTO TITULO (capa, idade, nome, partes, relevancia, secao_id) VALUES ('/assets/images/homem-de-ferro.jpg', 0, 'Homem de ferro', 0, 95, (select id from SECAO where nome_chave = 'ALTA'));

INSERT INTO TITULO (capa, idade, nome, partes, relevancia, secao_id) VALUES ('/assets/images/homem-de-ferro-2.jpg', 0, 'Homem de ferro 2', 0, 97, (select id from SECAO where nome_chave = 'ALTA'));

INSERT INTO TITULO (capa, idade, nome, partes, relevancia, secao_id) VALUES ('/assets/images/o-menino-que-descobriu-o-vento.jpg', 14, 'O menino que descobriu o vento', 0, 98, (select id from SECAO where nome_chave = 'POPULARES'));

INSERT INTO TITULO (capa, idade, nome, partes, relevancia, secao_id) VALUES ('/assets/images/the-rain.jpg', 12, 'The rain', 0, 97, (select id from SECAO where nome_chave = 'POPULARES'));

INSERT INTO TITULO (capa, idade, nome, partes, relevancia, secao_id) VALUES ('/assets/images/vingadores-era-de-ultron.jpg', 12, 'Vingadores: a era de ultron', 0, 94, (select id from SECAO where nome_chave = 'RECENTEMENTE'));
