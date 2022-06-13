package support.util.await;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.Callable;

import static support.util.TestingUtils.webDriverSupport;

public class AwaitUtils {
    public void awaitElementVisible(By locator) {
        new WebDriverWait(webDriverSupport().getDriver(), Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void awaitConditionPass(Callable<Boolean> condition) {
        int attempts = 50;

        do {
            if (call(condition)) {
                return;
            }

            sleep();
            attempts--;
        } while (attempts > 0);

        throw new RuntimeException("Await timeout.");
    }

    private boolean call(Callable<Boolean> condition) {
        try {
            return condition.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void sleep() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
