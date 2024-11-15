FROM openjdk:17-jdk-alphine
COPY : ./target/collections-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/springboot.jar"]