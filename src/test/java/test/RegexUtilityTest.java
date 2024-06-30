package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import regex.RegexUtility;

public class RegexUtilityTest {

    @Test
    public void shouldMatchPattern() {
        String text = "Hello, World!";
        String regex = "fxml";
        boolean isMatch = RegexUtility.matchPattern(text, regex);
        assertTrue(isMatch, "Pattern should match");
    }

    @Test
    public void shouldReplaceTextCorrectly() {
        String text = "Hello, World!";
        String regex = "World";
        String replacement = "Java";
        String replacedText = RegexUtility.replaceText(text, regex, replacement);
        assertEquals("Hello, Java!", replacedText, "Replaced text should be 'Hello, Java!'");
    }
}
