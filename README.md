<p align="center">
  <img src="src/main/resources/static/stack.png" width="300" alt="Spring Boot logo">
</p>

# Spring Security

Simple Signin and Signup Spring boot Security

## Installation

Before launching the application, follow these steps to set up the database:

1. **Install MySQL:** If you haven't installed MySQL yet, you can download it [here](https://dev.mysql.com/downloads/installer/).

2. **Create a Database:** Open your MySQL client and create a new database named `springboot_security`.

3. **Configure Database Connection:** Update the `application.properties` file with your MySQL username and password.

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/springboot_security
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   ```