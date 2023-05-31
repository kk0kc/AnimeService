FROM openjdk:8-jdk-alpine
#ARG JAR_FILE=target/animeservice-0.0.2-SNAPSHOT.jar
#ADD ${JAR_FILE} app.jar
COPY target/animeservice-2.4.1.jar app.jar
COPY /src/main/webapp/WEB-INF/views/flows/register/signup-flow.xml /app/resourses/
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
#ENTRYPOINT ["java", "-jar", "/app.jar"]