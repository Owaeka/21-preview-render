FROM maven:3.9.4-eclipse-temurin-21-alpine as builder

WORKDIR /build
COPY . /build

RUN mvn clean package -DskipTests

FROM openjdk:21-jdk
COPY --from=builder /build/target/*.jar /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]