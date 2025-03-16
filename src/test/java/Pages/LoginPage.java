package Pages;

import helperMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
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
    }

    public void fillEmailAddress() {
        String emailValue = "gigi.Constatin4@example.com";
        elementHelper.fillLocator(LoginLocators.emailElement,emailValue);
    }

    public void fillPassword() {
        String passwordValue = "Pa$$w0rd.";
        elementHelper.fillLocator(LoginLocators.passwordElement,passwordValue);
    }

    public void loginToApp() {
        goToSignInPage();
        fillEmailAddress();
        fillPassword();
        signInButton();
    }

    public void signInButton() {

        elementHelper.clickLocator(LoginLocators.signInButton);
    }
}
