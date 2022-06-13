package support.page.basic;

import org.openqa.selenium.WebDriver;

public class WebPage {
    private final WebDriver driver;

    public WebPage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver driver() {
        return driver;
    }
}
