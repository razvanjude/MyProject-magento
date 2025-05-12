package tests;

import pages.AssertionPage;
import pages.LoginPage;
import pages.LogoutPage;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class LoginTest extends SharedData {

    @Test(priority = 0)
    public void metodaLogin() {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginToApp();

        AssertionPage assertionPage = new AssertionPage(getDriver());
        assertionPage.checkThankYouMessage("Home Page");

        LogoutPage logoutPage = new LogoutPage(getDriver());
        logoutPage.logoutFromApp();
    }
}
