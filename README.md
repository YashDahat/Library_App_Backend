# Book Rental Application - Back End

Welcome to the back end repository of the Book Rental Application! This repository contains the codebase for the server-side of the application, which is built using Spring Boot, Hibernate, and MySQL Database.

## Features

- **Book Management:** Admins can efficiently manage the book inventory and rental records, ensuring the availability and tracking of books.
- **User Authentication:** Integration with Okta IDP and OAuth/OIDC provides secure user authentication, contributing to a significant reduction in security breaches.
- **Payment Integration:** Integration with Stripe's payment gateway ensures secure and reliable payment processing for book rentals.

## Technologies Used

- **Spring Boot:** The application's backend is developed using the Spring Boot framework, offering simplified configuration and rapid development.
- **Hibernate:** Hibernate is used for object-relational mapping (ORM), enabling efficient database interactions.
- **MySQL Database:** The MySQL database is used to store book information, user data, and rental records.

## Getting Started

Follow these steps to set up and run the backend of the Book Rental Application:

1. Clone this repository to your local machine:

   ```
   git clone https://github.com/YashDahat/Library_App_Backend.git
   ```

2. Navigate to the project directory:

   ```
   cd 02-backend\spring-boot-library\spring-boot-library
   ```

3. Configure the database connection settings in the `application.properties` file, providing the appropriate MySQL database URL, username, and password.

4. Build and run the application using Gradle or Maven:

   For Gradle:
   ```
   ./gradlew bootRun
   ```

   For Maven:
   ```
   mvn spring-boot:run
   ```

5. The backend will start running on the configured port (usually `8443`).

## API Documentation

You can access the API documentation by navigating to `https://localhost:8443/api` after starting the backend. This documentation provides detailed information about the available endpoints, request parameters, and response structures.

## Database Schema

The MySQL database schema is defined by the entities in the application. You can find the schema details in the codebase's entity classes.

## Contributing

We welcome contributions from the community! If you find any issues, bugs, or have improvements to suggest, please feel free to submit issues or pull requests to this repository.

## Acknowledgments

We extend our gratitude to the open-source community for their valuable contributions and support.

## Contact

If you have any questions, need assistance, or want to discuss anything related to the backend of the Book Rental Application, please reach out to our development team at backend-support@bookrentalapp.com.

---

Thank you for your interest in the backend of our Book Rental Application. We hope you find it reliable and effective in managing the application's core functionalities.
