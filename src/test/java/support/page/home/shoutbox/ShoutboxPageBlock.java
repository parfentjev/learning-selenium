package support.page.home.shoutbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.element.TextInputWebElement;
import support.element.WebElementList;
import support.page.basic.WebPageBlock;

import static support.util.TestingUtils.awaitUtils;

public class ShoutboxPageBlock extends WebPageBlock {
    public ShoutboxPageBlock(WebDriver driver, WebElement webElement) {
        super(driver, webElement);
    }

    public WebElementList<ShoutboxMessagePageBlock> getMessageList() {
        return new WebElementList<>(this, By.tagName("li"), ShoutboxMessagePageBlock.class);
    }

    public TextInputWebElement getMessageInput() {
        return new TextInputWebElement(driver().findElement(By.name("shout")));
    }

    public void submitAndAwaitCompleted() {
        TextInputWebElement messageInput = getMessageInput();

        messageInput.submit();
        awaitUtils().awaitConditionPass(messageInput::isEnabled);
    }
}
