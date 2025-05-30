# StudentManagmentCrud
This is a simple Spring Boot web app to manage students.  
You can add, edit, view, and delete student information.  

It shows how to do basic CRUD (Create, Read, Update, Delete) with Spring Boot and Thymeleaf.


## What I Learned from This Project

- How to set up a Spring Boot application.  
- Creating database entities with JPA.  
- Basic CRUD operations (Create, Read, Update, Delete) using Spring Data JPA.  
- Building service and controller layers for handling business logic and web requests.  
- Using Thymeleaf for web pages and forms.  
- Connecting Spring Boot with PostgreSQL database.  
- Handling form submissions and page redirects.  
- Fixing common issues like duplicate data on update.  
- Writing simple HTML for displaying data.  




## Features

- Add new students with roll number, name, mobile number, and blood group.
- Edit existing student details.
- Delete student records.
- View a list of all students.
- REST endpoints to get all students or a specific student by roll number.


## Technologies Used

- Java 17 (or your JDK version)
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Thymeleaf
- Maven/Gradle (as build tool)


## How to Run

1. Make sure PostgreSQL is installed and running.
2. Create a database named `hibernate` (or update `application.properties` accordingly).
3. Update database credentials in `application.properties`.
4. Run the application via your IDE or command line:
