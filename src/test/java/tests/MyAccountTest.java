package tests;

import pages.AccountPage;
import pages.LoginPage;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.util.Random;
import java.util.UUID;

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

        // Generate random data
        String randomFirstName = "User_" + UUID.randomUUID().toString().substring(0, 5);
        String randomLastName = "Test_" + UUID.randomUUID().toString().substring(0, 5);
        String randomPhone = "07" + (new Random().nextInt(90000000) + 10000000);
        String randomStreet = "Strada Test " + new Random().nextInt(100);


        //Deschide AddressBook
        accountPage.goToAddressBook();
        accountPage.addNewAddress();
        accountPage.insertFirstName(randomFirstName);
        accountPage.insertLastName(randomLastName);
        accountPage.insertPhoneNumber(randomPhone);
        accountPage.chooseCountry("Romania");
        accountPage.insertStreetAddress(randomStreet);
        accountPage.insertCity("Cluj Napoca");
        accountPage.insertState("Cluj");
        accountPage.insertZipCode("200650");
        accountPage.saveAddress();
        accountPage.validateElementText("You saved the address.");
    }
}
































