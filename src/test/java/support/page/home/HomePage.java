package support.page.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import support.page.basic.WebPage;
import support.page.home.shoutbox.ShoutboxPageBlock;

public class HomePage extends WebPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public ShoutboxPageBlock shoutboxPageBlock() {
        return new ShoutboxPageBlock(driver(), driver().findElement(By.xpath("//div[@data-xf-init='siropu-shoutbox']")));
    }
}
