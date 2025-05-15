package tests;

import pages.AccesoriesPage;
import pages.LoginPage;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class AddRemoveFromCartTest extends SharedData {

    @Test
    public void AddRemoveItemsFromCart(){

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
        accesoriesPage.removeItemFromCart();
        accesoriesPage.confirmOKRemoveFromCart();
        accesoriesPage.noItemsInCartMsg("You have no items in your shopping cart.");
    }
}
