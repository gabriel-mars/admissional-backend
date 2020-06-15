# Admissional

Este projeto faz parte do teste admissional para a empresa B2ml, que consiste em uma aplicação web.
O projeto foi desenvolvido em duas frentes: Front-end e Back-end.

## Back-end

Aplicação REST API desenvolvida com Java 8 e [Spring Boot](https://spring.io).

É importante ressaltar que o front-end só funcionará corretamente caso este back-end já esteja rodando, pois os dois se complementam.

Para mais informações sobre o front-end, clique [aqui](https://github.com/gabrielrms-Inatel/admissional-frontend).

## Inicializando o projeto

Para inicializar o back-end, siga os passos abaixo:

1- Criar um banco de dados vazio com o nome `admissional` no PostgreSQL.

2- Abra o NetBeans e importe como um projeto Maven existente.

3- Na árvore de projetos do NetBeans, clique com o botão direito sobre o nome do projeto e atualize o projeto com o Maven.

4- Após o item anterior ser finalizado abra a classe principal `AdmissionalApplication.java` e execute a aplicação.

5- Se tudo estiver correto, o projeto já estará rodando.

6- Caso queira testar os endpoints fora da aplicação Angular, os acessos podem ser feitos de alguam ferramenta que teste requisições, como o [Postman](https://www.postman.com).

## Dependência

Para que o projeto seja corretamente executado, é necessário se atentar para algumas configurações no arquivo `application.properties`.

Nele há algumas informações que precisam ser modificadas para o acesso ao banco de dados PostgreSQL.

1- `spring.datasource.url = jdbc:postgresql://localhost:5432/admissional`: Foram utilizadas a url e a porta padrão para o banco PostgreSQL, porém podem ser alteradas de acordo com as suas configurações.

2- `spring.datasource.username = postgres`: Alterar o usuário do banco de acordo com suas configurações.

3- `spring.datasource.password = postgres`: Alterar a senha do usuário para o banco de acordo com suas configurações.
