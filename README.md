# Spring Batch Processor

A robust Spring Batch application for automated data processing, ETL operations, and job scheduling.

## 🚀 Features

- **Batch Job Processing** - Efficient handling of large-scale data operations
- **ETL Operations** - Extract, Transform, and Load data from various sources
- **Job Scheduling** - Automated job execution with configurable schedules
- **Error Handling** - Comprehensive error handling and retry mechanisms
- **Monitoring** - Job execution monitoring and reporting
- **Scalable Architecture** - Support for parallel processing and partitioning

## 🛠️ Technologies Used

- **Java 17+**
- **Spring Boot 3.x**
- **Spring Batch 5.x**
- **Spring Data JPA**
- **MySQL/PostgreSQL** (Database)
- **Maven** (Build Tool)
- **Docker** (Containerization)

## 📋 Prerequisites

Before running this application, make sure you have:

- Java 17 or higher
- Maven 3.6+
- MySQL/PostgreSQL database
- Docker (optional)

## ⚡ Quick Start

### 1. Clone the Repository
```bash
git clone https://github.com/param7666/spring-batch-processor.git
cd spring-batch-processor
```

### 2. Configure Database
Update the database configuration in `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/dbname
spring.datasource.username=your_username
spring.datasource.password=your_password
```

### 3. Build and Run
```bash
# Build the project
mvn clean install

# Run the application
mvn spring-boot:run
```

### 4. Using Docker
```bash
# Build Docker image
docker build -t spring-batch-processor .

# Run with Docker Compose
docker-compose up
```

## 📊 Job Configuration

### Sample Job Configuration
```java
@Configuration
@EnableBatchProcessing
public class BatchJobConfiguration {
    
    @Bean
    public Job dataProcessingJob() {
        return jobBuilderFactory.get("dataProcessingJob")
            .start(step1())
            .next(step2())
            .build();
    }
}
```

### Running Jobs
```bash
# Run specific job
java -jar target/spring-batch-processor.jar --job.name=dataProcessingJob

# Run with parameters
java -jar target/spring-batch-processor.jar --job.name=dataProcessingJob inputFile=data.csv
```

## 🏗️ Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/yourcompany/batch/
│   │       ├── config/          # Batch configuration
│   │       ├── jobs/            # Job definitions
│   │       ├── processors/      # Item processors
│   │       ├── readers/         # Item readers
│   │       ├── writers/         # Item writers
│   │       └── Application.java
│   └── resources/
│       ├── application.properties
│       └── schema.sq
└── test/
    └── java/                    # Unit and integration tests
```

## 📝 Available Jobs

### 1. Data Import Job
- **Purpose**: Import data from CSV/XML files
- **Parameters**: `inputFile`, `outputTable`
- **Schedule**: Daily at 2:00 AM

### 2. Data Transform Job
- **Purpose**: Transform and clean existing data
- **Parameters**: `sourceTable`, `targetTable`
- **Schedule**: Weekly on Sundays

### 3. Report Generation Job
- **Purpose**: Generate reports and export to files
- **Parameters**: `reportType`, `outputFormat`
- **Schedule**: Monthly on 1st day

## 🔧 Configuration

### Application Properties
```properties
# Batch Configuration
spring.batch.jdbc.initialize-schema=always
spring.batch.job.enabled=false

# Database Configuration
spring.datasource.url=jdbc:mysql://localhost:3306/batch_db
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

# Logging
logging.level.org.springframework.batch=DEBUG
```

### Job Parameters
| Parameter | Description | Example |
|-----------|-------------|---------|
| `inputFile` | Source file path | `/data/input.csv` |
| `outputDir` | Output directory | `/data/output/` |
| `batchSize` | Chunk size | `1000` |
| `skipLimit` | Error skip limit | `10` |

## 🧪 Testing

```bash
# Run all tests
mvn test

# Run integration tests
mvn test -P integration-tests

# Generate test coverage report
mvn jacoco:report
```

## 📈 Monitoring

### Job Execution Dashboard
Access the monitoring dashboard at: `http://localhost:8080/batch/dashboard`

### Metrics
- Job execution status
- Processing speed (records/second)
- Error rates
- Resource utilization

## 🐛 Troubleshooting

### Common Issues

**Issue**: Job fails with database connection error
**Solution**: Check database connectivity and credentials in `application.properties`

**Issue**: Out of memory errors during processing
**Solution**: Adjust JVM heap size: `-Xmx2g -Xms1g`

**Issue**: Jobs running slower than expected
**Solution**: Consider increasing chunk size or enabling parallel processing

## 📚 API Documentation

### REST Endpoints
- `GET /jobs` - List all available jobs
- `POST /jobs/{jobName}/start` - Start a job
- `GET /jobs/{jobId}/status` - Get job execution status
- `POST /jobs/{jobId}/stop` - Stop a running job

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

### Development Guidelines
- Follow Spring Boot coding conventions
- Write unit tests for new features
- Update documentation for API changes
- Use meaningful commit messages


## 👥 Authors

- **Parmeswar ** - *Initial work* - (https://github.com/param7666)

## 🙏 Acknowledgments

- Spring Batch Team for the excellent framework
- Spring Boot community for comprehensive documentation
- Contributors who helped improve this project

## 📞 Support

For support and questions:
- Create an [Issue](https://github.com/param7666/spring-batch-processor/issues)
- Email: your.email@example.com
- Documentation: [Wiki](https://github.com/param7666/spring-batch-processor/wiki)

---

⭐ **Star this repository if you find it helpful!**
