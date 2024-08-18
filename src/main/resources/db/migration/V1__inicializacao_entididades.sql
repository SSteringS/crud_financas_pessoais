CREATE TABLE tb01_banco
(
    id_banco INT NOT NULL,
    nome     VARCHAR(100) NULL,
    tipo     VARCHAR(45) NULL,
    CONSTRAINT `PRIMARY` PRIMARY KEY (id_banco)
);

CREATE TABLE tb02_titular
(
    id_titular      INT NOT NULL,
    nome            VARCHAR(100) NULL,
    data_nascimento date NULL,
    cpf             VARCHAR(11) NULL,
    CONSTRAINT `PRIMARY` PRIMARY KEY (id_titular)
);

CREATE TABLE tb03_cartao
(
    id_cartao     INT NOT NULL,
    numero        VARCHAR(100) NULL,
    vencimento    VARCHAR(20) NULL,
    cod_seguranca VARCHAR(5) NULL,
    nome          VARCHAR(100) NULL,
    tipo          VARCHAR(50) NULL,
    id_conta      INT NULL,
    CONSTRAINT `PRIMARY` PRIMARY KEY (id_cartao)
);

CREATE TABLE tb04_conta
(
    id_conta       INT NOT NULL,
    id_titular     VARCHAR(45) NULL,
    id_banco       VARCHAR(45) NULL,
    numero_conta   VARCHAR(45) NULL,
    numero_agencia VARCHAR(45) NULL,
    saldo          DECIMAL(15, 2) NULL,
    CONSTRAINT `PRIMARY` PRIMARY KEY (id_conta)
);

CREATE TABLE tb05_movimentacao
(
    id_movimentacao INT NOT NULL,
    valor           DECIMAL(15, 2) NULL,
    data            datetime NULL,
    url_comprovante VARCHAR(250) NULL,
    origem          VARCHAR(250) NULL,
    destino         VARCHAR(250) NULL,
    tags            VARCHAR(250) NULL,
    id_cartao       INT NULL,
    CONSTRAINT `PRIMARY` PRIMARY KEY (id_movimentacao)
);

ALTER TABLE tb05_movimentacao
    ADD CONSTRAINT id_cartao FOREIGN KEY (id_cartao) REFERENCES tb03_cartao (id_cartao) ON DELETE NO ACTION;

CREATE INDEX id_cartao_idx ON tb05_movimentacao (id_cartao);

ALTER TABLE tb03_cartao
    ADD CONSTRAINT id_conta FOREIGN KEY (id_conta) REFERENCES tb04_conta (id_conta) ON DELETE NO ACTION;

CREATE INDEX id_conta_idx ON tb03_cartao (id_conta);