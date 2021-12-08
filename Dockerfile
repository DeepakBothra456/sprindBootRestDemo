FROM openjdk:8
ADD target/demo.jar demo.jar
EXPOSE 8082
ENTRYPOINT ["java", "-jar", "demo.jar"]
