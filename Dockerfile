FROM openjdk:17
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} kubernetes-1.jar
ENTRYPOINT ["java","-jar","/kubernetes-1.jar"]
EXPOSE 8080/tcp