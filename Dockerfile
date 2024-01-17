# Stage 1: Build Stage
FROM ubuntu:latest AS build
WORKDIR /app
RUN apt-get update && apt-get install -y openjdk-17-jdk
COPY . .
RUN ./gradlew build

# Stage 2: Run Stage
FROM openjdk:17-jdk-slim
WORKDIR /app
EXPOSE 8080
COPY --from=build /app/build/libs/b-trip-web-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
