# elisa service registry


# overview
Eureka Server is an application that holds the information about all client-service applications. Every Micro service will register into the Eureka server and Eureka server knows all the client applications running on each port and IP address. Eureka Server is also known as Discovery Server.

  - language    java 
  - version     11
  - framework   spring-boot
  - dependency  `spring-cloud-starter-netflix-eureka-server`
  - Main class add some Annotations `@EnableEurekaServer`

