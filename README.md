# Hotels application

REST application for creating, updating and searching hotels.

Technology used : Maven, Java, Spring Boot, Hibernate, H2 DB

# Instructions : How to run application

## Prerequisites
1. Install Java 8 SDK
2. Set JAVA_HOME to point to Java 8 SDK folder
3. Install Maven
4. Clone this repo

## Steps to run the application
1. Open in terminal cloned repo
2. Run mvn clean install
3. Run mvn spring-boot:run
4. Application should be live on http://localhost:8080
   To Test it try http://localhost:8080/swagger-ui.html

# Api DOCS
To see API docs open http://localhost:8080/swagger-ui.html.
You can also use collection from file postman_collection.json.

# Client usage
Since this is a REST application, any client/device that can make HTTP calls can use this service. In terms of frontend frameworks that can be Angular, React, Backbone etc.

# Database
Currently H2 in memory database is used, so db setup is not necessary. With few changes MySQL or some other SQL database can be used.

# TODO
List of things to do is in todo.txt file.