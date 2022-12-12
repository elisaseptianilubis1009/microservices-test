# elisa gateway

## overview
In a distributed environment, services need to communicate with each other. However, this is interservice communication. We also have use-cases where a client outside our domain wants to hit our services for the API. So, either we can expose the address of all our microservices which can be called by clients OR we can create a Service Gateway which routes the request to various microservices and responds to the clients.
  - language    java 
  - version     11
  - framework   spring-boot
  - dependency  `spring-cloud-starter-gateway, spring-cloud-starter-netflix-eureka-client`
  - Main class add some Annotations `@EnableEurekaClient`

## Run and Build 
go to project folder and run `mvn clean package` then `mvn spring-boot:run`
