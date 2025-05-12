package tests;

import pages.AccountPage;
import pages.LoginPage;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class MyAccountTest extends SharedData {

    @Test
    public void AddInfoToAddressBook() {

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
        accountPage.insertFirstName("Razvanel");
        accountPage.insertLastName("Judos");
        accountPage.insertPhoneNumber("0740123456");
        accountPage.chooseCountry("Romania");
        accountPage.insertStreetAddress("str. Sf. Aurel");
        accountPage.insertCity("Cluj Napoca");
        accountPage.insertState("Cluj");
        accountPage.insertZipCode("200650");
        accountPage.saveAddress();
        accountPage.validateElementText("You saved the address.");
    }
}
































