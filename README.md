# springboot-elasticsearch-example
Projeto de exemplo para demonstrar a utilização do SpringBoot com o Elasticsearch. 

A idéia básica do projeto é indexar os trabalhos de conclusão de curso de uma Universidade de modo que estes possam ser pesquisados de maneira rápida e com filtragem ampla de campos.

## Tecnologias utilizadas no projeto:
* Java 8
* SpringBoot 2.1.0.BUILD-SNAPSHOT
* [Elasticsearch 6.3.1](https://www.elastic.co/downloads/elasticsearch)
* Gradle
* IntelliJ IDEA 2017
* [PostMan Plugin Chrome](https://chrome.google.com/webstore/detail/postman/fhbjgbiflinjbdggehcddcbncdddomop?hl=pt-BR)

## Readme
Para executar o projeto corretamente, baixe o Elasticsearch e siga os passos da página oficial para instalação. Na instalação do Elasticsearch o nome do cluster deve ser "elasticsearch" ou então crie um nome de seu interesse e altere para este nome que você indicou no arquivo **core-application.properties** a variável **'elasticsearch.clustername'**.

## Run
Inicie a aplicação e o Elasticsearch. Para efetuar a indexação, execute uma requisição post na url: http://localhost:8080/elastic-example-api/publicacao/indexar.

Para conferir os dados indexados no Elasticsearch, execute uma requisição get na url: http://localhost:9200/tcc/publicacao?pretty=true.

## Todo
- [X] Configuração do projeto;
- [X] Implementação do endpoint de indexação;
- [ ] Implementação do endpoint da consulta ampla;
- [ ] Implementação do endpoint da consulta por filtros;
- [ ] O que surgir...
