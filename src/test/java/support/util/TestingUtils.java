package support.util;

import support.util.await.AwaitUtils;
import support.util.await.Pause;
import support.util.misc.SystemProperties;
import support.util.web.UrlFormatter;
import support.util.web.WebDriverSupport;

public class TestingUtils {
    public static AwaitUtils awaitUtils() {
        return new AwaitUtils();
    }

    public static SystemProperties systemProperties() {
        return SystemProperties.getInstance();
    }

    public static UrlFormatter urlFormatter() {
        return new UrlFormatter();
    }

    public static WebDriverSupport webDriverSupport() {
        return WebDriverSupport.getInstance();
    }

    public static Pause pause() {
        return new Pause();
    }
}
