# movieAPI

DESCRIÇÃO:

API desenvolvida para demostração de conhecimento. Aplicação básica para demostração dos conceitos utilizados em API's RESTFUL.
Movie API tem como objetivo a leitura e carregamento dos dados de um arquivo no formato CSV executando assim a criação de uma base de dados em memória para uso temporário onde é possível consumir as informações carregadas do arquivo diretamente na base de dados enquanto a instância da API estiver ativa no servidor.




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


