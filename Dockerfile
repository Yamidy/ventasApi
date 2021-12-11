# Maven 
FROM maven:3.8.4-openjdk-17-slim as builder
WORKDIR /app
COPY pom.xml .
RUN mvn -e -B dependency:resolve
COPY src ./src
RUN mvn install -Dmaven.test.skip=true
# RUN mvn clean -e -B package

FROM openjdk:16
LABEL maintainer="s-f-c-m"
WORKDIR /app
COPY --from=builder /app/target/ventas-0.0.1-SNAPSHOT.jar /app/ventas-api.jar
# ADD target/ventas-0.0.1-SNAPSHOT.jar ventas-api.jar
ENTRYPOINT ["java", "-jar", "/app/ventas-api.jar"]
