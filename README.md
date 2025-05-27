
# projetoContatosApi

API REST para gerenciamento de contatos, construída com Java Spring Boot.

## Descrição

Este projeto é uma API backend que permite criar, consultar, atualizar e deletar contatos. Cada contato possui informações como nome, email e telefone. A API está organizada seguindo boas práticas do Spring Boot, utilizando Spring Data JPA para persistência.

## Funcionalidades

- Criar novo contato (POST `/api/contatos`)
- Consultar contato por ID (GET `/api/contatos/{id}`)
- Atualizar contato (PUT `/api/contatos/{id}`)
- Deletar contato (DELETE `/api/contatos/{id}`)

## Tecnologias

- Java 17+
- Spring Boot 3.x
- Spring Data JPA
- Maven
- Banco de dados (configurar no `application.properties`)

## Requisitos

- Java JDK 17 ou superior instalado
- Maven instalado
- Banco de dados configurado (ex: PostgreSQL, MySQL, H2 para testes)

## Como rodar o projeto

1. Clone o repositório

```bash
git clone <url-do-repositorio>
cd projetoContatosApi/projetoContatosApi
```

2. Configure as propriedades de conexão com o banco em:

```
src/main/resources/application.properties
```

3. Build do projeto com Maven

```bash
./mvnw clean install
```

4. Execute a aplicação

```bash
./mvnw spring-boot:run
```

A API estará disponível em `http://localhost:8080/api/contatos`.

## Endpoints

| Método | Rota               | Descrição               |
|--------|--------------------|-------------------------|
| POST   | `/api/contatos`    | Cria um novo contato     |
| GET    | `/api/contatos/{id}`| Busca contato por ID    |
| PUT    | `/api/contatos/{id}`| Atualiza contato existente |
| DELETE | `/api/contatos/{id}`| Deleta contato por ID   |

### Exemplo JSON para criação/atualização

```json
{
  "nome": "João Silva",
  "email": "joao.silva@email.com",
  "telefone": "11999998888"
}
```

## Considerações

- É necessário configurar o banco e as credenciais no arquivo `application.properties`.
- O projeto utiliza Spring Data JPA, portanto é possível trocar o banco facilmente.
- O ID do contato é gerado automaticamente.

## Referências

- [Documentação Spring Boot](https://spring.io/projects/spring-boot)
- [Guia Spring Data JPA](https://spring.io/guides/gs/accessing-data-jpa/)
- [Guia REST com Spring](https://spring.io/guides/gs/rest-service/)
