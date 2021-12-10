FROM openjdk:16
LABEL maintainer="s-f-c-m"
ADD target/ventas-0.0.1-SNAPSHOT.jar ventas-api.jar
ENTRYPOINT ["java", "-jar", "/ventas-api.jar"]