package tests;

import org.testng.annotations.Test;
import pages.AccesoriesPage;
import pages.LoginPage;
import sharedData.SharedData;

public class ProceedToCheckoutTest extends SharedData {

    @Test
    public void AddMenJacketsToBasket(){

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginToApp();

        AccesoriesPage accesoriesPage = new AccesoriesPage(getDriver());
        accesoriesPage.goToMenView();
        accesoriesPage.goToJacketsView();
        accesoriesPage.selectProteusJacket();
        accesoriesPage.selectXS();
        accesoriesPage.blackColor();
        accesoriesPage.addToCart();
        accesoriesPage.goToCart();
        accesoriesPage.goToCheckout();
        accesoriesPage.selectShippingMethod();
        accesoriesPage.goToPaymentsPage();
        accesoriesPage.placeOrder();
        accesoriesPage.confirmationPurchase("Thank you for your purchase!");
    }
}
