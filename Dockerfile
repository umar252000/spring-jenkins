FROM openjdk:18
EXPOSE 9090
ADD target/spring-jenkins.jar spring-jenkins.jar
ENTRYPOINT [ "java","-jar","/spring-jenkins.jar" ]