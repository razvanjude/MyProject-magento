package Pages;

import helperMethods.ElementHelper;
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
    }

    public void goToUserOption() {
        elementHelper.clickLocator(AccountLocators.userOption);
    }

    public void landOnMyAccountPage() {
        String expectedMessage = "My Account";
        elementHelper.validateElementText(AccountLocators.myAccountElement,expectedMessage);
    }

    public void goToAddressBook() {
        elementHelper.clickLocator(AccountLocators.addresBookButton);
    }

    public void addNewAddress() {
        elementHelper.clickLocator(AccountLocators.addNewAddressButton);
    }

    public void insertFirstName() {
        String firstNameValue = "Razvanos";
        elementHelper.clearAndFillLocator(AccountLocators.firstNameElement, firstNameValue);
    }

    public void insertLastName() {
        String lastNameValue = "Judos";
        elementHelper.clearAndFillLocator(AccountLocators.lastNameElement, lastNameValue);
    }

    public void insertPhoneNumber() {
        String phoneNumberValue = "0740123321";
        elementHelper.clearAndFillLocator(AccountLocators.phoneNumberElement, phoneNumberValue);
    }

    public void insertStreetAddress() {
        String streetAddressValue = "str. Ion Mester";
        elementHelper.clearAndFillLocator(AccountLocators.streetAddressElement, streetAddressValue);
    }

    public void insertCity() {
        String cityValue = "CLuj";
        elementHelper.clearAndFillLocator(AccountLocators.cityElement, cityValue);
    }

    public void insertState() {
        String stateValue = "Guam";
        elementHelper.fillPressLocator(AccountLocators.stateElement,stateValue, Keys.ENTER);
    }

    public void insertZipCode() {
        String postalCodeValue = "200400";
        elementHelper.clearAndFillLocator(AccountLocators.postalCodeElement, postalCodeValue);
    }

    public void saveAddress() {
        elementHelper.clickLocator(AccountLocators.saveAddressButton);
    }

    public void validateElementText() {
        String expectMessage = "You saved the address.";
        elementHelper.validateElementText(AccountLocators.saveAddressConfirmationElement,expectMessage);
    }

}





























