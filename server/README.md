# E-Commerce Credit Card Validation

###### This project is a simple e-commerce web application that implements credit card validation. The system consists of both a Frontend and a Backend, allowing users to enter credit card information and perform basic sanity checks on the provided data.

---

### Table of Contents

- Features
- Prerequisites
- Getting Started
- Usage
- Backend Implementation
- Frontend Implementation

#### Features
Credit card data validation including expiry date, CVV, PAN (card number) length, and Luhn's algorithm.
Frontend user interface for entering credit card information.
A simple API for credit card validation on the backend.
Visual feedback to users indicating the success or failure of credit card validation.


#### Prerequisites
Before you begin, ensure you have met the following requirements:

Java: The project is implemented in Java, so you need Java installed on your system.

Spring Boot: This project uses Spring Boot to create the web application.


#### Getting Started
To get started with this project, follow these steps:

Clone this repository to your local machine:

##### step 1 - clone project with Terminal from [here](github url)
````
git clone https://github.com/your-username/e-commerce-credit-card-validation.git
````

##### step 2 - Navigate to the project directory
````
cd credit-card
````

##### step 3: Build and run the project
````
./mvnw spring-boot:run
````

Access the application in your web browser at [link](http://localhost:8080)


#### Usage
Open the web application in your browser.
Fill out the credit card information in the provided form, including card number, expiry date, and CVV.
Click the "Validate" button.
The system will perform validation checks and display a message indicating success or failure.


#### Backend Implementation
The backend is built using Spring Boot.
Credit card validation logic is implemented in the CreditCardService class.
The service checks the expiry date, CVV length, PAN length, and applies Luhn's algorithm for card number validation.


#### Frontend Implementation
The frontend uses Thymeleaf for rendering.
Users can enter credit card information in an HTML form.
The form sends a POST request to the /api/credit-card/validate endpoint for validation.
Validation results are displayed to the user.