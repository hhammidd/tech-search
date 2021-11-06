FROM openjdk:8
EXPOSE 8080
ADD target/tech-search.jar tech-search.jar
ENTRYPOINT ["java","-jar","/tech-search.jar"]