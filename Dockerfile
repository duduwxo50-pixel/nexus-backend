# Etapa 1: Construir el JAR
FROM maven:3.9.9-eclipse-temurin-17 AS builder
WORKDIR /app
COPY pom.xml .
COPY src ./src
COPY mvnw .
COPY .mvn ./.mvn
RUN chmod +x ./mvnw
RUN ./mvnw clean package -DskipTests

# Etapa 2: Imagen runtime ligera
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
