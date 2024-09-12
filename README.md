# Projeto Emi Chatbot
O Emi é um assistente virtual inteligente projetado para ajudar as empresas a oferecer um atendimento ao cliente mais eficiente e personalizado. Utilizando tecnologias avançadas de processamento de linguagem natural e aprendizado de máquina, o Emi pode entender as perguntas dos clientes, fornecer respostas relevantes em tempo real e resolver problemas comuns de forma automatizada.

## Integrantes do grupo

- RM 99573 - Ezequiel Bispo de Jesus<br>
- RM 551873 - Helena Cristina Rocha Medeiros
- RM 98126 - Kelvin Gomes
- RM 550207 - Leonardo Seiti de Souza<br>

## Responsáveis do projeto
Ezequiel Bispo de Jesus<br>
Leonardo Seiti de Souza

## Instruções / How To
O usuário para se cadastrar deve inserir:
- seu nome
- nome da empresa
- email pessoal ou comercial
- usuário e senha

Após inserir os dados, poderá ter acesso ao serviço de atendimento ao cliente

## Documentação do projeto usando swagger
http://localhost:8080/swagger-ui/index.html#/docs

## Link do vídeo
[Vídeo Pitch](https://www.youtube.com/watch?v=oEyB0rZntmE)

## EndPoints
`GET` {/id} <br>
#### Códigos de Status

|código|descrição
|------|---------
|200| Listagem de usuários
|404| Usuário não encontrada
---

`POST` {/id} <br>
#### Códigos de Status

|código|descrição
|------|---------
|200| Usuário criado
|500| Falta ou excesso de argumentos
---
