package tests;

import Pages.LoginPage;
import helperMethods.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class MyAccount extends SharedData {

//    @Test
//    public void testMethod() {
//
//        ElementHelper elementHelper = new ElementHelper(getDriver());
//
//        By userOption = By.xpath("(//button[@type='button'])[1]");
//        elementHelper.clickLocator(userOption);
//
//        By myAccountButton = By.xpath("//li[@class='customer-welcome active']//li[1]");
//        elementHelper.clickLocator(myAccountButton);
//
//        By myAccountElement = By.xpath("//span[@class='base']");
//        String expectedMessage = "My Account";
//        elementHelper.validateElementText(myAccountElement,expectedMessage);
//    }

    @Test
    public void AddInfoToAddressBook() {

        ElementHelper elementHelper = new ElementHelper(getDriver());

        //Face Login
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.goToSignInPage();
        loginPage.fillEmailAddress();
        loginPage.fillPassword();
        loginPage.signInButton();


        //Deschide My Account
        By userOption = By.xpath("(//button[@type='button'])[1]");
        elementHelper.clickLocator(userOption);

        By myAccountButton = By.xpath("//li[@class='customer-welcome active']//li[1]");
        elementHelper.clickLocator(myAccountButton);

        By myAccountElement = By.xpath("//span[@class='base']");
        String expectedMessage = "My Account";
        elementHelper.validateElementText(myAccountElement,expectedMessage);


        //Deschide AddressBook
        By addresBookButton = By.xpath("(//a[normalize-space()='Address Book'])[1]");
        elementHelper.clickLocator(addresBookButton);

        By addNewAddressButton = By.xpath("//span[normalize-space()='Add New Address']");
        elementHelper.clickLocator(addNewAddressButton);

        By firstNameElement = By.xpath("//input[@id='firstname']");
        String firstNameValue = "Razvan";
        elementHelper.clearAndFillLocator(firstNameElement,firstNameValue);

        By lastNameElement = By.xpath("//input[@id='lastname']");
        String lastNameValue = "Jude";
        elementHelper.clearAndFillLocator(lastNameElement,lastNameValue);

        By phoneNumberElement = By.xpath("//input[@id='telephone']");
        String phoneNumberValue = "0740123321";
        elementHelper.clearAndFillLocator(phoneNumberElement,phoneNumberValue);

        By streetAddressElement = By.xpath("//input[@id='street_1']");
        String streetAddressValue = "str. Ion Mester";
        elementHelper.clearAndFillLocator(streetAddressElement,streetAddressValue);

        By cityElement = By.xpath("//input[@name='city']");
        String cityValue = "CLuj";
        elementHelper.clearAndFillLocator(cityElement,cityValue);

        By stateElement = By.xpath("//select[@id='region_id']");
        String stateValue = "Guam";
        elementHelper.fillPressLocator(stateElement,stateValue, Keys.ENTER);

        By postalCodeElement = By.xpath("//input[@id='zip']");
        String postalCodeValue = "200400";
        elementHelper.clearAndFillLocator(postalCodeElement,postalCodeValue);

        By saveAddressButton = By.xpath("//button[@title='Save Address']");
        elementHelper.clickLocator(saveAddressButton);

        By saveAddressConfirmationElement = By.xpath("//div[contains(text(),'You saved the address.')]");
        String expectMessage = "You saved the address.";
        elementHelper.validateElementText(saveAddressConfirmationElement,expectMessage);

    }
}
































