FROM openjdk:11
RUN mkdir/app
COPY target/ /app
WORKDIR /app
CMD java -jar phase4project-0.0.1-SNAPSHOT.jar --spring.config.location=application.propeties