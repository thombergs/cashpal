# Spring Boot Hexagonal
Project shows, how to use hexagonal architecture in your spring boot applications

![Hexagonal Architecture](img/hexagonal-architecture.png)


## Implemented integrations:
* Mysql (Spring Data JPA)
* Redis (Spring Data Redis)


## Prerequisites

* JDK 17
* this project uses Lombok, so enable annotation processing in your IDE
* this project uses Testcontainers, so run Docker on your local machine

## Getting Started
`gradle testBootRun`

## Project Structure
```
└──com/
    └── yourcompany/
        ├── adapter/                # Adapter logic
        │   ├── in/                 # Incoming requests adapters
        │   │   └── http/
        │   └── out/                # Outgoing requests adapters
        │       ├── cache/
        │       ├── kafka/
        │       └── persistense/
        ├── application             # Core logic
        │   ├── domain/
        │   │   ├── model/
        │   │   └── service/
        │   └── port/               # Core logic API
        │       ├── in/
        │       └── out/
        └── common/                 # Neither business logic nor adapters
```

## See More

* [Гексагональная Архитектура и Spring Boot](https://habr.com/ru/articles/795127/)
* Forked and inspired by [hombergs/buckpal](https://github.com/thombergs/buckpal)
* [YouTube: Рустам Ахметов — Архитектура приложения и ошибки проектирования](https://www.youtube.com/watch?v=X6QdWTE1HHw&t=2194s&ab_channel=JPoint%2CJoker%D0%B8JUGru)
* [Hexagonal Architecture with Java and Spring](https://reflectoring.io/spring-hexagonal/)
* [Building a Multi-Module Spring Boot Application with Gradle](https://reflectoring.io/spring-boot-gradle-multi-module/)
