package pages;

import helperMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.AssertionLocators;

public class AssertionPage {

    private WebDriver driver;
    private ElementHelper elementHelper;


    public AssertionPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void checkThankYouMessage(String expectedMessage) {
        elementHelper.validateElementText(AssertionLocators.thankYouElement,expectedMessage);
    }

}
