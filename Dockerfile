FROM openjdk:8-jre
VOLUME /tmp
VOLUME /application/config/
ENV JAVA_OPTS=""
ARG JAR_FILE=target/testservice-0.0.1-SNAPSHOT.jar
RUN sh -c "echo $JAR_FILE"
COPY target/testservice-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c "touch app.jar"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar app.jar --spring.config.additional-location=file:///application/config/" ]
