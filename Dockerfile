#FROM maven:3.6.3 AS maven
#LABEL MAINTAINER="Amirkhany@gmail.com"
#WORKDIR /usr/src/app
#COPY . /usr/src/app
## Compile and package the application to an executable JAR
#RUN mvn package spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=dev -Dmaven.test.skip=true"



FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=dev", "-jar","/app.jar"]

