/* 
Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license 
Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template 
*/ 
package com.mycompany.chatapppart1; 

import org.junit.jupiter.api.Test; 
import static org.junit.jupiter.api.Assertions.*; 

/** 
The LoginTest class contains JUnit tests for checking 
the functionality of the Login class. 
 
Each test verifies that the methods return the 
expected output. 
@author Student 
*/ 
public class LoginTest { 

    /** 
    Tests the checkUserName() method from the Login class. 
    
    A valid username is used that contains an underscore 
    and has no more than five characters. 
    
    assertTrue() confirms that the method returns true. 
    */ 
    @Test 
    public void testValidUserName() { 

        //Create a Login object using valid user details.
        Login login = new Login( 
            "Kyle", 
            "Mazibuko", 
            "kyl_1", 
            "Ch&&sec@ke99!", 
            "+27838968976"); 

        //Verify that the username passes the validation.
        assertTrue(login.checkUserName()); 
    } 

    /** 
    Tests the checkPasswordComplexity() method from the Login class. 
    
    The test uses a password that includes an uppercase letter, 
    a number, and a special character as required. 
    */ 
    @Test 
    public void testValidPasswordComplexity() { 

        //Create a Login object with a password that meets the requirements.
        Login login = new Login( 
            "Kyle", 
            "Mazibuko", 
            "kyl_1", 
            "Ch&&sec@ke99!", 
            "+27838968976"); 

        //Confirm that the password passes the complexity check.
        assertTrue(login.checkPasswordComplexity()); 
    } 

    /** 
    Tests the checkCellPhoneNumber() method from the Login class. 
    
    The cellphone number begins with +27 and contains 
    the required number of digits. 
    */ 
    @Test 
    public void testValidCellPhoneNumber() { 

        //Create a Login object containing a correctly formatted cellphone number.
        Login login = new Login( 
            "Kyle", 
            "Mazibuko", 
            "kyl_1", 
            "Ch&&sec@ke99!", 
            "+27838968976"); 

        //Verify that the cellphone number passes validation.
        assertTrue(login.checkCellPhoneNumber()); 
    } 

    /** 
    Tests the registerUser() method from the Login class. 
    
    The test verifies that the expected success messages 
    are returned when all registration details are valid. 
    */ 
    @Test 
    public void testRegisterUser() { 

        //Create a Login object using valid registration information.
        Login login = new Login( 
            "Kyle", 
            "Mazibuko", 
            "kyl_1", 
            "Ch&&sec@ke99!", 
            "+27838968976"); 

        //Save the registration message returned by the method.
        String result = login.registerUser(); 

        /* 
        Check whether the expected registration messages 
        match the result produced by the method. 
        */ 
        assertEquals(""" 
        Username successfully captured. 
        Password successfully captured. 
        Cell phone number successfully added. 
        """, 
        result); 
    } 

    /** 
    Tests the loginUser() method from the Login class. 
    
    The correct username and password are entered to 
    confirm that the login method returns true. 
    */ 
    @Test 
    public void testLoginUser() { 

        //Create a Login object with the registered login details.
        Login login = new Login( 
            "Kyle", 
            "Mazibuko", 
            "kyl_1", 
            "Ch&&sec@ke99!", 
            "+27838968976"); 

        //Set the username provided during the login attempt.
        login.setEnteredUsername("kyl_1"); 

        //Set the password provided during the login attempt.
        login.setEnteredPassword("Ch&&sec@ke99!"); 

        //Confirm that the login credentials are accepted.
        assertTrue(login.loginUser()); 
    } 

    /** 
    Tests the returnLoginStatus() method from the Login class. 
    
    The test verifies that the correct welcome message 
    is displayed after a successful login. 
    */ 
    @Test 
    public void testReturnLoginStatus() { 

        //Create a Login object with valid registration details.
        Login login = new Login( 
            "Kyle", 
            "Mazibuko", 
            "kyl_1", 
            "Ch&&sec@ke99!", 
            "+27838968976"); 

        //Provide the registered username for the login attempt.
        login.setEnteredUsername ("kyl_1"); 

        //Provide the registered password for the login attempt.
        login.setEnteredPassword ("Ch&&sec@ke99!"); 

        /* 
        Verify that the correct welcome message is returned 
        when both login details are valid. 
        */ 
        assertEquals( 
            "Welcome Kyle Mazibuko, it is great to see you again.", login.returnLoginStatus()); 
    } 

    /** 
    Tests the checkUserName() method using an invalid username. 
    
    The username does not contain an underscore and 
    therefore should fail the validation. 
    */ 
    @Test 
    public void testInvalidUserName(){ 

        //Create a Login object containing an invalid username.
        Login login = new Login( 
            "Kyle", 
            "Mazibuko", 
            "kyle!!!!!!!", 
            "Ch&&sec@ke99!", 
            "+27838968976" 
        ); 

        //Confirm that the username validation fails.
        assertFalse(login.checkUserName()); 
    } 

    /** 
    Tests the checkPasswordComplexity() method using an invalid password. 
    
    The password does not satisfy the required uppercase, 
    number, and special-character conditions. 
    */ 
    @Test 
    public void testInvalidPasswordComplexity(){ 

        //Create a Login object containing an invalid password.
        Login login = new Login( 
            "Kyle", 
            "Mazibuko", 
            "kyl_1", 
            "password", 
            "+27838968976" 
        ); 

        //Confirm that the password validation fails.
        assertFalse(login.checkPasswordComplexity()); 
    } 

    /** 
    Tests the checkCellPhoneNumber() method using an invalid number. 
    
    The cellphone number does not begin with +27, 
    which is the required South African international code. 
    */ 
    @Test 
    public void testInvalidPhoneNumber(){ 

        //Create a Login object containing an incorrectly formatted number.
        Login login = new Login( 
            "Kyle", 
            "Mazibuko", 
            "kyl_1", 
            "Ch&&sec@ke99!", 
            "08966553" 
        ); 

        //Confirm that the cellphone number validation fails.
        assertFalse(login.checkCellPhoneNumber()); 
    } 
}
