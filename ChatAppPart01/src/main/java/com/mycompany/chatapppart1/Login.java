/* 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
*/ 
package com.mycompany.chatapppart1; 

/** 
The Login class manages the registration and login features 
of the ChatApp program. 
@author Student 
*/ 
public class Login { 

//Store the user's registration details.
private String username; 
private String password; 
private String phoneNumber; 

//Store the username and password entered when logging in.
private String enteredUsername; 
private String enteredPassword; 

//Store the user's first name and surname.
private String firstName; 
private String lastName; 

/* 
Constructor that creates a Login object using the user's 
registration information and assigns the values to the variables. 
*/ 
public Login (String firstName, String lastName, String username, String password, String phoneNumber){ 
this.firstName = firstName; 
this.lastName = lastName; 
this.username = username; 
this.password = password; 
this.phoneNumber = phoneNumber; 
} 

/* 
Updates the password stored for the user. 
This is used when the user enters their password 
after the Login object has been created. 
*/ 
public void setPassword(String password){ 
this.password = password; 
} 

/* 
Updates the cellphone number stored for the user. 
This is used after the user provides their cellphone number. 
*/ 
public void setPhoneNumber(String phoneNumber){ 
this.phoneNumber = phoneNumber; 
} 

/* 
Provides access to the username registered by the user. 
This allows the username to be retrieved without accessing 
the private variable directly. 
*/ 
public String getUsername(){ 
return username; 
} 

/* 
Stores the username entered by the user during the login process. 
*/ 
public void setEnteredUsername(String enteredUsername){ 
this.enteredUsername = enteredUsername; 
} 

/* 
Stores the password entered by the user during the login process. 
*/ 
public void setEnteredPassword(String enteredPassword){ 
this.enteredPassword = enteredPassword; 
} 

/* 
Checks whether the username follows the required format. 
It must include an underscore and contain no more than 
five characters. 
*/ 
public boolean checkUserName(){ 

//Verify that the username has an underscore 
//and does not exceed five characters.
return username.contains("_") && username.length()<=5; 
} 

/* 
Checks whether the password satisfies all the required 
security conditions. 

The password must: 
-Have at least 8 characters 
-Include an uppercase letter 
-Include a number 
-Include a special character 
*/ 
public boolean checkPasswordComplexity(){ 

//Use Boolean values to record whether each 
//password requirement has been satisfied.
boolean hasUppercase = false; 
boolean hasNumber = false; 
boolean hasSpecialCharacter = false; 

//A password shorter than 8 characters is invalid.
if (password.length()< 8){ 
return false; 
} 

//Examine each character contained in the password.
for (int i = 0; i < password.length(); i++){ 

//Get the character currently being checked.
char character = password.charAt(i); 

//Determine whether the character is an uppercase letter.
if (Character.isUpperCase(character)){ 
hasUppercase = true; 
} 

//Determine whether the character is a numeric digit.
if (Character.isDigit(character)){ 
hasNumber = true; 
} 

//Determine whether the character is neither a letter nor a number.
//Such a character is treated as a special character.
if (!Character.isLetterOrDigit(character)){ 
hasSpecialCharacter = true; 
} 
} 

//The password passes when all required conditions are satisfied.
if (hasUppercase && hasNumber && hasSpecialCharacter){ 
return true; 
} else{ 
return false; 
} 
} 

/* 
Checks whether the cellphone number follows the required 
South African format. 

The number must: 
-Start with +27 
-Have 12 characters altogether 
-Contain digits after the +27 code 
*/ 
public boolean checkCellPhoneNumber(){ 

//Confirm that the cellphone number begins with +27 
//and contains exactly 12 characters.
if (phoneNumber.startsWith("+27") 
&& 
phoneNumber.length() == 12){ 

//Begin checking the characters that come after +27.
for (int i = 3; i< phoneNumber.length(); i++){ 

//Make sure every character after +27 is a number.
if (!Character.isDigit(phoneNumber.charAt(i))){ 
return false; 
} 
} 

//All cellphone number requirements have been satisfied.
return true; 
} else { 

//The cellphone number does not meet the required format.
return false; 
} 
} 

/* 
Registers the user by validating the username, password, 
and cellphone number. 

The method produces messages showing whether each 
registration requirement was successfully completed. 
*/ 
public String registerUser(){

    String message = "";

    if (checkUserName()){
        message += "Username successfully captured.\n";
    } else {
        message += "Username is not correctly formatted; please ensure that your username contains an underscore and is no more than five characters in length.\n";
    }

    if (checkPasswordComplexity()){
        message += "Password successfully captured.\n";
    } else {
        message += "Password is not correctly formatted; please ensure that the password contains at least eight characters, a capital letter, a number, and a special character.\n";
    }

    if (checkCellPhoneNumber()){
        message += "Cell phone number successfully added.\n";
    } else {
        message += "Cell phone number incorrectly formatted or does not contain international code.\n";
    }

    return message;
}

/* 
Checks whether the username and password entered during 
login are the same as the details saved during registration. 
*/ 
public boolean loginUser(){ 

//Compare the entered username and password with 
//the details stored during registration.
if (enteredUsername.equals(username) 
&& 
enteredPassword.equals(password)){ 

//Both login details are correct.
return true; 
} else { 

//The login details do not match the registered details.
return false; 
} 
} 

/* 
Provides a message based on whether the login attempt 
was successful or unsuccessful. 
*/ 
public String returnLoginStatus(){ 

//Use loginUser() to verify the entered credentials.
if (loginUser()) { 

//Display a welcome message when the login is successful.
return "Welcome " + firstName + " " + lastName + ", it is great to see you again."; 
} else { 

//Display an error message when the login details are incorrect.
return "Username or password incorrect, please try again."; 
} 
} 
}

