package support.page.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebPageBlock {
    private final WebElement webElement;
    private final WebDriver driver;

    public WebPageBlock(WebDriver driver, WebElement webElement) {
        this.driver = driver;
        this.webElement = webElement;
    }

    protected WebDriver driver() {
        return driver;
    }

    public WebElement getWebElement() {
        return webElement;
    }
}
