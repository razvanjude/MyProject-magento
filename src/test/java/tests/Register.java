package tests;

import helperMethods.ElementHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class Register extends SharedData {

    @Test
    public void metodaTest() {

        ElementHelper elementHelper = new ElementHelper(getDriver());

        By createAccountElement = By.xpath("//a[contains(text(),'Create an Account')]");
        elementHelper.clickLocator(createAccountElement);

        By firstNameElement = By.xpath("//input[@name='firstname']");
        String firstNameValue = "gigi2";
        elementHelper.fillLocator(firstNameElement,firstNameValue);

        By lastNameElement = By.xpath("//input[@name='lastname']");
        String lastNameValue = "Constatin2";
        elementHelper.fillLocator(lastNameElement,lastNameValue);

        By emailElement = By.xpath("//input[@name='email']");
        String emailValue = "gigi.Constatin4@example.com";
        elementHelper.fillLocator(emailElement,emailValue);

        By passwordElement = By.xpath("//input[@id='password']");
        String passwordValue = "Pa$$w0rd.";
        elementHelper.fillLocator(passwordElement,passwordValue);

        By passwordConfirmationElement = By.xpath("//input[@id='password-confirmation']");
        String passwordConfirmationValue = "Pa$$w0rd.";
        elementHelper.fillLocator(passwordConfirmationElement,passwordConfirmationValue);

        By submitButton = By.xpath("//button[@title='Create an Account']");
        elementHelper.clickJsLocator(submitButton);

        By thankYouElement = By.xpath("//div[@class='message-success success message']");
        String expectedMessage = "Thank you for registering with Main Website Store.";
        elementHelper.validateElementText(thankYouElement,expectedMessage);
    }
}
