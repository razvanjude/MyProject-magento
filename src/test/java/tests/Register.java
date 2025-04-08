package tests;

import Pages.RegisterPage;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class Register extends SharedData {

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
