#install java 17
# Use the official OpenJDK image as the base image
# This image includes OpenJDK 17, which is required for our Spring Boot application
FROM openjdk:17-jdk-slim

# MAINTAINER instruction is deprecated in favor of using label
# MAINTAINER eazybytes.com
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="eazybytes.com"

# Set the working directory inside the container
# There is jar inside the target folder and copy the same into the docker image
#jar file name is not changed in the maven build
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

# How execute the jar file will run using java
ENTRYPOINT ["java", "-jar", "accounts-0.0.1-SNAPSHOT.jar"]

