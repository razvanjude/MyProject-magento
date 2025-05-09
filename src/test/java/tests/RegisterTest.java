package tests;

import pages.RegisterPage;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class RegisterTest extends SharedData {

    @Test
    public void metodaTest() {

        RegisterPage registerPage = new RegisterPage(getDriver());

        registerPage.goToCreateAccount();
        registerPage.addFirstName();
        registerPage.addLastName();
        registerPage.addUserEmail();
        registerPage.addPassword();
        registerPage.addConfirmationPassword();
        registerPage.createAccount();
        registerPage.thankYouMessage();
    }
}
