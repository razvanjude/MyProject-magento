package tests;

import Pages.AssertionPage;
import Pages.LoginPage;
import Pages.LogoutPage;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class Login extends SharedData {

    @Test(priority = 0)
    public void metodaLogin() {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginToApp();

        AssertionPage assertionPage = new AssertionPage(getDriver());
        assertionPage.checkThankYouMessage();

        LogoutPage logoutPage = new LogoutPage(getDriver());
        logoutPage.logoutFromApp();
    }
}
