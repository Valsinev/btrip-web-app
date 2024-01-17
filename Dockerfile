# Stage 1: Build Stage
# Dockerfile
FROM ubuntu:20.04
WORKDIR /app
# Install OpenJDK 17
RUN apt-get update && apt-get install -y openjdk-19-jdk

# Copy the project files
COPY . .

# Build the project
RUN ./gradlew build


# Stage 2: Run Stage
FROM openjdk:19-jdk
WORKDIR /app
EXPOSE 8080
COPY --from=build /app/build/libs/b-trip-web-1.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
