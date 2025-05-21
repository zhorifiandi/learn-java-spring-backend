# 🚀 Spring Boot Kafka Microservice

A robust, production-ready microservice demonstrating advanced Java and Spring Boot capabilities with Kafka integration. This project showcases modern Java development practices, event-driven architecture, and containerization.

## ✨ Key Features

### 🛠️ Technical Excellence
- **Spring Boot 3.x** with Java 17 features
- **Event-Driven Architecture** using Apache Kafka
- **Docker & Docker Compose** for containerization
- **Gradle** for dependency management
- **Lombok** for clean, boilerplate-free code

### 🏗️ Architecture Highlights
- **Microservices Architecture** with clear separation of concerns
- **Event-Driven Communication** using Kafka topics
- **RESTful API** design following best practices
- **Health Checks** for monitoring service status
- **Environment-Based Configuration** for different deployment scenarios

## 🚀 Getting Started

### Prerequisites
- Java 17 or higher
- Docker and Docker Compose
- Gradle (optional, for local development)

### Quick Start
1. Clone the repository:
```bash
git clone https://github.com/your-username/learn-java-spring-backend.git
cd learn-java-spring-backend
```

2. Start the services:
```bash
docker-compose up --build
```

The application will be available at `http://localhost:8080`

## 📚 API Documentation

### Message Production
```bash
curl -X POST http://localhost:8080/api/messages \
  -H "Content-Type: application/json" \
  -d '{
    "key": "user-1",
    "message": "Hello from Spring!"
  }'
```

### Health Check
```bash
curl http://localhost:8080/health
```

## 🏗️ Project Structure
```
src/
├── main/
│   ├── java/
│   │   └── com/zhorifiandi/learn_java_spring_backend/
│   │       ├── controller/    # REST endpoints
│   │       ├── service/       # Business logic
│   │       ├── model/         # Data models
│   │       └── config/        # Configuration classes
│   └── resources/
│       └── application.yml    # Application configuration
```

## 🔧 Technical Implementation

### Kafka Integration
- **Producer Service**: Asynchronous message production
- **Consumer Service**: Event-driven message consumption
- **Topic Configuration**: Customizable through application properties
- **Error Handling**: Robust exception management

### Docker Setup
- **Multi-stage builds** for optimized image size
- **Service orchestration** with Docker Compose
- **Environment isolation** for development and production
- **Health checks** for service monitoring

## 🧪 Testing
- Unit tests for business logic
- Integration tests for API endpoints
- Kafka consumer/producer tests
- Docker container tests

## 🛠️ Development

### Local Development
```bash
./gradlew bootRun
```

### Building
```bash
./gradlew build
```

### Testing
```bash
./gradlew test
```

## 📈 Performance Considerations
- Optimized Kafka consumer configurations
- Efficient message serialization/deserialization
- Resource-aware Docker configurations
- Proper error handling and retry mechanisms

## 🔐 Security
- Input validation
- Error message sanitization
- Secure configuration management
- Docker security best practices

## 🚀 Future Enhancements
- [ ] Add OpenAPI/Swagger documentation
- [ ] Implement metrics with Micrometer
- [ ] Add distributed tracing
- [ ] Implement circuit breakers
- [ ] Add more comprehensive logging

## 🤝 Contributing
Contributions are welcome! Please feel free to submit a Pull Request.

## 📝 License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Author
Your Name - [Your GitHub](https://github.com/your-username)

---
⭐️ Star this repository if you find it helpful!

# learn-java-spring-backend
