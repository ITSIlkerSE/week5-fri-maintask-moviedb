FROM openjdk:17

LABEL maintainer="test@neuefische.de"

ADD backend/target/week5-fri-maintask-moviedb.jar week5-fri-maintask-moviedb.jar

CMD [ "sh", "-c", "java -DServer.port=$PORT -jar /week5-fri-maintask-moviedb.jar"]