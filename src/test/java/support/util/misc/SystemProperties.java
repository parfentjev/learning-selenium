package support.util.misc;

public class SystemProperties {
    private static SystemProperties instance;

    private final String baseUrl;

    private SystemProperties() {
        baseUrl = System.getProperty("uitest.baseUrl", "http://localhost/");

        String driverPath = System.getProperty("webdriver.chrome.driver", "target/test-classes/drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", driverPath);
    }

    public static SystemProperties getInstance() {
        if (instance == null) {
            instance = new SystemProperties();
        }

        return instance;
    }

    public String getBaseUrl() {
        return baseUrl;
    }
}
