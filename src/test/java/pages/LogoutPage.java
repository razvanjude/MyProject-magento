package pages;

import helperMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.LogoutLocators;

public class LogoutPage {

    private ElementHelper elementHelper;
    private WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void logoutFromApp() {
        elementHelper.clickLocator(LogoutLocators.userOption);
        elementHelper.clickLocator(LogoutLocators.signOutButton);
    }
}
