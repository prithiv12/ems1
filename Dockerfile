FROM openjdk:8
EXPOSE 8080
ADD target/ems.jar ems.jar
ENTRYPOINT ["java","-jar","/ems.jar"]