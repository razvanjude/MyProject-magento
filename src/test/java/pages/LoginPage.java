package pages;

import helperMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.LoginLocators;
import pageLocators.RegisterLocators;

public class LoginPage {

    private WebDriver driver;
    private ElementHelper elementHelper;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void goToSignInPage() {
        elementHelper.clickLocator(LoginLocators.signInElement);
    }

    public void fillEmailAddress(String emailValue) {
        elementHelper.fillLocator(LoginLocators.emailElement,emailValue);
    }

    public void fillPassword(String passwordValue) {
        elementHelper.fillLocator(LoginLocators.passwordElement,passwordValue);
    }

    public void loginToApp() {
        goToSignInPage();
        fillEmailAddress("gigi.Constatin4@example.com");
        fillPassword("Pa$$w0rd.");
        signInButton();
    }


    public void signInButton() {
        elementHelper.clickLocator(LoginLocators.signInButton);
    }

    public void homePageText(String expectedMessage) {
        elementHelper.validateElementText(LoginLocators.homePageText,expectedMessage);
    }
}

