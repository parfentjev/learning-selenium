package support.util.web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSupport {
    private static WebDriverSupport instance;
    private final WebDriver driver;

    private WebDriverSupport() {
        this.driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public static WebDriverSupport getInstance() {
        if (instance == null) {
            instance = new WebDriverSupport();
        }

        return instance;
    }
}
