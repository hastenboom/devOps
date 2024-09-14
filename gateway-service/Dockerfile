FROM openjdk:11-jre-slim
LABEL authors="John"
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
EXPOSE 9083
ENTRYPOINT ["java","-Dspring.profiles.active=prod","-jar","/app.jar"]


