FROM openjdk:11

MAINTAINER prasad<narasimhaprasad812@gmail.com>

COPY target/MessageApp01-0.0.1-SNAPSHOT.jar  /usr/app/

WORKDIR /usr/app/

EXPOSE 4343

ENTRYPOINT ["java", "-jar", "MessageApp01-0.0.1-SNAPSHOT.jar"]


