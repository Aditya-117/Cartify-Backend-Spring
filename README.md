# Cartify – E-Commerce Backend

Cartify is a Spring Boot + MySQL backend for an e-commerce platform. It provides RESTful APIs for user management, product catalog, shopping cart, and order handling with session-based authentication and role-based access control. The project follows a layered architecture with controllers, services, and repositories.

## E-R Diagram for the application

![E-R Diagram](./ER%20Diagram/E-Commerce%20API%20ER%20Diagram.jpeg?raw=true)

## Installation & Run

1. Create MySQL database:

```sql
CREATE DATABASE cartify;
```

2. Build and run the project:

```bash
mvn clean install
mvn spring-boot:run
```

3. Swagger UI (API docs): [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html)

## API Endpoints

### Login & Logout Module

* POST `/register/customer` – Register a new customer
* POST `/login/customer` – Login customer with mobile number & password
* POST `/logout/customer` – Logout customer based on session token
* POST `/register/seller` – Register a new seller
* POST `/login/seller` – Login seller
* POST `/logout/seller` – Logout seller based on session token

### Customer Module

* GET `/customer/current` – Get currently logged in customer
* GET `/customer/orders` – Get order history of logged in customer
* GET `/customers` – Get all customers
* PUT `/customer` – Update logged in customer
* PUT `/customer/update/password` – Update customer password
* PUT `/customer/update/card` – Update credit card details
* PUT `/customer/update/address?type=home` – Update customer's home address
* PUT `/customer/update/credentials` – Update email address and mobile number
* DELETE `/customer` – Delete logged in user with valid session token
* DELETE `/customer/delete/address?type=home` – Delete customer's home address

### Seller Module

* GET `/seller/{sellerid}` – Get seller with passed seller Id
* GET `/seller/current` – Get seller details for currently logged in seller
* GET `/sellers` – Get all sellers
* POST `/addseller` – Add new seller
* PUT `/seller` – Update seller details
* PUT `/seller/update/password` – Update seller password
* PUT `/seller/update/mobile` – Update seller mobile number
* DELETE `/seller/{sellerid}` – Delete seller with passed id

### Product Module

* GET `/product/{id}` – Get product with given product id
* GET `/products` – Get all products
* GET `/products/{category}` – Get product by category
* GET `/products/seller/{id}` – Get product of given seller id
* POST `/products` – Add a new product to database
* PUT `/products` – Update product with given id
* PUT `/products/{id}` – Update product quantity
* DELETE `/product/{id}` – Delete product with given id

### Cart Module

* GET `/cart` – Get all items in customer cart
* POST `/cart/add` – Add item to cart
* DELETE `/cart` – Remove item from cart
* DELETE `/cart/clear` – Clear entire cart

### Order Module

* GET `/orders/{id}` – Get order details with given order id
* GET `/orders` – Get all orders
* GET `/orders/by/date` – Get orders placed on given date (DD-MM-YYYY)
* POST `/order/place` – Place new order based on cart items
* PUT `/orders/{id}` – Update a pending order
* DELETE `/orders/{id}` – Cancel an order

### Sample API Response for Customer Login

POST `/login/customer`

Request Body:

```json
{
    "mobileId": "9999999999",
    "password": "shyam123456"
}
```

Response:

```json
{
    "sessionId": 23,
    "token": "customer_0ad57094",
    "userId": 19,
    "userType": "customer",
    "sessionStartTime": "2022-06-10T10:48:20.0109626",
    "sessionEndTime": "2022-06-10T11:48:20.0109626"
}
```
