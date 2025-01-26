FROM openjdk:24-ea-21

ENV MYSQL_USER "root"

ENV MYSQL_PASS "secret"

ENV ENVIRONMENT "PROD"

ENV MYSQL_PORT "3306"

ENV MYSQL_HOST "mysqlcontainer"

ADD https://repo1.maven.org/maven2/com/mysql/mysql-connector-j/8.0.31/ .

COPY /target/JavaPractice2025-1.0-SNAPSHOT.jar .

#EXPOSE 9000

ENTRYPOINT ["java", "-jar", "JavaPractice2025-1.0-SNAPSHOT.jar"]