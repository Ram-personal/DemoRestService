FROM openjdk:8
ADD target/rest-service-one-v1.jar rest-service-one-v1.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","rest-service-one-v1.jar"]
