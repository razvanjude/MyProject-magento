package tests;

import helperMethods.ElementHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class Login extends SharedData {

    @Test(priority = 0)
    public void metodaLogin() {

    ElementHelper elementHelper = new ElementHelper(getDriver());

    By signInElement = By.xpath("//a[contains(text(),'Sign In')]");
    elementHelper.clickLocator(signInElement);

    By emailElement = By.xpath("//input[@id='email']");
    String emailValue = "gigi.Constatin4@example.com";
    elementHelper.fillLocator(emailElement,emailValue);

    By passwordElement = By.xpath("(//input[@id='pass'])[1]");
    String passwordValue = "Pa$$w0rd.";
    elementHelper.fillLocator(passwordElement,passwordValue);

    By signInButton = By.xpath("//button[@class='action login primary']");
    elementHelper.clickJsLocator(signInButton);

        By thankYouElement = By.xpath("(//span[@class='base'])[1]");
        String expectedMessage = "Home Page";
        elementHelper.validateElementText(thankYouElement,expectedMessage);

//        By userOption = By.xpath("(//button[@type='button'])[1]");
//        elementHelper.clickLocator(userOption);
//
//        By signOutButton = By.xpath("(//a[normalize-space()='Sign Out'])[1]");
//        elementHelper.clickLocator(signOutButton);

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
