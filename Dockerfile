FROM jenkins/jenkins:lts-jdk21

USER root

RUN apt update && apt install -y docker.io

RUN usermod -aG docker jenkins