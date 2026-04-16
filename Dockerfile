# Use a Java runtime as the base image
FROM eclipse-temurin:21-jre-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the target folder to the container
# Note: Ensure the JAR name matches your pom.xml (notification-app-1.0.jar)
COPY target/notification-app-1.0.jar app.jar

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
