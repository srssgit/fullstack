FROM openjdk:11-jre

COPY ./target/portalservice-0.0.1-SNAPSHOT.jar /usr/src/portal/
WORKDIR /usr/src/portal/
EXPOSE 8080
CMD ["java", "-jar", "-XX:+ExitOnOutOfMemoryError", "portalservice-0.0.1-SNAPSHOT.jar"]