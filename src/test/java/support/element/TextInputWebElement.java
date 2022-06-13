package support.element;

import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextInputWebElement extends ExtendedWebElement<TextInputWebElement> {
    public TextInputWebElement(WebElement webElement) {
        super(webElement);
    }

    public TextInputWebElement requireText(String expectedText) {
        assertEquals(expectedText, getText());

        return this;
    }
}
