# Product Management API (Spring Boot)

Simple REST API for managing products using Spring Boot, Spring Data JPA, H2 and OpenAPI (Swagger).

## Run

On Windows (from project root):

```cmd
gradlew.bat bootRun
```

Or build and run jar:

```cmd
gradlew.bat build
java -jar build\libs\second-project-0.0.1-SNAPSHOT.jar
```

## Endpoints (examples)

Base: http://localhost:8080/api/v1/products

- GET /api/v1/products
- GET /api/v1/products/{id}
- POST /api/v1/products
  - body: {"name":"Coffee", "description":"Beans", "price": 9.99}
- PUT /api/v1/products/{id}
- DELETE /api/v1/products/{id}

Swagger UI: http://localhost:8080/swagger-ui/index.html
H2 console: http://localhost:8080/console

## Notes

- H2 is configured in-memory. Data will be lost on restart.
- Error responses are returned as JSON with timestamp and message.

