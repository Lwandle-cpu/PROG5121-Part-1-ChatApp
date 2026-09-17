/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

package chatapppart1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.iie.chatapppart01.Login;

/**
 * 
 * @author 
 */

public class LoginTest {

    Login login = new Login();

    @Test
    public void testValidUserName() {
        assertTrue(login.checkUserName("lwa_1"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(login.checkUserName("lwa!!!!!!!!"));
    }

    @Test
    public void testValidPassword() {
        assertTrue(login.checkPasswordComplexity("Ch&&sec@ke99"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(login.checkPasswordComplexity("password"));
    }

    @Test
    public void testValidPhoneNumber() {
        assertTrue(login.checkCellPhoneNumber("+27838968976"));
    }

    @Test
    public void testInvalidPhoneNumber() {
        assertFalse(login.checkCellPhoneNumber("08966553"));
    }

    @Test
    public void testValidRegisterUser() {
        String result = login.registerUser("lwa_1", "Ch&&sec@ke99", "+27834160778");
        assertEquals("User registered successfully", result);
    }

    @Test
    public void testInvalidRegisterUser() {
        String result = login.registerUser("Lwa!!!!!!!!", "password", "0834160778");
        assertNotEquals("User registered successfully", result);
    }

    @Test
    public void testValidLoginUser() {
        login.registerUser("lwa_1", "Ch&&sec@ke99", "+27834160778");
        assertTrue(login.loginUser("lwa_1", "Ch&&sec@ke99"));
    }

    @Test
    public void testInvalidLoginUser() {
        assertFalse(login.loginUser("lwa_1!!!!!!", "password"));
    }
}

