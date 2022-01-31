#must provide exact version otherwise it takes latest whihc might change over time
FROM tomcat:8.5.16-jre8-alpine

#not mandatory, just for documentation, as it is taken care by -p commadn while running container
EXPOSE 8080

#maintainer is deprecated hence using label
#MAINTAINER Kanishk Bhatt "kanishkeminem@gmail.com"
#better to keep it at the end as if we change this then even other below steps will be repeated

LABEL MAINTAINER="Kanishk bhatt"
LABEL EMAIL="kanishkeminem@gmail.com"

ARG TOMCAT_ROOT_DIRECTORY=/usr/local/tomcat/webapps

#remove old files
RUN rm -rf ${TOMCAT_ROOT_DIRECTORY}/*
#copy the war with a different name
COPY ./target/pranaam-docker-tomcat-1.0.0.war ${TOMCAT_ROOT_DIRECTORY}/ROOT.war

#environment variable for docker profile
ENV JAVA_OPTS="-Dspring.profiles.active=docker"

#CMD by default is inherited from base image whihc is tomcat, hence it is not amndatory to add CMD
# here if that is same as parent image
#however for better readability we add the CMD
#CMD ["catalina.sh","run"]

#forcing so that no one can override the execution commadn while using docker container run command
ENTRYPOINT [ "catalina.sh","run" ]

