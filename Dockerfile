FROM maven:3.5.4-jdk-8-alpine as builder
COPY . /project/
WORKDIR /project/
RUN mvn clean install


FROM openjdk:jre-alpine3.8
WORKDIR /project/
COPY --from=builder /project/target/spring-boot-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD ["java", "-jar", "spring-boot-0.0.1-SNAPSHOT.jar"]