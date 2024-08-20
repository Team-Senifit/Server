# jdk17 Image Start
FROM openjdk:17-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the built JAR file from the host machine to the container
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

## Expose the port the application runs on
#EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]