package support.element;

import org.openqa.selenium.WebElement;

public class HyperlinkWebElement extends ExtendedWebElement<HyperlinkWebElement> {
    private final String destination;

    public HyperlinkWebElement(WebElement webElement) {
        super(webElement);

        this.destination = webElement.getAttribute("href");
    }

    public String getDestination() {
        return destination;
    }
}
