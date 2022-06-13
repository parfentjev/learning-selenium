package support.page;

import org.openqa.selenium.WebDriver;
import support.dataobject.PageAddress;
import support.page.home.HomePage;
import support.page.user.LogInPage;

import static support.util.TestingUtils.urlFormatter;
import static support.util.TestingUtils.webDriverSupport;

public class OpenPage {
    private static WebDriver driver() {
        return webDriverSupport().getDriver();
    }

    public static HomePage homePage() {
        driver().get(urlFormatter().getFullUrl(PageAddress.HOME));

        return new HomePage(driver());
    }

    public static LogInPage loginPage() {
        driver().get(urlFormatter().getFullUrl(PageAddress.LOGIN));

        return new LogInPage(driver());
    }
}
