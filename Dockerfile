FROM openjdk:8-jdk-alpine
LABEL MAINTAINER="Amirkhany@gmail.com"
ARG WAR_FILE=target/*.war
COPY ${WAR_FILE} app.war
EXPOSE 8080
ENTRYPOINT ["java", "-Dspring.profiles.active=dev", "-jar","/app.war"]

