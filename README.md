# Employee Data Dashboard with Spring-Boot/Angular

- [Overview](#overview)
- [Set-Up & Environment](#setup)
- [Installation](#installation)
- [Execution and Viewing the Results](#viewing-the-analysis)

## Overview

A full stack dashboard displaying the list of available employee records in database. The main objective behind this
project is to understand the process of creating a full stack application in Spring Boot leveraging Angular.

## Set-Up & Environment

This project is set up on following tech stacks. Ensure to download the appropriate dependencies while setting this up
in your machine.

- Frontend - [Angular](https://angular.io/)
- Backend - [Spring Boot](https://spring.io/projects/spring-boot)
- Database - [H2 In Memory](https://www.h2database.com/html/main.html)
- Packaging Framework - [Apache Maven](https://maven.apache.org/)

## Installation

Check out the project onto your local machine.

``` bash
git checkout https://github.com/thirumalaigobu/full-stack-employee-dashboard.git
```

Navigate to the directory containing the **pom.xml** and build the project using the following maven command.

``` bash
mvn clean install
```

Check for a generated **/target** in the same level of the directory as pom.xml as below.

![Alt text](src/main/resources/target folder path.JPG?raw=true "Title")

## Execution and Viewing the Results

Navigate to the path containing **spring-boot-fullstack-1.0-SNAPSHOT.jar** under /target and execute the jar with the
following command.

``` bash
java -jar spring-boot-fullstack-1.0-SNAPSHOT.jar
```

Post the application start, navigate to **http://localhost:8080/** to view the dashboard containing the employee details
stored in the DB. The output would be as below.

![Alt text](src/main/resources/Full Stack App Output.JPG?raw=true "Title")






