FROM openjdk:24-ea-21-slim

ENV MYSQL_USER "root"

ENV MYSQL_PASS "secret"

ENV ENVIRONMENT "PROD"

ENV MYSQL_PORT "3306"

ENV MYSQL_HOST "mysqlcontainer"

COPY /target/JavaPractice2025-1.0-SNAPSHOT.jar .

#EXPOSE 9000

ENTRYPOINT ["java", "-jar", "JavaPractice2025-1.0-SNAPSHOT.jar"]