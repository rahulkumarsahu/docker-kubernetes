FROM openjdk:11.0.11-oraclelinux8
# choosing OL as docker image OS (base image)
#  image we are choosing it must be present in Docker HUB
# FROM instruction will pull the image from DOCKER HUB
LABEL key="rahulkumar060995@gmail.com"

ARG JAR_FILE_NAME
ARG PORT

VOLUME /tmp

RUN  mkdir  /mydocker
#  creating directory to copy code here

COPY /target/${JAR_FILE_NAME} /mydocker/app.jar
#  copy data from Docker client to Docker Engine
# under that image -- that is getting build

WORKDIR  /mydocker
# changing directory

ENTRYPOINT ["java","-jar","app.jar"]
#CMD java -jar app.jar
#it will replace by parent process but entrypoint not
# So this is for running code
# BUt only as parent process
# CMD is going to decide default parent process for
# this new image
EXPOSE ${PORT}