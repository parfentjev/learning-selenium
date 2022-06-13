package support.scenarios;

import support.dataobject.UserCredential;
import support.page.OpenPage;
import support.page.user.LogInPage;

public class UserScenarios {
    public void logIn(UserCredential userCredentials) {
        LogInPage logInPage = OpenPage.loginPage();
        logInPage.getUsernameInput().sendKeys(userCredentials.getUsername());
        logInPage.getPasswordInput().sendKeys(userCredentials.getPassword());
        logInPage.submit();
    }
}
