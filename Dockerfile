FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8080
EXPOSE 3306
ENTRYPOINT ["java", "-Dspring.profiles.active=dev", "-jar","/app.jar"]