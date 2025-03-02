package tests;

import helperMethods.ElementHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class Login extends SharedData {

    @Test
    public void metodaTest() {

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

    }

}
