Student details
Student Name :Lwandle
Student number: ST10534937
Module name : Programming 1A

# ChatAppPart01

## Project Description

ChatAppPart01 is about java terminal developed as part of the PROG5121 programming project. The application shows user registration and login functionality using Java and Maven.

The system allows a user to register by putting  their first name, last name, username, password, and South African cellphone number. They must insure that the details that they put above is validated so that the user can continue to the login section.

They is JUnit tests to check that the different methods in the `Login` class work correctly.

## Features

The application provides the following features:

* User registration
* First name and last name validation
* Username validation
* Password complexity validation
* South African cellphone number validation
* Registration success messages
* User login
* Username and password verification
* Welcome message after a successful login
* Error message for incorrect login details
* Automated JUnit testing

## Username Requirements

The username must:

* Contain an underscore (`_`)
* Be no longer than five characters(>=5)
* e.g. ky1_1

If you enter a invalid username (kyle123)
thhe system will not allow you to continue , it will display a message"incorrect username please try again 

## Password Requirements

The password must:

* Contain at least 8 characters
* Contain an uppercase letter
* Contain a number
* Contain a special character
* e.g. Ch&&sec@ke99!

* if you enter a incorrect password the system won't allow you to continue it will fail


## Cellphone Number Requirements

The cellphone number must:

* Start with `+27`
* Contain 12 characters in total
* Contain 9 digits and only numbers after `+27`
* e.g.+27838968976

## Technologies Used

* Java
* Maven
* JUnit 5
* Apache NetBeans
* Git and GitHub

## Project Structure

```text
ChatAppPart01
│
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── mycompany
│   │               └── chatapppart1
│   │                   ├── Login.java
│   │                   └── Main.java
│   │
│   └── test
│       └── java
│           └── com
│               └── mycompany
│                   └── chatapppart1
│                       └── LoginTest.java
│
├── pom.xml
└── README.md
```

## Main Classes

### Main.java

The `Main` class start and manage the chatAppprogram. It:

1. Shows the registration section.
2. Collects the user's registration details.
3. Confirmed the username.
4. Comfirmed the password.
5. Confirmed the cellphone number.
6. illustrares the registration result.
7. Displays the login section.
8. Accepts the user's login details.
9. Verify the login credentials.
10. Shows the appropriate login status.

### Login.java

The `Login` class store the user's details for registration and the login feature.

It includes methods for:

* Create the password
* Write your cellphone number
* Getting the username
* Testing the username
* Testing password complexity
* Checking the cellphone number
* Registering the user
* Checking login records
* Returning the login status

### LoginTest.java

The `LoginTest` class contains JUnit tests for the methods in the `Login` class.

We have JUnit tests for checking the functionality, including:

* Valid username
* Invalid username
* Valid password
* Invalid password
* Valid cellphone number
* Invalid cellphone number
* User registration
* Successful login
* Login status message

## Running the Application

### Using Apache NetBeans

1. Open Apache NetBeans.
2. Open the `ChatAppPart01` project.
3. Insure that the project designs successfully.
4. Right-click the project.
5. Select **Run**.
6. Follow the instructions displayed in the console.

## Running the Tests

The project uses JUnit 5 for automated testing.

In NetBeans:

1. Right-click the project.
2. Select **Test**.
3. NetBeans will run the JUnit tests.
4. Check the Test Results window for the results.

All tests should pass before submitting the project.

### Maven Test Command

You can also run the tests using Maven:

```bash
mvn test
```

A successful test run should show:

```text
Tests run: 9, Failures: 0, Errors: 0, Skipped: 0
```

## Testing

JUnit tests were created to ensure that the validation and login methods produce the expected results.

The project includes tests for both successful and unsuccessful scenarios. This helps confirm that the application handles valid and invalid user information correctly.

## Author

**Student**

## Project

**PROG5121 - ChatApp Part 1**


# ChatApp Part 2

# ChatApp – PROG5121 Programming Project

## 1. Project Overview

ChatApp is a Java messaging application developed for the PROG5121 programming project. It allows users to register an account, log in, and send, disregard, or store messages.

The project demonstrates how Java can be used to develop a simple messaging system. It also makes use of object-oriented programming, input validation, loops, conditional statements, methods, and file handling.

## 2. Project Objectives

The purpose of this project is to develop a messaging application that can:

- Register users using their personal details and login information.
- Check whether usernames, passwords, and cellphone numbers meet the required rules.
- Allow registered users to log in.
- Create messages with unique message IDs.
- Check recipient cellphone numbers and message lengths.
- Generate a hash for each message.
- Allow users to send, disregard, or store messages.
- Keep track of the number of successfully sent messages.
- Save stored messages in a JSON file.

## 3. Technologies Used

The following tools and technologies were used to develop the application:

- **Programming language:** Java
- **IDE:** NetBeans
- **Build tool:** Apache Maven
- **Testing framework:** JUnit 5
- **File storage:** JSON

## 4. Main Classes

### Main.java

The `Main` class is the starting point of the application. It guides the user through registration and login and displays the available menu options. It also allows the user to choose how messages should be handled.

### Login.java

The `Login` class handles user registration and login. It checks the username, password, and cellphone number to make sure they meet the required conditions. It also checks whether the login details entered by the user match the registered details.

### Message.java

The `Message` class is responsible for creating and managing messages. It generates message IDs and message hashes, checks message details, and allows users to send, disregard, or store messages. It also keeps count of successfully sent messages and saves stored messages to a JSON file.

### MessageTest.java

The `MessageTest` class is used to test the methods in the `Message` class. These tests help check whether message IDs, cellphone numbers, message lengths, hashes, and message actions work as expected. They can also be used to check the count of sent messages.

## 5. Application Features

### User Registration and Login

When using the application, users must enter their first name, last name, username, password, and cellphone number. The application checks the information before allowing the user to proceed with the login process.

### Message Processing

After logging in successfully, the user can choose how many messages they want to process. Each message is assigned a unique ten-digit ID and a generated hash.

The application checks the message details before allowing the message to be processed. This helps prevent invalid information from being accepted.

### Main Menu

The application displays a menu with the following options:

1. **Send Messages** – Allows the user to create and process messages.
2. **Show Recently Sent Messages** – This feature is planned for a future version.
3. **Quit** – Closes the application.

When creating a message, the user can choose one of the following actions:

1. **Send Message** – Processes the message as a sent message.
2. **Disregard Message** – Discards the message.
3. **Store Message** – Saves the message for later use.

The application counts successfully sent messages, while stored messages are saved in a file named `storedMessages.json`.

## 6. Message Validation

The application uses validation rules to check the information entered by the user.

- **Message ID:** Must contain exactly ten digits.
- **Recipient cellphone number:** Must follow the required international format, starting with a plus sign and a valid country calling code.
- **Message length:** Must not be longer than 250 characters.
- **Username and password:** Must meet the registration requirements defined in the `Login` class.

If a message does not meet the required conditions, the application rejects it and displays an appropriate error message.

## 7. How to Run the Application

To run the project in NetBeans, follow these steps:

1. Open NetBeans on your computer.
2. Open the `ChatAppPart01` project.
3. Check that the Java source files use the package name `com.mycompany.chatapppart1`.
4. Make sure that `Main.java`, `Login.java`, and `Message.java` are inside the correct source package.
5. Check that the Maven dependencies are configured correctly, including JUnit 5 for testing.
6. Run the project using `Main.java` and follow the instructions displayed in the console.

## Version

**1.0-SNAPSHOT**
