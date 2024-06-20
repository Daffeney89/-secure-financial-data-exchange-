# Use Java 11 base image from the Docker Hub
FROM openjdk:11
# Copy the application's jar file and run the Java application
COPY ./target/my-application.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch my-application.jar'
ENTRYPOINT ["java","-jar","my-application.jar"]
