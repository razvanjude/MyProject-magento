package tests;

import pages.RegisterPage;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.util.UUID;

public class RegisterTest extends SharedData {

    @Test
    public void metodaTest() {

        RegisterPage registerPage = new RegisterPage(getDriver());

        // Date generate dinamic
        String randomFirstName = "User_" + UUID.randomUUID().toString().substring(0, 5);
        String randomLastName = "Test_" + UUID.randomUUID().toString().substring(0, 5);

        registerPage.goToCreateAccount();
        registerPage.addFirstName(randomFirstName);
        registerPage.addLastName(randomLastName);
        registerPage.addUserEmail();
        registerPage.addPassword("Pa$$w0rd.");
        registerPage.addConfirmationPassword("Pa$$w0rd.");
        registerPage.createAccount();
        registerPage.thankYouMessage("Thank you for registering with Main Website Store.");
    }
}
