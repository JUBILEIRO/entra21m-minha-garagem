# Seleciona as colunas da tabela de carros
SELECT * FROM carros;


# Seleciona a coluna nome, fabricante, cor e quantidade colocando
# um apelido para apresentar para o usuario de uma melhor forma
SELECT 
    nome AS 'Nome', 
    fabricante AS 'Fabricante', 
    cor AS 'Cor', 
    quantidade_portas AS 'Quantidade de Portas' 
FROM carros;

# Exemplo de INSERT na tabela de carros informando 
# as colunas desejadas
INSERT INTO carros (id, nome, cor, fabricante, placa, chassi, quilometragem, potencia, data_compra, esta_funcionando, permitida_circulacao, quantidade_portas, quantidade_batidas, ano_fabricacao, ano_lancamento, tipo_pneu, renavam, descricao) 
VALUE (
	1, 
	"Gol", 
	"Azul Bebe", 
	"VW", 
	"ABC-2000", 
	"2Ab578R0epaso82371", 
	29134741, 
	85, 
	'2017-08-07', 
	TRUE, 
	FALSE, 
	4, 
	0, 
	2017, 
	2016, 
	175, 
	847516874, 
	""
);

# Inserir na tabela de carros um registro
# somente com alguns campos
INSERT INTO carros (nome, cor, fabricante, potencia, data_compra) 
VALUE (
	"Palio", 
	"Rosa choque", 
	"Fiat", 
	65, 
	'2013-04-29'
);

INSERT INTO carros(fabricante, cor, nome)
VALUES
("VW", "Cinza", "Golf"),
("VW", "Vermelho", "Jetta"),
("VW", "Amarelo", "Saveiro"),
("VW", "Preto", "New Beatle"),
("VW", "Azul Bebe", "Fusca"),
("VW", "Branco", "Novo Fusca"),
("VW", "Azul Calcinha", "Kombi"),
("VW", "Cinza", "Up"),
("VW", "Cobalto", "Bora"),
("VW", "Vermelho", "Passat");

# limpar a tela por completo
TRUNCATE carros;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id > 4;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id >= 4;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id < 4;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id <= 4;

SELECT id, nome, quantidade_batidas
FROM carros
WHERE id <> 4;

# Ordena em ordem alfabetica
SELECT nome FROM carros ORDER BY nome ASC;

SELECT nome FROM carros ORDER BY nome ASC, fabricante ASC, cor ASC;

# Retorna a quantidade de registros
SELECT COUNT(*) FROM carros;