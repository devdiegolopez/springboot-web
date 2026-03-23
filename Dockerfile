FROM eclipse-temurin:21-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/springboot-web-1.0.1-SNAPSHOT.jar productsAPI.jar
ENTRYPOINT ["java","-jar","/productsAPI.jar"]
LABEL authors="chakray"
