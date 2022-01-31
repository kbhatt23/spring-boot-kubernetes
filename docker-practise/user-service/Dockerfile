FROM maven:3.6.1-jdk-8-alpine AS build

WORKDIR /userservice
COPY pom.xml .

# dependency:go-offline - Goal that resolves all project dependencies, 
# including plugins and reports and their dependencies. -B -> Batch mode
RUN mvn dependency:go-offline -B

COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:8-jdk-alpine
COPY --from=build /userservice/target/user-service-1.0.0.jar /userservice/user-service-1.0.0.jar 
EXPOSE 9000
ENTRYPOINT ["java","-Dspring.profiles.active=docker","-jar","/userservice/user-service-1.0.0.jar"]