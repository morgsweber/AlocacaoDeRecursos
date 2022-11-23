INSERT INTO professor (professor_id, nome, idade, cpf, area) VALUES (36,'Patricia', 28, '60877179720', 'Ciencias Humanas');

INSERT INTO turma VALUES (42);
INSERT INTO turma VALUES (43);
INSERT INTO turma VALUES (44);
INSERT INTO turma VALUES (45);

INSERT INTO disciplina(disciplina_id, nome, ementa) VALUES(42,'Business Inteligence','Business Intelligence refere-se ao processo de coleta, organização, análise, compartilhamento e monitoramento de informações que oferecem suporte a gestão de negócios.');
INSERT INTO disciplina(disciplina_id, nome, ementa) VALUES(43,'Engenharia de Gente','Business Intelligence refere-se ao processo de coleta, organização, análise, compartilhamento e monitoramento de informações que oferecem suporte a gestão de negócios.');
INSERT INTO disciplina(disciplina_id, nome, ementa) VALUES(44,'Engenharia de Software','Business Intelligence refere-se ao processo de coleta, organização, análise, compartilhamento e monitoramento de informações que oferecem suporte a gestão de negócios.');

INSERT INTO ministra (ministra_id, professor_id, turma_id, disciplina_id) VALUES (1, 36, 42, 42);
INSERT INTO ministra (ministra_id, professor_id, turma_id, disciplina_id) VALUES (2, 36, 43, 43);
INSERT INTO ministra (ministra_id, professor_id, turma_id, disciplina_id) VALUES (3, 36, 44, 43);
INSERT INTO ministra (ministra_id, professor_id, turma_id, disciplina_id) VALUES (4, 36, 44, 46);
INSERT INTO ministra (ministra_id, professor_id, turma_id, disciplina_id) VALUES (5, 36, 45, 42);

INSERT INTO sala(sala_id, predio, capacidade, tipo) VALUES(1, 'A', '30', 'Normal');
INSERT INTO sala(sala_id, predio, capacidade, tipo) VALUES(2, 'A', '60', 'Normal');
INSERT INTO sala(sala_id, predio, capacidade, tipo) VALUES(3, 'A', '60', 'Laboratório');
INSERT INTO sala(sala_id, predio, capacidade, tipo) VALUES(4, 'A', '30', 'Living');
INSERT INTO sala(sala_id, predio, capacidade, tipo) VALUES(5, 'A', '30', 'Normal');

INSERT INTO turma_sala(turma_sala_id, sala_id, descricao, turma_id, horario, dia) VALUES(1, 2, 'Descricao aula1', 43, 'AB', '2022-03-07');
INSERT INTO turma_sala(turma_sala_id, sala_id, descricao, turma_id, horario, dia) VALUES(2, 2, 'Descricao aula2', 43, 'AB', '2022-03-14');
INSERT INTO turma_sala(turma_sala_id, sala_id, descricao, turma_id, horario, dia) VALUES(3, 2, 'Descricao aula3', 43, 'AB', '2022-03-21');
INSERT INTO turma_sala(turma_sala_id, sala_id, descricao, turma_id, horario, dia) VALUES(4, 3, 'Descricao aula4', 43, 'AB', '2022-03-28');
INSERT INTO turma_sala(turma_sala_id, sala_id, descricao, turma_id, horario, dia) VALUES(5, 1, 'Descricao aula1', 44, 'CD', '2022-03-08');
INSERT INTO turma_sala(turma_sala_id, sala_id, descricao, turma_id, horario, dia) VALUES(6, 1, 'Descricao aula2', 44, 'CD', '2022-03-13');
INSERT INTO turma_sala(turma_sala_id, sala_id, descricao, turma_id, horario, dia) VALUES(7, 1, 'Descricao aula3', 44, 'CD', '2022-03-20');
INSERT INTO turma_sala(turma_sala_id, sala_id, descricao, turma_id, horario, dia) VALUES(8, 1, 'Descricao aula4', 44, 'CD', '2022-03-27');
INSERT INTO turma_sala(turma_sala_id, sala_id, descricao, turma_id, horario, dia) VALUES(9,  5, 'Descricao aula1', 45, 'EE1', '2022-03-09');
INSERT INTO turma_sala(turma_sala_id, sala_id, descricao, turma_id, horario, dia) VALUES(10, 4, 'Descricao aula2', 45, 'EE1', '2022-03-15');
INSERT INTO turma_sala(turma_sala_id, sala_id, descricao, turma_id, horario, dia) VALUES(11, 3, 'Descricao aula3', 45, 'EE1', '2022-03-23');
INSERT INTO turma_sala(turma_sala_id, sala_id, descricao, turma_id, horario, dia) VALUES(12, 5, 'Descricao aula4', 45, 'EE1', '2022-03-29');

INSERT INTO aluno (aluno_id, nome, curso, idade, cpf, semestre) VALUES (3, 'Maria Clara', 'Administração', 20, '92164714671', 2);

INSERT INTO turma_aluno(turma_aluno_id, turma_id, aluno_id) VALUES (1, 42, 3);
INSERT INTO turma_aluno(turma_aluno_id, turma_id, aluno_id) VALUES (2, 43, 3);
INSERT INTO turma_aluno(turma_aluno_id, turma_id, aluno_id) VALUES (3, 44, 3);