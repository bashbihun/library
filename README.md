# Library Management API

Simple REST API to manage books and authors using Spring Boot and MySQL.

## Features
- CRUD Book
- CRUD Author
- Relational DB (Many-to-One)

## Tech Stack
- Java 17
- Spring Boot
- Spring Data JPA
- MySQL

## How to Run
1. Create `belajar_jdbc_library` database
2. Configure `application.properties`
3. Run application
4. Use Postman to test API

## Example JSON
if success response
```json
{
  "title": "Atomic Habits",
  "isbn": "978-1234567890",
  "publishedYear": 2018,
  "authorId": 1
}
```
if not foun
```json
{
  "error": "Book not found with id: 99"
}
