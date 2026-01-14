FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /app

COPY . .

RUN ./mvnw dependency:go-offline -B

RUN ./mvnw clean package -DskipTests

FROM amazoncorretto:21.0.9-alpine3.20

COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app.jar"]