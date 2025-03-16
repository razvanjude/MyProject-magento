package tests;

import Pages.AssertionPage;
import Pages.LoginPage;
import helperMethods.ElementHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class Login extends SharedData {

    @Test(priority = 0)
    public void metodaLogin() {

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginToApp();

        AssertionPage assertionPage = new AssertionPage(getDriver());
        assertionPage.checkThankYouMessage();
    }

    @Test(priority = 1)
    public void metodalogout() {

        ElementHelper elementHelper = new ElementHelper(getDriver());

        By userOption = By.xpath("(//button[@type='button'])[1]");
        elementHelper.clickLocator(userOption);

        By signOutButton = By.xpath("(//a[normalize-space()='Sign Out'])[1]");
        elementHelper.clickLocator(signOutButton);

    }

}
