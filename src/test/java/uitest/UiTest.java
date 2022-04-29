package uitest;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UiTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "target/test-classes/drivers/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void afterEach() {
        driver.close();
    }

    protected WebDriver driver() {
        return driver;
    }
}
