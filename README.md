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

## 1. Project Overview

ChatApp is a Java-based messaging application developed as part of the PROG5121 programming project. The application allows users to register an account, log in, and send, store, or disregard messages

The project object-oriented programming, input validation, methods, loops, conditional statements, and file handling in Java.

## 2. Project Objectives

The main objectives of ChatApp are to:

- Register users using their personal and login details.
- Validate usernames, passwords, and cellphone numbers.
- Allow registered users to log in.
- Create messages with unique message IDs.
- Validate recipient cellphone numbers and message length.
- Generate a message hash for identification.
- Allow users to send, disregard, or store messages.
- Count successfully sent messages.
- Save stored messages in a JSON file.

## 3. Technologies Used

- **Programming language:** Java
- **IDE:** NetBeans
- **Project management:** Apache Maven
- **Testing framework:** JUnit 5
- **File storage:** JSON

## 4. Main Classes

### Main.java

The `Main` class starts the application and controls the program flow. It allows users to register, log in, select menu options, enter messages, and choose how their messages should be processed.

### Login.java

The `Login` class manages user registration and login. It validates the user's username, password, and cellphone number and checks whether the login details match the registered information.

### Message.java

The `Message` class manages message creation and processing. It generates message IDs and message hashes, validates recipient numbers and message lengths, processes message actions, counts successfully sent messages, and stores messages in a JSON file.

### MessageTest.java

The `MessageTest` class is used to test the message functionality. Unit tests can verify message ID validation, recipient cellphone number validation, message length validation, message hashes, message processing, and the total number of sent messages.

## 5. Application Features

### User Registration and Login

Users enter their first name, last name, username, password, and cellphone number. The application checks the required details before allowing the user to log in.

### Message Processing

After logging in, the user specifies the number of messages they wish to process. Each message receives a unique ten-digit ID and a generated hash.

Messages must pass the required validation checks before they can be processed.

### Message Menu

The application provides the following main menu options:

1. **Send Messages** – Create and process messages.
2. **Show recently sent messages** – This feature is planned for future implementation.
3. **Quit** – Exit the application.

When creating a message, the user can select one of these actions:

1. Send Message
2. Disregard Message
3. Store Message

Successfully sent messages are counted, and stored messages are written to `storedMessages.json`.

## 6. Message Validation

The application applies the following validation rules:

- **Message ID:** Must contain exactly ten digits.
- **Recipient cellphone number:** Must use an international format, beginning with a plus sign and a valid country calling code.
- **Message length:** Must not exceed 250 characters.
- **Username and password:** Must satisfy the registration requirements implemented in the `Login` class.

Invalid messages are rejected with an appropriate error message.

## 7. How to Run the Application

1. Open NetBeans.
2. Open the `ChatAppPart01` project.
3. Confirm that the Java source files use the correct package name: `com.mycompany.chatapppart1`.
4. Check that `Main.java`, `Login.java`, and `Message.java` are located in the appropriate source package

## Version

**1.0-SNAPSHOT**

