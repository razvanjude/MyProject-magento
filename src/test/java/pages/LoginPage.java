package pages;

import helperMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.log.Log;
import pageLocators.LoginLocators;

public class LoginPage {

    private WebDriver driver;
    private ElementHelper elementHelper;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void goToSignInPage() {
        elementHelper.clickLocator(LoginLocators.signInElement);
        LoggerUtility.infoLog("User goes to Sign in modal ");
    }

    public void fillEmailAddress(String emailValue) {
        elementHelper.fillLocator(LoginLocators.emailElement,emailValue);
        LoggerUtility.infoLog("User enter email address");
    }

    public void fillPassword(String passwordValue) {
        elementHelper.fillLocator(LoginLocators.passwordElement,passwordValue);
        LoggerUtility.infoLog("User enter the password");
    }

    public void loginToApp() {
        goToSignInPage();
        fillEmailAddress("razvan.jude@example.com");
        fillPassword("Pa$$w0rd.");
        signInButton();
    }


    public void signInButton() {
        elementHelper.clickLocator(LoginLocators.signInButton);
        LoggerUtility.infoLog("User click on SignIn button ");
    }

    public void homePageText(String expectedMessage) {
        elementHelper.validateElementText(LoginLocators.homePageText,expectedMessage);
    }
}

