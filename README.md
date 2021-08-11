# battleOfStalingradService
Web service for Battle Of Stalingrad, a game of tanks, simulate battle between tanks, SpringBoot, MongoDB

I didn't have time to create the docker-compose.yaml imagen so this is the 
database that I'm using:

MongoDB db version v5.0.2
Database: battleOfStalingrad

There is a Postman collection attached that can be used to send Request to the current endpoints:

/api/v1/tanks  
/api/v1/maps

API Specification can be found:
https://app.swaggerhub.com/apis/MaFerLlamas/battle-of-stalingrad-service/1.0.0 

## Resources

### Swagger
Used to create the Swagger 2.0 API SPEC
https://app.swaggerhub.com/apis/MaFerLlamas/battle-of-stalingrad-service/1.0.0

### Spring Boot 
- spring-boot-starter-data-mongodb
Used the annotations to create the repositories
- spring-boot-starter-web
Used to create the controllers
- spring-boot-starter-validation
Used the Annotations to validate the Spec

### Tools
- JDK-1.8
- Eclipse IDE
- Apache Maven 3.8.1
- SpringBoot Initializr https://start.spring.io/   (Used to pull the initial dependencies for spring boot  )

### NoSQL Database
MongoDB version v5.0.2
Mongosh version 1.0.4
