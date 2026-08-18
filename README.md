# spring-boot3-quartz

A Spring Boot sample project demonstrating [Quartz Scheduler](https://www.quartz-scheduler.org/) integration with a JDBC-backed job store, JPA/Flyway-managed MySQL persistence, and OpenAPI/Swagger documentation.

## Tech Stack

- Java 25
- Spring Boot 4.1.0
- Spring Data JPA / Hibernate
- Quartz Scheduler (JDBC job store)
- Flyway (schema migrations)
- MySQL
- springdoc-openapi (Swagger UI)
- Lombok
- ModelMapper

## Prerequisites

- JDK 25
- MySQL running locally on port `3306` with a `root`/`root` user (or update `src/main/resources/application.yml` to match your credentials)

## Configuration

Database, Quartz, and mail settings live in `src/main/resources/application.yml`:

- `spring.datasource.*` — MySQL connection; the `blog` schema is created automatically if it doesn't exist.
- `spring.flyway.*` — application schema migrations under `src/main/resources/db/migration`.
- `spring.quartz.*` — JDBC-backed job store; the Quartz schema is loaded from `src/main/resources/quartz/quartz.sql`.
- `spring.mail.*` — SMTP settings (placeholder Gmail credentials by default; replace with real credentials to enable mail-dependent features).

## Running the app

```bash
./mvnw spring-boot:run
```

Or build and run the jar directly:

```bash
./mvnw clean package
java -jar target/spring-boot3-quartz-0.0.1-SNAPSHOT.jar
```

The app starts on port `8081` under the `/api` context path.

- Swagger UI: http://localhost:8081/api/swagger-ui/index.html
- OpenAPI docs: http://localhost:8081/api/v3/api-docs
- Actuator health: http://localhost:8081/api/actuator/health

## Running tests

```bash
./mvnw test
```

Tests boot the full Spring context, so a reachable MySQL instance is required.

## CI

GitHub Actions (`.github/workflows/maven.yml`) builds and tests the project on JDK 25 for every push and pull request to `main`.
