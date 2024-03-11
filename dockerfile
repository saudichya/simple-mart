# aplpine means very small lightweight image of openjdk
# alpine is actually small linux distribution
# lot of images use this tag to suggest lightweight distribution
FROM openjdk:17-jdk-alpine

ARG JAR_FILE

COPY ${JAR_FILE} simple_mart.jar

ENTRYPOINT ["java","-jar","/simple_mart.jar"]