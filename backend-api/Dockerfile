# Stage 1: Build the application using JDK 22
FROM eclipse-temurin:22-jdk-alpine AS build
WORKDIR /app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw clean package -DskipTests

# Stage 2: Create a lightweight runtime image using JRE 22
FROM eclipse-temurin:22-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar HobbyCircles.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "HobbyCircles.jar"]