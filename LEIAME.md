# README #

O projeto "maxipago" é uma aplicação web simplificada, construida com Spring Boot. 

Essa aplicação esta configurda para utilizar o Servelet Container "Tomcat" interno do próprio Spring Boot.

Para executar esse aplicação basta seguir as instruções a baixo.

OBS: O Servelet Container interno do spring boot esta pré configurado para executar na porta 8080, caso prefira você pode alterar.


### Banco de dados ###

A aplicação esta configurada para trabalhar com o banco de dados MySQL, então para começar, basta:

	* Criar o banco de dados com o nome que preferir

	* Importar o script SQL que esta localizado na pasta: maxipago/src/main/resources/import.sql

	* Alterar as variáveis coonexão "url", "username", "password" na classe: maxipago/src/main/java/com/maxipago/util/ConnectionFactory.java 

### Implantar e executar a aplicação ###

```

Esse é um projeto Maven, para executar, basta executar os seguintes comandos:

	* mvn clean

	* mvn package

	* java -jar target/maxipago-0.0.1-SNAPSHOT.jar

```
#### Acesso a aplicação

Para acessar a API utilizando, basta utilizar a URL abaixo passando o parametro de unidade "K" ou "M"

Exemplo: 

	* Request em formato JSON: http://localhost:8080/api/cities.json?unit=k
	
	* Request em formato XML: http://localhost:8080/api/cities.json?unit=m



#### Algoritmo de combinação

O algoritimo de combinação utilizado foi o da "Geo Datasource"

	* http://www.geodatasource.com/developers/java
