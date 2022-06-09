FROM maven:3.6.0-jdk-11-slim
WORKDIR /app
COPY . .
EXPOSE 6231
RUN mvn clean install
ENTRYPOINT ["mvn","-f", "/app/remoting-rmi-server","spring-boot:run"]
