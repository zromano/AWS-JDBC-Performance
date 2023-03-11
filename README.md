To run application:
```shell
./gradlew bootRun
```

To change between AWS and non-AWS mysql drivers view comments in `build.gradle` and `application.yml`


To demo: run the application and load test create the following DB and load test the `GET /users` endpoint.
Note by default it runs on `localhost:9999`


DB creation:
```sql
CREATE DATABASE userdb;

CREATE TABLE IF NOT EXISTS user (
    ID                     BIGINT              AUTO_INCREMENT NOT NULL,
    FIRST_NAME                  VARCHAR(50)         DEFAULT NULL,
    LAST_NAME                   VARCHAR(50)         DEFAULT NULL,
    EMAIL_ADDRESS               VARCHAR(100)        DEFAULT NULL,
    PRIMARY KEY(id)
);
```

Seed DB Data can be found in `SEED_DATA.sql`
