# spring-boot-config-server

Spring Cloud Config Server for Getting Started with Spring Boot presentation. 

# 1 - Spring Intializr Creation

I used the following at http://start.spring.io to create the Config Server application.

* Build tool - Gradle 
* Language - Java
* Spring Boot Version - 1.5.10.RELEASE 
* Group = com.scmc
* Artifact = boot-demo-config-server
* Name = boot-demo-config-server
* Package Name = com.scmc.bootdemo.config
* Packaging = JAR
* Java Version = 1.8
* Dependencies = Config Server, Actuator 

# 2 - Config Server Updates

## 2.1 - Update Application Class

Next, I updated the class BootDemoConfigServerApplication to include the annotation below:

@EnableConfigServer

This enables the configuration server to run at application startup.

## 2.2 - Update Application Properties

In the application.properties file, I've updated the configuration of the application port and source config:

server.port=8888
spring.cloud.config.server.git.uri=https://github.com/michaelhoffmantech/spring-boot-config-repo
spring.cloud.config.server.git.search-paths=restaurant-api

* The server port is changed to again not conflict with 8000's for microservices
* Using a URI for a GitHub repository that contains the properties backing the server
* Using a search path to find the folder and path to demo properties. 

# 3 - Running the Server

To run the configuration server, simply use the command:

.\gradlew bootRun

You can navigate here to see the properties for the demo:

http://localhost:8888/restaurant-api/restaurant-api

# 4 - More Information

* Spring's page on Spring Cloud Config is found here: https://cloud.spring.io/spring-cloud-config/single/spring-cloud-config.html
* Can also use the getting started to get startup details: https://spring.io/guides/gs/centralized-configuration/