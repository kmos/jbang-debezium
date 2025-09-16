# Jbang with Native Debezium Quarkus Extension

In this repository are present a class Quarkus Application with Debezium Extension and his version using jbang.


## Prerequisite

- Maven 3.9.11
- Oracle GraalVM build 21.0.8+12-LTS-jvmci-23.1-b72
- Docker

## Run the Quarkus Example

- run `docker compose up`
- move to `quarkus-example`
- use for development `mvn quarkus:dev` or to build a native version `mvn clean install -Dnative`

## Run the Jbang Example

- run `docker compose up`
- move to `jbang-example`
- run `jbang debezium.java`

## The problem

The native build is failing with an error which is not present in the classic quarkus application.