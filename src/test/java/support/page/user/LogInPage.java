package support.page.user;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.page.basic.WebPage;

public class LogInPage extends WebPage {
    public LogInPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getUsernameInput() {
        return driver().findElement(By.name("login"));
    }

    public WebElement getPasswordInput() {
        return driver().findElement(By.name("password"));
    }

    public void submit() {
        getUsernameInput().submit();
    }
}
