package tests;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import pages.AccesoriesPage;
import pages.LoginPage;
import sharedData.SharedData;

public class ProceedToCheckoutTest extends SharedData {

    private static final Logger log = LoggerFactory.getLogger(ProceedToCheckoutTest.class);

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
        accesoriesPage.continueShopping();

       loginPage.homePageText("Home Page");
    }
}
