FROM adoptopenjdk/openjdk11:alpine-jre

EXPOSE 8080

ADD target/REST2_0-0.0.1-SNAPSHOT.jar rest.jar

CMD ["java", "-jar", "rest.jar"]