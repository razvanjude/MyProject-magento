package Pages;

import helperMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.AccountLocators;

public class AccountPage {

    private WebDriver driver;
    private ElementHelper elementHelper;

    public AccountPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void goToMyAccount() {
        elementHelper.clickLocator(AccountLocators.myAccountButton);
    }
}
