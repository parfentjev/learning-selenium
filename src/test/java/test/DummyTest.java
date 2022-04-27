package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class DummyTest extends UiTest {
    @Test
    public void run() {
        driver().get("http://automationpractice.com/index.php");

        driver().findElement(By.xpath("//a[@class='login']")).click();
        driver().findElement(By.xpath("//h3[\"Create an account\"]"));
    }
}
