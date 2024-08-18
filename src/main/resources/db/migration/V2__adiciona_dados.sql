DELETE from tb01_banco;
DELETE from tb02_titular;
DELETE from tb05_movimentacao;
DELETE from tb03_cartao;
DELETE from tb04_conta;

INSERT into tb01_banco (id_banco, nome, tipo) values (1, 'Banco do Brasil', 'Tradicional');
INSERT into tb01_banco (id_banco, nome, tipo) values (2, 'Bradesco', 'Tradicional');
INSERT into tb01_banco (id_banco, nome, tipo) values (3, 'Itaú', 'Tradicional');
INSERT into tb01_banco (id_banco, nome, tipo) values (4, 'Nubank', 'Online');
INSERT into tb01_banco (id_banco, nome, tipo) values (5, 'Sicred', 'Online');

INSERT into tb02_titular (id_titular, nome, data_nascimento, cpf) values (1, 'Satyan Stering Saita', '1992-10-03', '01208910264');
INSERT into tb02_titular (id_titular, nome, data_nascimento, cpf) values (2, 'Natsu Stering Saita', '1996-11-01', '01508910264');

INSERT into tb04_conta (id_conta, id_titular, id_banco, numero_conta, numero_agencia, saldo) values (1, 1, 1, '123456', '123', 1000.00);
INSERT into tb04_conta (id_conta, id_titular, id_banco, numero_conta, numero_agencia, saldo) values (2, 2, 2, '654321', '321', 2000.00);
INSERT into tb04_conta (id_conta, id_titular, id_banco, numero_conta, numero_agencia, saldo) values (3, 1, 5, '123456', '123', 3000.00);
INSERT into tb04_conta (id_conta, id_titular, id_banco, numero_conta, numero_agencia, saldo) values (4, 2, 5, '654321', '321', 4000.00);

INSERT into tb03_cartao (id_cartao, numero, vencimento, cod_seguranca, nome, tipo, id_conta) values (1, '1234567890123456', '10/2025', '123', 'Cartao Satyan Conta Sicred', 'Credito', 3);
INSERT into tb03_cartao (id_cartao, numero, vencimento, cod_seguranca, nome, tipo, id_conta) values (2, '6543210987654321', '10/2025', '321', 'Cartao Natsu Conta Sicred', 'Debito', 4);
INSERT into tb03_cartao (id_cartao, numero, vencimento, cod_seguranca, nome, tipo, id_conta) values (3, '1234567890123456', '10/2025', '123', 'Cartao Satyan Conta Nubank', 'Credito', 1);

INSERT into tb05_movimentacao (id_movimentacao, valor, data, url_comprovante, origem, destino, tags, id_cartao) values (1, 100.00, '2021-10-03 10:00:00', 'http://comprovante.com/1', 'Conta Sicred', 'Conta Nubank', 'Transferencia', 1);
INSERT into tb05_movimentacao (id_movimentacao, valor, data, url_comprovante, origem, destino, tags, id_cartao) values (2, 200.00, '2021-10-03 10:00:00', 'http://comprovante.com/2', 'Conta Sicred', 'Conta Nubank', 'Transferencia', 1);
INSERT into tb05_movimentacao (id_movimentacao, valor, data, url_comprovante, origem, destino, tags, id_cartao) values (3, 300.00, '2021-10-03 10:00:00', 'http://comprovante.com/3', 'Conta Sicred', 'Conta Nubank', 'Transferencia', 3);
INSERT into tb05_movimentacao (id_movimentacao, valor, data, url_comprovante, origem, destino, tags, id_cartao) values (4, 400.00, '2021-10-03 10:00:00', 'http://comprovante.com/4', 'Conta Sicred', 'Conta Nubank', 'Transferencia', 2);
INSERT into tb05_movimentacao (id_movimentacao, valor, data, url_comprovante, origem, destino, tags, id_cartao) values (5, 500.00, '2021-10-03 10:00:00', 'http://comprovante.com/5', 'Conta Sicred', 'Conta Nubank', 'Transferencia', 2);