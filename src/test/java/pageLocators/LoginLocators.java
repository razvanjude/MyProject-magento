package pageLocators;

import org.openqa.selenium.By;

public class LoginLocators {

    public static final By signInElement = By.xpath("//a[contains(text(),'Sign In')]");
    public static final By emailElement = By.xpath("//input[@id='email']");
    public static final By passwordElement = By.xpath("(//input[@id='pass'])[1]");
    public static final By signInButton = By.xpath("//button[@class='action login primary']");
   }
