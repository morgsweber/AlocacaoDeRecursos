# AlocacaoDeRecursos_backend
Este repositório é destinado para o backend do projeto semestral da disciplina de Prática em Engenharia de Software do curso de Ciência da Computação

### Autores: Alexei Abianna, Bárbara Vilela, Elise Prezzi, Gilberto Junior, Júlia Godoy, Morgana Weber, Pedro Vaz, Thales Santin

## Requirements:
 - [Java](https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR)
 - [Maven](https://maven.apache.org/download.cgi) 

## Running

- Incluir as variaveis de ambiente:
  - ``export spring.profiles.active=local `` - Para testes locais.
  - ``export spring.profiles.active=prod `` - Para implantar no ambiente.

- Para rodar a aplicacao localmente:
  - Execute o script bash na raíz do projeto com o comando 
  - ``sh ./run-project.sh``
  - E verifique a aplicação rodando batendo no endpoint http://localhost:8080/actuator

