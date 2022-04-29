package util;

public class SystemProperties {
    public static final String BASE_URL;

    static {
        BASE_URL = System.getProperty("uitest.baseUrl", "http://localhost/");
    }
}
