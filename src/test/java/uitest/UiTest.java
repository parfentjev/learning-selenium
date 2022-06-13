package uitest;

import misc.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;

import static support.scenarios.Scenarios.userScenarios;
import static support.util.TestingUtils.systemProperties;
import static support.util.TestingUtils.webDriverSupport;

public abstract class UiTest {
    private WebDriver driver;

    @BeforeEach
    public void beforeEach() {
        setUpBrowser();
        logInIfNeeded();
    }

    @AfterEach
    public void afterEach() {
        driver.quit();
    }

    protected WebDriver driver() {
        return driver;
    }

    private void setUpBrowser() {
        System.out.println("Base url = " + systemProperties().getBaseUrl());

        driver = webDriverSupport().getDriver();
        driver.manage().window().maximize();
    }

    private void logInIfNeeded() {
        User annotation = getClass().getAnnotation(User.class);

        if (annotation == null) {
            return;
        }

        userScenarios().logIn(annotation.value());
    }
}
