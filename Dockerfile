# Stage 1: Build Stage
FROM ubuntu:latest AS build
RUN apt-get update
RUN apt-get install openjdk-17-jdk -y
# Copy the project files
COPY . .

# Build the project
RUN ./gradlew build

# Stage 2: Run Stage
FROM openjdk:17-jdk
EXPOSE 8080
COPY --from=build /app/build/libs/b-trip-web-1.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
