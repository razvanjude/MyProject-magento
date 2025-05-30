package pages;

import helperMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import pageLocators.RegisterLocators;

import java.util.UUID;

public class RegisterPage {

    private WebDriver driver;
    private ElementHelper elementHelper;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void goToCreateAccount() {
        elementHelper.clickLocator(RegisterLocators.createAccountElement);
    }

    public void addFirstName(String firstNameValue) {
        elementHelper.fillLocator(RegisterLocators.firstNameElement, firstNameValue);
        LoggerUtility.infoLog("Insert firstname");
    }

    public void addLastName(String lastNameValue) {
        elementHelper.fillLocator(RegisterLocators.lastNameElement, lastNameValue);
        LoggerUtility.infoLog("Insert lastname");
    }

    public void addUserEmail() {
        String randomEmail = "user_" + UUID.randomUUID().toString().substring(0, 8) + "@example.com";
        elementHelper.fillLocator(RegisterLocators.emailElement, randomEmail);
        LoggerUtility.infoLog("Insert email address");
    }

    public void addPassword(String passwordValue) {
        elementHelper.fillLocator(RegisterLocators.passwordElement, passwordValue);
        LoggerUtility.infoLog("Insert password");
    }

    public void addConfirmationPassword(String confirmationPasswordValue) {
        elementHelper.fillLocator(RegisterLocators.passwordConfirmationElement, confirmationPasswordValue);
        LoggerUtility.infoLog("Insert confirmation password");
    }

    public void createAccount() {
        elementHelper.clickLocator(RegisterLocators.submitButton);
        LoggerUtility.infoLog("Press submit button");
    }

    public void thankYouMessage(String expectedMessage) {
        elementHelper.validateElementText(RegisterLocators.thankYouElement,expectedMessage);
    }
}


























