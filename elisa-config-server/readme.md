# elisa config server

## overview
Spring Cloud Configuration Server is a centralized application that manages all the application related configuration properties. In this chapter, you will learn in detail about how to create Spring Cloud Configuration server.
  - language    java 
  - version     11
  - framework   spring-boot
  - dependency  `spring-cloud-config-server, pring-cloud-starter-netflix-eureka-client`
  - Main class add some Annotations `@EnableEurekaClient,@EnableConfigServer`

## Run and Build 
go to project folder and run `mvn clean package` then `mvn spring-boot:run`

