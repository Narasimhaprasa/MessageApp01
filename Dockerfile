# Use an official OpenJDK runtime as a base image
FROM openjdk:11-jre-slim

# Set the working directory within the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/MessageApp01.jar  MessageApp01.jar

# Specify the command to run when the container starts
CMD ["java", "-jar", "MessageApp01.jar"]
