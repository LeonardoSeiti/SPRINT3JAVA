# Projeto Emi Chatbot
O Emi é um assistente virtual inteligente projetado para ajudar as empresas a oferecer um atendimento ao cliente mais eficiente e personalizado. Utilizando tecnologias avançadas de processamento de linguagem natural e aprendizado de máquina, o Emi pode entender as perguntas dos clientes, fornecer respostas relevantes em tempo real e resolver problemas comuns de forma automatizada.

## Integrantes do grupo

- [Ezequiel Bispo de Jesus](https://github.com/EzequielBispo) - RM 99573 - Turma  2TDSPY

- [Helena Cristina](https://github.com/19helena) - RM 551873 - Turma  2TDSPY

- [Kelvin Gomes](https://github.com/kelving0mes) - RM 98126 - Turma  2TDSPN 

- [Leonardo Seiti](https://github.com/LeonardoSeiti) - RM 550207 - Turma  2TDSPN

## Responsáveis do projeto
Ezequiel Bispo de Jesus<br>
Leonardo Seiti de Souza

## Requisitos do sistema / System requirements

### Via local host
- [Maven ver. 3.8.X+](https://maven.apache.org/download.cgi)
- [Java JDK 17](https://www.oracle.com/br/java/technologies/downloads/#java17)
- IDE VSCode or InteliJ
- [Repositório](https://github.com/LeonardoSeiti/SPRINT3JAVA.git)
- [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=vmware.vscode-boot-dev-pack)
- [Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)

## Instruções / How To
O usuário para se cadastrar deve inserir:
- Email (Pessoal ou Corporativo)
- Senha
- Usuário
- Nome da empresa
- Departamento

Após inserir os dados, poderá ter acesso ao serviço de atendimento do Emi

## Link demonstração funcionamento do projeto

[Youtube](https://www.youtube.com/watch?v=JbCCxfzn_r4)

## Documentação do projeto usando swagger
[Docs](https://api-sprint-emi.azurewebsites.net/swagger-ui/index.html)

## EndPoints
`POST` /cliente <br>

### Corpo do requisição 
```js
[
  {
    "email": "Teste@fiap.com",
    "senha": "123",
    "usuario": "Teste",
    "empresa": "FIAP",
    "departamento": "ADS"
  }
]
```
#### Códigos de Status

|código|descrição
|------|---------
| 200| Pesquisa salva
| 401| Argumento inválido  
| 404| Recurso não encontrado / Não autorizado  

`POST` /login <br>

### Corpo do requisição 
```js
[
  {
  "email":"Teste@fiap.com",
  "senha":"123"
  }
]
```

|código|descrição
|------|---------
| 200 | Pesquisa realizada com sucesso           
| 400 | Falta ou excesso de argumentos           
| 404 | Pesquisa não encontrada / Não autorizado                  
| 500 | Erro interno no servidor                 
---


`GET` /cliente/perfil <br>
## Deve ser inserido o token ao logar anteriormente
### Resposta da requisição 
```js
[
  {
    "usuario": "Teste",
    "empresa": "FIAP",
    "departamento": "ADS"
  }
]
```
|código|descrição
|------|---------
| 200 | Pesquisa realizada com sucesso           
| 400 | Falta ou excesso de argumentos           
| 404 | Pesquisa não encontrada / Não autorizado                  
| 500 | Erro interno no servidor                 
---
