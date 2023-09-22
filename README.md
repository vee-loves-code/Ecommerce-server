# Ecommerce-server

**PREREQUISITE**
- To run this App, Jdk 17 must have been installed along side maven for dependency management.
- Postman was also used for test the api over localhost server.
- Any Java compatible IDE like intellij or eclipse can be used to run app.

**CLONE REPOSITORY**
- To clone repository, cd into an appropriate directory and clone the repository in it.
  - command to clone repo using ssh: git clone git@github.com:vee-loves-code/Ecommerce-server.git
  - command to clone repo using http: git clone https://github.com/vee-loves-code/Ecommerce-server.git

**RUN**
Run the ServerApllication and ensure it compiles correctly.
Run maven clean.

**TEST**
- JUnit and Mockito was used to write unit tests for the contoller and service methods,
- Postman was used to test the APi.

Documentation

Credit Card Validation
This collection contains one request; validate Card Number.

﻿

POST
Validate card number
http://localhost:8080/card/validate-card-number
﻿

Body
raw (json)
json
{
    "cardNumber":"6011111111111117",
    "expiryDate":"12/25",
    "cvv":"123"
}

Response
{
"valid: true
}

**CONCLUSION**
The client of this project is hiosted on another repository; https://github.com/vee-loves-code/Ecommerce-Client.git
