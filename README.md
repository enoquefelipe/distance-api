# README #

The "maxipago" project is a simplified web application, built with Spring Boot. 

This application is configured to use Spring Boot internal Servelet Container "Tomcat".

To run this application just follow the instructions below.

OBS: The internal Servelet Container configured to run on port 8080, if you prefer you can change the.


### Database ###

The application is configured to work with the MySQL database, so to begin with, just:

	* Create the database with the name of your preference

	* Import the SQL script located in folder: maxipago/src/main/resources/import.sql

	* Change coonnection variables "url", "username", "password" in the class: maxipago/src/main/java/com/maxipago/util/ConnectionFactory.java 

### Deploy and run ###

```

This is an maven project, to run, just run the commands:

	* mvn clean

	* mvn package

	* java -jar target/maxipago-0.0.1-SNAPSHOT.jar

```
#### Application access

To access the API using, just use the URL below by passing the unit parameter "K" or "M"

Examplo: 

	* Request in JSON format: http://localhost:8080/api/cities.json?unit=k
	
	* Request in XML format: http://localhost:8080/api/cities.json?unit=m



#### Combination Algorithm

The combination algorithm used was the "Geo Datasource"

	* http://www.geodatasource.com/developers/java
