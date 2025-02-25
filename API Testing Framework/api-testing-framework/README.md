# API Testing Framework

## Overview
This project is a robust API Testing Framework developed to ensure the functionality, security, and reliability of RESTful APIs. It utilizes Postman for designing test cases, Newman CLI for automation, and RestAssured in Java for advanced testing scenarios.

## Technologies Used
- **Postman**: For designing and executing API tests.
- **Newman CLI**: Command-line tool for running Postman collections.
- **RestAssured (Java)**: For creating comprehensive API tests in Java.

## Key Contributions
- Automated API validation using Postman and Newman CLI.
- Designed and implemented test cases to verify the performance and security of web services.
- Utilized RestAssured in Java to create advanced testing scenarios and ensure comprehensive coverage.

## Project Structure
```
api-testing-framework
├── postman
│   ├── collections
│   │   └── api-tests.postman_collection.json
│   └── environments
│       └── dev.postman_environment.json
├── newman
│   └── run-tests.sh
├── restassured
│   ├── src
│   │   ├── main
│   │   │   └── java
│   │   │       └── com
│   │   │           └── example
│   │   │               └── tests
│   │   │                   └── ApiTest.java
│   │   └── test
│   │       └── java
│   │           └── com
│   │               └── example
│   │                   └── tests
│   │                       └── ApiTest.java
├── pom.xml
└── README.md
```

## Setup Instructions
1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Install the required dependencies using Maven:
   ```
   mvn install
   ```
4. Set up the Postman environment variables as needed in `postman/environments/dev.postman_environment.json`.

## Usage
- To run the Postman tests, execute the `run-tests.sh` script located in the `newman` directory:
  ```
  ./newman/run-tests.sh
  ```
- For RestAssured tests, navigate to the `restassured` directory and run the tests using Maven:
  ```
  mvn test
  ```

## License
This project is licensed under the MIT License. See the LICENSE file for more details.