# Apagar o banco de dados
DROP DATABASE IF EXISTS minha_garagem;


# Criar o banco de dados
CREATE DATABASE IF NOT EXISTS minha_garagem;

# Seleciona o banco de dados
USE minha_garagem;

# Deleta a tabela se ela existir
DROP TABLE IF EXISTS carros;

# Cria a tabela se ela não existir
CREATE TABLE IF NOT EXISTS carros (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,

    nome VARCHAR(150),
    cor VARCHAR(100),
    fabricante VARCHAR(255),
    placa VARCHAR(8),
    chassi VARCHAR(50),

    quilometragem FLOAT,
    potencia FLOAT,

    data_compra DATE,

    esta_funcionando BOOLEAN,
    permitida_circulacao BOOLEAN,

    quantidade_portas TINYINT,
    quantidade_batidas TINYINT,

    ano_fabricacao SMALLINT,
    ano_lancamento SMALLINT,
    tipo_pneu SMALLINT,

    renavam INT,

    descricao TEXT
);

DROP TABLE IF EXISTS categorias; # Excluir a tabela de categorias se existir.

CREATE TABLE IF NOT EXISTS categorias( # Cria a tabela de categorias se ela não existir.
    
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) UNIQUE NOT NULL, # Não permite ser vazio e é único.
    descricao TEXT,
    ativo BOOLEAN DEFAULT TRUE # Vai conter o valor false caso não for passado nada no INSERT. 

);
