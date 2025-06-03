package helperMethods;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class ElementHelper {

    private WebDriver driver;

    public ElementHelper(WebDriver driver){
        this.driver = driver;
    }

    private void waitForVisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    private void waitForVisible(WebElement locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(locator));
    }

    public void clickLocator (By locator) {
        waitForVisible(locator);
        driver.findElement(locator).click();
    }

    public void clickJsLocator (By locator) {
        waitForVisible(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", driver.findElement(locator)); // face un click fortat
    }

    public void fillLocator(By locator, String value) {
        waitForVisible(locator);
        driver.findElement(locator).sendKeys(value);
    }

    public void fillPressLocator(By locator, String value, Keys key) {
        waitForVisible(locator);
        driver.findElement(locator).sendKeys(value);
        driver.findElement(locator).sendKeys(key);
    }


    public void clearAndFillLocator(By locator, String value) {
        waitForVisible(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(value);
    }

    public void validateElementText(By locator, String expectedMessage) {
        waitForVisible(locator);
        String actualMessage = driver.findElement(locator).getText();
        Assert.assertEquals(actualMessage,expectedMessage);
    }

}
