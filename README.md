# Spring Cloud
Projeto Service Discovery

Este projeto consiste em demonstrar um Service Discovery utilizando Spring Boot com Eureka+Zuul.

## Configuração
Faça clone do repositório

``` 
$ git clone https://github.com/waldecleber/spring-cloud.git
$ cd spring-cloud
``` 

1 - Crie uma instância de Eureka Service
``` 
$ cd eureka
$ ./gradlew bootRun
``` 

2 - Crie uma instancia de Clientes
``` 
$ cd clientes
$ ./gradlew bootRun
``` 

3 - Crie uma instància de Hoteis
``` 
$ cd eureka
$ ./gradlew bootRun
``` 

4 - Crie uma instância de Reservas

5 - Crie uma instância de ZuulProxy
