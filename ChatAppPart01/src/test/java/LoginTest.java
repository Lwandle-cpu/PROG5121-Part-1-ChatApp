

package za.ac.iie.chatapppart01;

import org.junit.Test;
import static org.junit.Assert.*;

public class LoginTest {

    @Test
    public void testUsernameValid() {

        // Arrange
        Login login = new Login();
        String username = "kyl_123";

        // Act
        boolean actual = login.checkUserName(username);

        // Assert
        assertTrue(actual);
    }

    @Test
    public void testUsernameInvalid() {

        // Arrange
        Login login = new Login();
        String username = "kyle!!!!";

        // Act
        boolean actual = login.checkUserName(username);

        // Assert
        assertFalse(actual);
    }
}

