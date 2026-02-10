FROM eclipse-temurin:21-jdk-alpine
#
EXPOSE 8080
#
ADD target/github-actions-0.0.1-SNAPSHOT.jar github-actions.jar
#
ENTRYPOINT ["java", "-jar","github-actions.jar"]