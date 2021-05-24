FROM oraclelinux:8.3
# choosing OL as docker image OS (base image)
#  image we are choosing it must be present in Docker HUB
# FROM instruction will pull the image from DOCKER HUB
LABEL key="rahul"
#just opitional keyword but you can share image owner details
#for any assistance
RUN  dnf  install python3 -y
# DNF is an automated installer in OL 
# DNF will download python and install it from Oracle registry
# RUN will be giving a temporary shell to execute Instruction
RUN  mkdir  /mydocker
#  creating directory to copy code here
COPY  oracle.py  /mydocker/oracle.py
#  copy data from Docker client to Docker Engine 
# under that image -- that is getting build
CMD  ["python3","/mydocker/oracle.py"]
# So this is for running code 
# BUt only as parent process
# CMD is going to decide default parent process for 
# this new image 

