package pageLocators;

import org.openqa.selenium.By;

public class RegisterLocators {

    public static final By createAccountElement = By.xpath("//a[contains(text(),'Create an Account')]");
    public static final By firstNameElement = By.xpath("//input[@name='firstname']");
    public static final By lastNameElement = By.xpath("//input[@name='lastname']");
    public static final By emailElement = By.xpath("//input[@name='email']");
    public static final By passwordElement = By.xpath("//input[@id='password']");
    public static final By passwordConfirmationElement = By.xpath("//input[@id='password-confirmation']");
    public static final By submitButton = By.xpath("//button[@title='Create an Account']");
    public static final By thankYouElement = By.xpath("//div[@class='message-success success message']");
}
