# movieAPI

DESCRIÇÃO:

API desenvolvida para demostração de conhecimento. Aplicação básica para demostração dos conceitos utilizados em API's RESTFUL.
Movie API tem como objetivo a leitura dos dados de filmes em um arquivo no formato CSV executando assim a criação de uma base de dados em memória para uso temporário onde é possível consumir as informações dos filmes carregadas do arquivo diretamente na base de dados enquanto a instância da API estiver ativa no servidor.




FERRAMENTAS:

A API RESTFUL foi desenvolvida baseada no nível 2 de maturidade de Richardson. Com base em Java na versão 8, com o MAVEN para gerenciar as dependências e as funcionalidades através do framework Spring Boot.

Principais dependências: 
* Spring Boot Framework
* H2 Data Base
* Java Persistence Api
* Open CSV
* Hibernate



FUNCIONALIDADE:

* Criar base de dados ao iniciar a API;
* Ler arquivo na pasta "Resources/files/movielist.csv" e salvar os dados na base de dados;
* Através do endpoint com endereço "movie/producers/interval" será obtido o(s) produtor(es) com maior intervalo entre dois prêmios consecutivos, e o que
obteve dois prêmios mais rápido.


EXECUTANDO A APLICAÇÃO:

Para executar a aplicação será necessário possuir a versão 8 do java instalada e uma IDE com o MAVEN configurado.
Após configurado o Maven é preciso clonar o repositório https://github.com/evieira1472/movieAPI/  através do botão [CLONE]
e utilizando o comando "git clone endereco" onde endereço deve ser substituído pela URL escolhida ao clonar o projeto.

Abrir a IDE e importar um novo projeto MAVEN selecionando a pasta mavenAPI baixada em sua maquina local. Ao importar o maven fará o download automáico das dependências, ao finalizar o download das dependências a aplicação estará pronta para ser compilada.

TESTES:

Para testes da API você pode utilizar o próprio navegador ou ferramentas que facilitam a montagem das requisições, por exemplo: Postman.

 - Testando o endpoint para obter os produtores com intervalo mínimo e máximo entre os prêmios dos filmes.
![testeAPI](https://user-images.githubusercontent.com/17409138/214169484-bede1b56-7c98-4d23-9a10-4aa8afdb22ef.jpg)

