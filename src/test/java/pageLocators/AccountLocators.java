package pageLocators;

import org.openqa.selenium.By;

public class AccountLocators {

    public static final By userOption = By.xpath("(//button[@type='button'])[1]");
    public static final By myAccountButton = By.xpath("//li[@class='customer-welcome active']//li[1]");
    public static final By myAccountElement = By.xpath("//span[@class='base']");
    public static final By addresBookButton = By.xpath("(//a[normalize-space()='Address Book'])[1]");
    public static final By addNewAddressButton = By.xpath("//span[normalize-space()='Add New Address']");
    public static final By firstNameElement = By.xpath("//input[@id='firstname']");
    public static final By lastNameElement = By.xpath("//input[@id='lastname']");
    public static final By phoneNumberElement = By.xpath("//input[@id='telephone']");
    public static final By streetAddressElement = By.xpath("//input[@id='street_1']");
    public static final By cityElement = By.xpath("//input[@name='city']");
    public static final By stateElement = By.xpath("//select[@id='region_id']");
    public static final By postalCodeElement = By.xpath("//input[@id='zip']");
    public static final By saveAddressButton = By.xpath("//button[@title='Save Address']");
    public static final By saveAddressConfirmationElement = By.xpath("//div[contains(text(),'You saved the address.')]");

}
