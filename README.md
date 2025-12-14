# REST API for an E-Commerce Application

Cartify is a **Spring Boot–based REST API** for an e-commerce application.  
It supports **customer and seller workflows**, including authentication, product management, cart operations, and order placement, with validation enforced at each step.

This backend was developed as an **end-to-end backend project** to demonstrate real-world API design, persistence, validation, and session handling.

---

## 🧩 Tech Stack

- Java
- Spring Boot
- Spring Framework
- Spring Data JPA
- Hibernate
- MySQL
- Swagger (OpenAPI)
 
---


## E-R Diagram for the application

![E-R Diagram](./ER%20Diagram/E-Commerce%20API%20ER%20Diagram.jpeg?raw=true)


## 🧱 Architecture Overview

The application follows a **layered architecture**:

- Controllers handle HTTP requests and responses
- Services contain business logic
- Repositories interact with the database using JPA
- MySQL is used for persistent storage

---

## 📦 Modules

- Authentication (Login / Logout)
- Customer Module
- Seller Module
- Product Module
- Cart Module
- Order Module

---

## ✨ Key Features

### 🔐 Authentication & Session Management
- Customer and Seller authentication
- Session-based token system
- Tokens stored in database with **1-hour validity**

### 🧑‍💼 Seller Features
- Register and login as a seller
- Add, update, and delete products
- View seller-specific products
- Access order and customer-related information

### 🧑‍💻 Customer Features
- Customer registration and login
- View products
- Add products to cart
- Place orders using cart items
- View order history and cart details

---

## 📘 API Documentation (Swagger)

Swagger (OpenAPI) is integrated for **interactive API documentation and testing**.

Once the application is running, Swagger UI can be accessed at:

`http://localhost:8009/swagger-ui.html`


Swagger provides:
- A complete list of all available REST APIs
- Request and response schemas
- Interactive testing using **Try it out**
- Auto-generated documentation based on controller definitions

---

## ⚙️ Installation & Running the Application

### 1️⃣ Database Setup

Ensure MySQL is running and create the database:

```sql
CREATE DATABASE cartify;
```

```
server.port=8009

spring.datasource.url=jdbc:mysql://localhost:3306/cartify
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

```

## API Root Endpoint

`https://localhost:8009/`

`http://localhost:8009/swagger-ui/index.html#/`


## API Module Endpoints

### Login & Logout Module

* `POST /register/customer` : Register a new customer
* `POST /login/customer` : Logging in customer with valid mobile number & password
* `POST /logout/customer` : Logging out customer based on session token
* `POST /register/seller` : Register a new seller
* `POST /login/seller` : Logging in Seller
* `POST /logout/seller` : Logging out Seller based on session token


### Customer Module

* `GET /customer/current` : Getting currently logged in customer
* `GET /customer/orders` : Getting order history of logged in customer
* `GET /customers` : Getting All customers
* `PUT /customer` : Updates logged in customer
* `PUT /customer/update/password` : Updates customer password
* `PUT /customer/update/card` : Updates credit card details
* `PUT /customer/update/address?type=home` : Updates customer's home address
* `PUT /customer/update/credentials` : Updates email address and mobile number
* `DELETE /customer` : Deletes logged in user with valid session token
* `DELETE /customer/delete/address?type=home` : Deletes customer's home address


### Seller Module

* `GET /seller/{sellerid}` : Gets seller with passed seller Id
* `GET /seller/current` : Gets seller details for currently logged in seller
* `GET /sellers` : Gets all sellers
* `POST /addseller` : Adding new seller
* `PUT /seller` : Updates seller details
* `PUT /seller/update/password` : Updates seller password
* `PUT /seller/update/mobile` : Updates seller mobile number
* `DELETE /seller/{sellerid}` : Deletes seller with passed id


### Product Module

* `GET /product/{id}` : Gets product with given product id
* `GET /products` : Gets all products
* `GET /products/{category}` : Gets product with given category
* `GET /products/seller/{id}` : Gets product of given seller id
* `POST /products` : Adds a new product to database
* `PUT /products` : Updates the product with given product id
* `PUT /products/{id}` : Updates product quantity
* `DELETE /product/{id}` : Deletes product with given id


### Cart Module

* `GET /cart` : Get all items in Customer Cart
* `POST /cart/add` : Add item to Cart
* `DELETE /cart` : Remove item from Cart
* `DELETE /cart/clear` : Clear entire cart


### Order Module

* `GET /orders/{id}` : Gets order details with given order id
* `GET /orders` : Gets all orders
* `GET /orders/by/date` : Gets orders placed on given date (DD-MM-YYYY)
* `POST /order/place` : Places a new order based on cart items
* `PUT /orders/{id}` : Updates a pending order
* `DELETE /orders/{id}` : Cancels an order


### Sample API Response for Customer Login

`POST   localhost:8009/login/customer`

* Request Body

```
    {
        "mobileId": "9999999999",
        "password": "shyam123456"
    }
```

* Response

```
    {
        "sessionId": 23,
        "token": "customer_0ad57094",
        "userId": 19,
        "userType": "customer",
        "sessionStartTime": "2022-06-10T10:48:20.0109626",
        "sessionEndTime": "2022-06-10T11:48:20.0109626"
    }
```
