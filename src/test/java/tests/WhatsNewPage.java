package tests;

import helperMethods.ElementHelper;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class WhatsNewPage extends SharedData {

    @Test
    public void metodaTest() {

        ElementHelper elementHelper = new ElementHelper(getDriver());

        By whatsNewButton =  By.xpath("//a[@id='ui-id-3']");
        elementHelper.clickLocator(whatsNewButton);

        By whatsNewElement = By.xpath("//span[@class='base']");
        String expectedMessage = "What's New";
        elementHelper.validateElementText(whatsNewElement,expectedMessage);

    }
}
