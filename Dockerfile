FROM openjdk:latest
WORKDIR /usr/src/app
COPY ./src/main/java .
RUN javac -sourcepath . -d output ./org/example/Program.java
WORKDIR /usr/src/app/output
ENTRYPOINT ["java","org.example.Program"]