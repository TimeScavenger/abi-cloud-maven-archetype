FROM docker.io/library/openjdk:8u292-oraclelinux8
COPY ./target/abi-cloud-server.jar /app.jar
EXPOSE 8080/tcp
ENTRYPOINT java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app.jar
