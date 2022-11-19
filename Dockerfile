#FROM maven:3.6.0-jdk-11-slim AS build
#COPY src /home/app/src
#COPY pom.xml /home/app
#RUN mvn -f /home/app/pom.xml clean package

#FROM maven:3.6.0-jdk-8-alpine
#RUN mvn spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=dev"
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#EXPOSE 8080
#EXPOSE 3306
#ENTRYPOINT ["java", "-Dspring.profiles.active=dev", "-jar","/app.jar"]
#mvn spring-boot:run -Dspring-boot.run.arguments="--spring.profiles.active=dev"

# AS <NAME> to name this stage as maven
FROM maven:3.6.3 AS maven
LABEL MAINTAINER="sgwebfreelancer@gmail.com"

WORKDIR /usr/src/app
COPY . /usr/src/app
# Compile and package the application to an executable JAR
RUN mvn package -Dmaven.test.skip=true


# For Java 11,
FROM openjdk:8-jdk-alpine

#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
#
#WORKDIR /opt/app
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]

# Copy the spring-boot-api-tutorial.jar from the maven stage to the /opt/app directory of the current stage.
#COPY --from=maven /usr/src/app/target/${JAR_FILE} /opt/app/

#ENTRYPOINT ["java", "-jar","/app.jar"]