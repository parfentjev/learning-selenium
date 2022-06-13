package support.util.web;

import support.dataobject.PageAddress;

import static support.util.TestingUtils.systemProperties;

public class UrlFormatter {
    public String getFullUrl(PageAddress pageAddress) {
        String baseUrl = systemProperties().getBaseUrl();

        if (!baseUrl.endsWith("/")) {
            baseUrl = baseUrl + "/";
        }

        return String.format("%s%s", baseUrl, pageAddress.getAddress());
    }
}
