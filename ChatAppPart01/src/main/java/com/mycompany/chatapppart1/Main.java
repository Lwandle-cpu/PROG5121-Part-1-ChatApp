/* 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template 
*/ 
package com.mycompany.chatapppart1; 

import java.util.Scanner; 

/** 
The Main class starts and manages the ChatApp program. 
It receives information from the keyboard and handles 
the registration and login processes. 
 
@author Student 
*/ 
public class Main { 

    /* 
    This is where the program begins running. 
    */ 
    public static void main(String[] args) { 

        // Create a Scanner to read input entered by the user.
        Scanner input = new Scanner(System.in); 

        // Show the registration section.
        System.out.println("=====REGISTRATION====="); 

        // Request the user's first name.
        System.out.print("Enter your first name: "); 
        String firstName = input.nextLine(); 

        // Make sure the first name field is not left blank.
        while (firstName.trim().isEmpty()) { 
            System.out.println("First name cannot be empty."); 
            System.out.print("Enter your first name: "); 
            firstName = input.nextLine(); 
        } 

        // Request the user's last name.
        System.out.print("Enter your last name: "); 
        String lastName = input.nextLine(); 

        // Make sure the last name field contains a value.
        while (lastName.trim().isEmpty()) { 
            System.out.println("Last name cannot be empty."); 
            System.out.print("Enter your last name: "); 
            lastName = input.nextLine(); 
        } 

        // Request the username from the user.
        System.out.print("Enter your username: "); 
        String username = input.nextLine(); 

        // Prevent the user from leaving the username field empty.
        while (username.trim().isEmpty()) { 
            System.out.println("Username cannot be empty."); 
            System.out.print("Enter your username: "); 
            username = input.nextLine(); 
        } 

        /* 
        Create a Login object with the details entered so far. 
        The password and cellphone number are left empty until 
        the user provides those details. 
        */ 
        Login login = new Login( 
            firstName, 
            lastName, 
            username, 
            "", 
            "" 
        ); 

        // Validate the username before moving to the password.
        if (!login.checkUserName()) { 
            System.out.println( 
                "Username is not correctly formatted; please ensure that your username " 
                    +
                "contains an underscore and is no more than five characters in length." 
            ); 
            return; 
        } 

        // Ask the user to create a password.
        System.out.print("Enter your password: "); 
        String password = input.nextLine(); 

        // Ensure that the password field is not empty.
        while (password.trim().isEmpty()) { 
            System.out.println("Password cannot be empty."); 
            System.out.print("Enter your password: "); 
            password = input.nextLine(); 
        } 

        // Save the password in the Login object.
        login.setPassword(password); 

        // Validate the password before asking for the cellphone number.
        if (!login.checkPasswordComplexity()) { 
            System.out.println( 
                "Password is not correctly formatted; please ensure that the password " 
                    +
                "contains at least eight characters, a capital letter, a number, " 
                    +
                "and a special character." 
            ); 
            return; 
        } 

        // Ask the user to provide their cellphone number.
        System.out.print("Enter your cellphone number: "); 
        String phoneNumber = input.nextLine(); 

        // Ensure that the cellphone number field is not empty.
        while (phoneNumber.trim().isEmpty()) { 
            System.out.println("Cellphone number cannot be empty."); 
            System.out.print("Enter your cellphone number: "); 
            phoneNumber = input.nextLine(); 
        } 

        // Save the cellphone number in the Login object.
        login.setPhoneNumber(phoneNumber); 

        // Validate the cellphone number before starting the login process.
        if (!login.checkCellPhoneNumber()) { 
            System.out.println( 
                "Cellphone number is not correctly formatted; please ensure that the " 
                    +
                "cellphone number starts with +27 and is followed by 9 numbers." 
            ); 
            return; 
        } 

        /* 
        All the required registration checks have passed. 
        Display the successful registration message. 
        */ 
        System.out.println(); 
        System.out.println(login.registerUser()); 

        // Display the login section.
        System.out.println(); 
        System.out.println("=====LOGIN====="); 

        // Ask the user to enter their registered username.
        System.out.print("Enter your username: "); 
        String enteredUsername = input.nextLine(); 

        // Make sure the login username is not left blank.
        while (enteredUsername.trim().isEmpty()) { 
            System.out.println("Username cannot be empty."); 
            System.out.print("Enter your username: "); 
            enteredUsername = input.nextLine(); 
        } 

        // Compare the entered username with the registered username.
        if (!enteredUsername.equals(login.getUsername())) { 
            System.out.println("Username or password incorrect, please try again."); 
            return; 
        } 

        // Ask the user to enter their registered password.
        System.out.print("Enter your password: "); 
        String enteredPassword = input.nextLine(); 

        // Make sure the login password is not left blank.
        while (enteredPassword.trim().isEmpty()) { 
            System.out.println("Password cannot be empty."); 
            System.out.print("Enter your password: "); 
            enteredPassword = input.nextLine(); 
        } 

        // Save the login details entered by the user.
        login.setEnteredUsername(enteredUsername); 
        login.setEnteredPassword(enteredPassword); 

        // Verify the login details and display the result.
        System.out.println(login.returnLoginStatus()); 
    } 
}