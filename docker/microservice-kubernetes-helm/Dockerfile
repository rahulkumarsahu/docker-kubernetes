FROM openjdk:11.0.11-oraclelinux8
# choosing OL as docker image OS (base image)
#  image we are choosing it must be present in Docker HUB
# FROM instruction will pull the image from DOCKER HUB

LABEL key="rahulkumar060995@gmail.com"
#it will set the metedata to image

ARG SERVICE_NAME
ARG JAR_FILE_NAME
ARG PORT
# from build command we will pass the value and it will get bind here.

VOLUME /tmp
#it will create tmp folder to store tmp data and will get lost once container exit.

RUN  mkdir  /myService
#  creating directory to copy code here

COPY ${SERVICE_NAME}/target/${JAR_FILE_NAME} /myService/app.jar
#  copy data from Docker client to Docker Engine
# under that image -- that is getting build

WORKDIR  /myService
# changing directory

ENTRYPOINT ["java","-jar","app.jar"]
#CMD java -jar app.jar
#it will replace by parent process but entrypoint not
# So this is for running code
# BUt only as parent process
# CMD is going to decide default parent process for
# this new image
EXPOSE ${PORT}