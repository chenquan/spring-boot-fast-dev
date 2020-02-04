FROM maven:3.6.0-jdk-8-alpine AS base
WORKDIR /app/web
COPY . .
#RUN cp ./docker/settings.xml  /root/.m2
RUN mvn clean package -DskipTests
#CMD ["/bin/bash"]
FROM opensourceai/jdk:8 as jdk
WORKDIR /app/web
COPY --from=base /app/web/target/album-0.0.1-SNAPSHOT.jar /app/web
CMD [ "java", "-jar", "album-0.0.1-SNAPSHOT.jar" ]
