package tests;

import helperMethods.ElementHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class MyAccount extends SharedData {

    @Test
    public void testMethod() {

        ElementHelper elementHelper = new ElementHelper(getDriver());

        By userOption = By.xpath("(//button[@type='button'])[1]");
        elementHelper.clickLocator(userOption);

        By myAccountButton = By.xpath("//li[@class='customer-welcome active']//li[1]");
        elementHelper.clickLocator(myAccountButton);

        By myAccountElement = By.xpath("//span[@class='base']");
        String expectedMessage = "My Account";
        elementHelper.validateElementText(myAccountElement,expectedMessage);
    }
}
