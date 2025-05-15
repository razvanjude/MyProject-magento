package tests;

import pages.LoginPage;
import pages.LogoutPage;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class LoginAndLogoutTest extends SharedData {

    @Test(priority = 0)
    public void metodaLogin() {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginToApp();
        loginPage.homePageText("Home Page");

        LogoutPage logoutPage = new LogoutPage(getDriver());
        logoutPage.logoutFromApp();
    }
}
