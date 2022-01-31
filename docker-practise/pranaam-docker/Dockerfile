FROM openjdk:8-jdk-alpine
LABEL "MAINTAINER"="Kanishk Bhatt"
LABEL "EMAIL"="kanishkeminem@gmail.com"

#documetnation
EXPOSE 8089

WORKDIR /usr/local/bin

#volumes are mandatory from both the side
#image building as wella s container running
VOLUME [ "/usr/local/bin/logs" ]

COPY ./target/pranaam-docker-1.0.0.jar ./rest-api.jar

ENTRYPOINT [ "java" , "-Dspring.profiles.active=docker","-jar", "rest-api.jar"]