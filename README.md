# E-commerce Backend Project
A simple backend for an E-commerce application built using **Spring Boot**, **JPA (Hibernate)**, and **MVC architecture**. This project handles **users, products, and cart management**.

**Tech Stack:** Java, Spring Boot, JPA/Hibernate, MySQL

**Features:**
- User registration and authentication
- Product management (CRUD)
- Cart management with `@ManyToMany` relationships
- MVC architecture with Repository-Service-Controller layers

**Run Locally:**
1. Clone the repo
2. Set up MySQL database
3. Update `application.properties`
4. Run `mvn spring-boot:run`

---

## Features

- **User Management**
  - Register a new user
  - View all users
  - Get user by ID
  - Update user
  - Delete user

- **Product Management**
  - Add a product
  - View all products
  - Get product by ID
  - Update product
  - Delete product

- **Cart Management**
  - Add product to user's cart
  - Remove product from user's cart
  - View user's cart
  - Clear user's cart

---

## Technologies Used

- Java 17
- Spring Boot
- Spring Data JPA (Hibernate)
- MySQL / H2 database (can configure)
- Maven
- Lombok

---

## API Endpoints

### Users

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/api/v1/users` | Get all users |
| GET    | `/api/v1/users/{id}` | Get user by ID |
| POST   | `/api/v1/users/register` | Register a new user |
| PUT    | `/api/v1/users/{id}` | Update user |
| DELETE | `/api/v1/users/{id}` | Delete user |

---

### Products

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET    | `/api/v1/products` | Get all products |
| GET    | `/api/v1/products/{id}` | Get product by ID |
| POST   | `/api/v1/products` | Add a new product |
| PUT    | `/api/v1/products/{id}` | Update product |
| DELETE | `/api/v1/products/{id}` | Delete product |

---

### Cart

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST   | `/api/v1/cart/{userId}/add/{productId}` | Add product to user's cart |
| DELETE | `/api/v1/cart/{userId}/remove/{productId}` | Remove product from user's cart |
| GET    | `/api/v1/cart/{userId}` | View user's cart |
| DELETE | `/api/v1/cart/{userId}/clear` | Clear user's cart |

---

## Setup Instructions

1. **Clone the repository**

```bash
git clone https://github.com/yashvanthh/E-commerce-backend-project.git
cd E-commerce-backend-project

src/main/java/com/ecom/Ecommerce/Project/
│
├── controllers   # REST API Controllers
├── entities      # JPA Entities (User, Product, Order)
├── repositories  # JPA Repositories
├── services      # Business Logic
└── EcommerceApplication.java  # Spring Boot main class


