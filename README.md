# 🚀 RestAssured Cucumber BDD Framework

A comprehensive **Rest API Automation Project** leveraging **RestAssured**, **Cucumber BDD**, and **TestNG** to create clear, behavior-driven test scenarios. This project includes detailed **Allure Reports** for insightful test execution results, making API testing efficient, maintainable, and easy to understand.

---
## 🛠️ Technologies & Tools Used

- 🧪 RestAssured — REST API testing library
- 🤝 Cucumber BDD — Behavior Driven Development
- 🧰 TestNG — Test framework
- 📊 Allure — Test reporting tool
- ⚙️ Maven — Build automation and dependency management


---

## 📋 Test Scenarios Covered

| Scenario Type          | Description                                            |
|-----------------------|--------------------------------------------------------|
| ✅ GET API Validation  | Validates the HTTP GET response code & data structure  |
| ✅ Response Array Size | Verifies the total number of items returned in response |

---
## Allure Report

<div align='center'>
   
<img width="1919" height="1027" alt="Image" src="https://github.com/user-attachments/assets/f70d1f2e-b37e-41b8-a452-d317be6db595" />

</div>



---

## 📄 Feature File
The feature file contains behavior-driven scenarios written in Gherkin syntax that describe the API test cases in a human-readable format. It defines the expected behavior of the API endpoints through Given–When–Then steps.

---

## 🔧 Step Definitions
Step definitions provide the Java implementation of the steps defined in the feature file. Using RestAssured for API calls and TestNG assertions, they execute the requests and validate responses to ensure the API behaves as expected.
 
---

## ⚙️ Setup & Running Tests

1. **Clone the repository**
   ```bash
   git clone https://github.com/AuTeLipi/RestAssuredCucumberBDDFramework.git
   cd RestAssuredCucumberBDDFramework


2. **Run tests using Maven**
   ```bash
   mvn clean test
   
3. **Generate and serve Allure report**
   ```bash
   allure serve allure-results


