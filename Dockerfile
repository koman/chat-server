FROM alpine:3.4

RUN apk --update add openjdk8-jre

RUN mkdir -p /opt/bmw-chat/lib

COPY target/bmw-chat-1.0.0-SNAPSHOT.jar /opt/bmw-chat/lib

ENTRYPOINT ["/usr/bin/java"]

CMD ["-jar", "/opt/bmw-chat/lib/bmw-chat-1.0.0-SNAPSHOT.jar"]

EXPOSE 8080
