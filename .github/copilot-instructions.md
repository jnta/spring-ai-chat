# Copilot Project Memory Bank

This document serves as a memory bank for the `spring-ai-chat` project, summarizing its structure, technologies, and key conventions for Copilot and contributors.

---

## Project Overview

- **Name:** spring-ai-chat
- **Language:** Java 17+
- **Frameworks:**
  - Spring Boot 3.0+
  - Project Reactor (Reactive Streams)
- **Build Tool:** Gradle
- **Main Application:** `SpringAiChatApplication.java`
- **Primary Package:** `com.jonataalbuquerque.spring_ai_chat`

---

## Directory Structure

- `src/main/java/com/jonataalbuquerque/spring_ai_chat/`
  - `SpringAiChatApplication.java` (entry point)
  - `config/` (Spring configuration, e.g., `ChatConfig.java`)
  - `controller/` (REST controllers, e.g., `ChatController.java`, `MovieController.java`)
  - `dto/` (Data Transfer Objects, e.g., `ChatRequest.java`, `MovieRecommendation.java`)
- `src/main/resources/`
  - `application.yml` (main Spring config)
  - `static/`, `templates/` (web resources)
- `src/test/java/com/jonataalbuquerque/spring_ai_chat/`
  - `SpringAiChatApplicationTests.java` (main test)
  - `controller/` (controller tests)
- `build.gradle`, `settings.gradle`, `gradle.properties` (Gradle build files)
- `docker-compose.yml` (container orchestration)

---

## Key Conventions

- **Spring Boot:**
  - Use `@RestController` for API endpoints
  - Use `@Configuration` for config classes
  - Use `@RequestMapping`/`@GetMapping`/`@PostMapping` for routing
- **DTOs:**
  - Located in `dto/` package
  - Used for request/response payloads
- **Reactive Programming:**
  - Use Project Reactor (`Mono`, `Flux`) for async flows
- **Testing:**
  - Use JUnit for unit/integration tests
  - Test classes mirror main package structure
- **Configuration:**
  - Main config in `application.yml` (YAML preferred)

---

## Best Practices

- Follow Java and Spring Boot idioms
- Keep controllers thin; delegate logic to services (if present)
- Use DTOs for all API payloads
- Prefer constructor injection for dependencies
- Write tests for all controllers and core logic
- Use Gradle tasks for build/test

---

## Additional Notes

- Project supports containerization via Docker Compose
- Prometheus config available in `config/prometheus.yml`
- For agent and AI integration, see `.github/agents/`

---

This file is auto-generated to help Copilot and contributors understand and navigate the project efficiently.
