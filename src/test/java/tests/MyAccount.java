package tests;

import Pages.AccountPage;
import Pages.LoginPage;
import helperMethods.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class MyAccount extends SharedData {

    @Test
    public void AddInfoToAddressBook() {

        ElementHelper elementHelper = new ElementHelper(getDriver());

        //Face Login
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginToApp();


        //Deschide My Account
        AccountPage accountPage = new AccountPage(getDriver());
        accountPage.goToUserOption();
        accountPage.goToMyAccount();
        accountPage.landOnMyAccountPage();

        //Deschide AddressBook
        accountPage.goToAddressBook();
        accountPage.addNewAddress();
        accountPage.insertFirstName();
        accountPage.insertLastName();
        accountPage.insertPhoneNumber();
        accountPage.insertStreetAddress();
        accountPage.insertCity();
        accountPage.insertState();
        accountPage.insertZipCode();
        accountPage.saveAddress();
        accountPage.validateElementText();
    }
}
































