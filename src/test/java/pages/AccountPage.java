package pages;

import helperMethods.ElementHelper;
import loggerUtility.LoggerUtility;
import org.openqa.selenium.Keys;
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
        LoggerUtility.infoLog("Access My Account");
    }

    public void goToUserOption() {
        elementHelper.clickLocator(AccountLocators.userOption);
        LoggerUtility.infoLog("Go to User option");
    }

    public void landOnMyAccountPage(String expectedMessage) {
        elementHelper.validateElementText(AccountLocators.myAccountElement,expectedMessage);
    }

    public void goToAddressBook() {
        elementHelper.clickLocator(AccountLocators.addresBookButton);
        LoggerUtility.infoLog("Go to AddressBook");
    }

    public void addNewAddress() {
        elementHelper.clickLocator(AccountLocators.addNewAddressButton);
        LoggerUtility.infoLog("Click new address button");
    }

    public void insertFirstName(String firstNameValue) {
        elementHelper.clearAndFillLocator(AccountLocators.firstNameElement, firstNameValue);
        LoggerUtility.infoLog("Insert firstname");
    }

    public void insertLastName(String lastNameValue) {
        elementHelper.clearAndFillLocator(AccountLocators.lastNameElement, lastNameValue);
        LoggerUtility.infoLog("Insert lastname");
    }

    public void insertPhoneNumber(String phoneNumberValue) {
        elementHelper.clearAndFillLocator(AccountLocators.phoneNumberElement, phoneNumberValue);
        LoggerUtility.infoLog("Insert phone number");
    }

    public void insertStreetAddress(String streetAddressValue) {
        elementHelper.clearAndFillLocator(AccountLocators.streetAddressElement, streetAddressValue);
        LoggerUtility.infoLog("Insert street address");
    }

    public void insertCity(String cityValue) {
        elementHelper.clearAndFillLocator(AccountLocators.cityElement, cityValue);
        LoggerUtility.infoLog("Insert city name");
    }

    public void insertState(String stateValue) {
        elementHelper.fillPressLocator(AccountLocators.stateElement,stateValue, Keys.ENTER);
        LoggerUtility.infoLog("Insert state name");
    }

    public void chooseCountry(String countryValue) {
        elementHelper.fillPressLocator(AccountLocators.country, countryValue, Keys.ENTER);
        LoggerUtility.infoLog("Insert country name");
    }

    public void insertZipCode(String postalCodeValue) {
        elementHelper.clearAndFillLocator(AccountLocators.postalCodeElement, postalCodeValue);
        LoggerUtility.infoLog("Insert postal code");
    }

    public void saveAddress() {
        elementHelper.clickLocator(AccountLocators.saveAddressButton);
        LoggerUtility.infoLog("Press save button");
    }

    public void validateElementText(String expectMessage) {
        elementHelper.validateElementText(AccountLocators.saveAddressConfirmationElement,expectMessage);
    }

}





























