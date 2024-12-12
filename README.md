# Event Ticketing System

## Overview

The Event Ticketing System is a Spring Boot application designed to manage event ticket sales. It utilizes a Producer-Consumer pattern for handling ticket orders and event information. The system allows users to view and purchase tickets for various events in real-time.

## Features

- **Event Management**: Admins can create, update, and delete events.
- **Ticket Purchasing**: Users can browse events and purchase tickets.
- **Producer-Consumer Pattern**: Used to manage the order flow in real-time, ensuring efficient ticket processing.
- **User Authentication**: Secure login and registration for users and admins.
- **Database Integration**: Uses Spring Data JPA for seamless database interaction.

## Prerequisites

Before you begin, ensure you have the following software installed:

- [Java 17+](https://openjdk.java.net/)
- [Maven](https://maven.apache.org/install.html)
- [Spring Boot 3.x](https://spring.io/projects/spring-boot)

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/yourusername/event-ticketing-system.git
cd event-ticketing-system
```

### Configure the Project

Update the `application.properties` file under `src/main/resources` to configure your database connection and any other necessary properties.

```properties
# Example database configuration
spring.datasource.url=jdbc:mysql://localhost:3306/ticketing_db
spring.datasource.username=root
spring.datasource.password=password
```

### Build the Project

You can build the project using Maven. Run the following command to compile and package the application:

```bash
./mvnw clean install
```

### Run the Application

To start the application, run the following command:

```bash
./mvnw spring-boot:run
```

The application should now be running on `http://localhost:8080`.

## Usage

Once the application is running, you can interact with it through the web interface or RESTful APIs.

- **Create an Event**: Admins can create events by navigating to the 'Admin Panel' section.
- **Purchase Tickets**: Users can browse events and purchase tickets directly from the events page.

### Example API Request

To get a list of events, use the following endpoint:

```http
GET http://localhost:8080/api/events
```

To purchase tickets for an event:

```http
POST http://localhost:8080/api/events/{eventId}/purchase
```

### Producer-Consumer Flow

The application follows the Producer-Consumer pattern where ticket orders are processed asynchronously to ensure efficient handling of user requests.

## Development

To contribute to this project:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Create a new Pull Request.

## Documentation

For more detailed information on the technologies used in this project, refer to the following official documentation:

- [Apache Maven Documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin](https://docs.spring.io/spring-boot/3.3.6/maven-plugin)
- [Spring Web Documentation](https://docs.spring.io/spring-boot/3.3.6/reference/web/servlet.html)
- [Spring Data JPA Documentation](https://docs.spring.io/spring-boot/3.3.6/reference/data/sql.html#data.sql.jpa-and-spring-data)

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Contact

For further questions or inquiries, you can contact the project maintainer:

- **Email**: [fdo.rashmina@gmail.com](mailto:fdo.rashmina@gmail.com)
- **LinkedIn**: [Rashmina Fernando](https://www.linkedin.com/in/rashminafernando)
