package Pages;

import helperMethods.ElementHelper;
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

    public void addFirstName() {
        String firstNameValue = "Razvanos";
        elementHelper.fillLocator(RegisterLocators.firstNameElement, firstNameValue);
    }

    public void addLastName() {
        String lastNameValue = "judos";
        elementHelper.fillLocator(RegisterLocators.lastNameElement, lastNameValue);
    }

//    public void addUserEmail() {
//        String emailValue = "gigi.Constatin9@example.com";
//        elementHelper.fillLocator(RegisterLocators.emailElement, emailValue);
//    }

    public void addUserEmail() {
        String randomEmail = "user_" + UUID.randomUUID().toString().substring(0, 8) + "@example.com";
        elementHelper.fillLocator(RegisterLocators.emailElement, randomEmail);
    }

    public void addPassword() {
        String passwordValue = "Pa$$w0rd.";
        elementHelper.fillLocator(RegisterLocators.passwordElement, passwordValue);
    }

    public void addConfirmationPassword() {
        String confirmationPasswordValue = "Pa$$w0rd.";
        elementHelper.fillLocator(RegisterLocators.passwordConfirmationElement, confirmationPasswordValue);
    }

    public void createAccount() {
        elementHelper.clickLocator(RegisterLocators.submitButton);
    }

    public void thankYouMessage() {
        String expectedMessage = "Thank you for registering with Main Website Store.";
        elementHelper.validateElementText(RegisterLocators.thankYouElement,expectedMessage);
    }
}


























