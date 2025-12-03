# Product Management System (Spring Boot)

A simple and efficient **Inventory / Product Management System** built using **Spring Boot**, **Spring Data JPA**, and **MySQL**. This project provides RESTful APIs to manage products, including add, update, delete, and search functionality.

---

## 🚀 Features

* Add new products
* Update existing products
* Delete products
* Fetch all products
* Fetch product by ID
* Uses MySQL database
* Layered architecture (Controller → Service → Repository)

---

## 🛠 Tech Stack

**Backend:** Spring Boot, Spring Web, Spring Data JPA

**Database:** MySQL

**Build Tool:** Maven

**Language:** Java

---

## 📁 Project Structure

```
src/
 ├── main/
 │    ├── java/com/becoder/Product_Management_Backend/
 │    │      ├── controller/
 │    │      │      ProductController.java
 │    │      ├── service/
 │    │      │      ProductService.java
 │    │      │      ProductServiceImpl.java
 │    │      ├── repository/
 │    │      │      ProductRepository.java
 │    │      ├── model/
 │    │      │      Product.java
 │    │      └── ProductManagementBackendApplication.java
 │    └── resources/
 │           ├── application.properties
 │           └── static/templates (if any)
 └── test/
```

---

## ⚙️ Configuration

Update `application.properties` with your MySQL credentials:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/productdb
spring.datasource.username=root
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
server.port=8080
```

---

## ▶️ Run the Project

### **Using Maven**

```bash
mvn spring-boot:run
```

### **OR build jar**

```bash
mvn clean package
java -jar target/Product-Management-System.jar
```

---

## 🧪 API Endpoints

### Base URL: `http://localhost:8080/api/products`

### **1️⃣ Get all products**

`GET /api/products/`

### **2️⃣ Get product by ID**

`GET /api/products/{id}`

### **3️⃣ Add product**

`POST /api/products/`

```json
{
  "name": "Laptop",
  "description": "Dell Inspiron i5",
  "price": 55000,
  "quantity": 10
}
```

### **4️⃣ Update product**

`PUT /api/products/{id}`

### **5️⃣ Delete product**

`DELETE /api/products/{id}`

---

## 🏗 Database Table

### **products**

| Field       | Type        |
| ----------- | ----------- |
| id          | bigint (PK) |
| name        | varchar     |
| description | varchar     |
| price       | double      |
| quantity    | int         |

---

## 📌 Future Enhancements

* Add authentication (JWT)
* Add categories
* Add stock alerts
* Add dashboard UI using React
* Add pagination and filtering

---

## 👩‍💻 Author

**Sakshi Acharekar**

🔗 LinkedIn: [https://linkedin.com/in/sakshi-acharekar-56707b265](https://linkedin.com/in/sakshi-acharekar-56707b265)

📧 Email: [sakshiacharekar202@gmail.com](mailto:sakshiacharekar202@gmail.com)

---


Just tell me!
