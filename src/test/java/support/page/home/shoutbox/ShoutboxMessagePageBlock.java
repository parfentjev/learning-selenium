package support.page.home.shoutbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import support.element.ExtendedWebElement;

public class ShoutboxMessagePageBlock extends ExtendedWebElement<ShoutboxMessagePageBlock> {
    private final ExtendedWebElement<WebElement> username;
    private final ExtendedWebElement<WebElement> message;

    public ShoutboxMessagePageBlock(WebElement webElement) {
        super(webElement);

        this.username = findElement(By.className("username"));
        this.message = findElement(By.className("bbWrapper"));
    }

    public WebElement getMessage() {
        return message;
    }

    public ExtendedWebElement<WebElement> getUsername() {
        return username;
    }
}
