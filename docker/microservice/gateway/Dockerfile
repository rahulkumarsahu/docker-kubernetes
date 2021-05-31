FROM openjdk:11
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} gateway.jar
ENTRYPOINT ["java","-jar","/gateway.jar"]
EXPOSE 9191