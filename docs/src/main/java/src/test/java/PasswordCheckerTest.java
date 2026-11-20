
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordCheckerTest {

    @Test
    void testEmptyPassword() {
        assertEquals(0, PasswordChecker.calculateScore(""));
    }

    @Test
    void testNullPassword() {
        assertEquals(0, PasswordChecker.calculateScore(null));
    }

    @Test
    void testShortPassword() {
        assertEquals(3, PasswordChecker.calculateScore("Ab1"));
    }

    @Test
    void testLongLowercasePassword() {
        assertEquals(2, PasswordChecker.calculateScore("abcdefgh"));
    }

    @Test
    void testUppercasePassword() {
        assertEquals(3, PasswordChecker.calculateScore("ABCDEFGH"));
    }

    @Test
    void testPasswordWithDigits() {
        assertEquals(3, PasswordChecker.calculateScore("abcdefgh1"));
    }

    @Test
    void testStrongPassword() {
        assertEquals(5, PasswordChecker.calculateScore("Hello123!"));
    }

    @Test
    void testWeakStrength() {
        assertEquals("Weak password", PasswordChecker.getStrength(2));
    }

    @Test
    void testMediumStrength() {
        assertEquals("Medium password", PasswordChecker.getStrength(3));
    }

    @Test
    void testStrongStrength() {
        assertEquals("Strong password", PasswordChecker.getStrength(5));
    }
}
