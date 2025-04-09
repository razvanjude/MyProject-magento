package tests;

import Pages.AccesoriesPage;
import Pages.LoginPage;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class AddMenJacketsToBasket extends SharedData {

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
        accesoriesPage.removeItemFromCart();
        accesoriesPage.confirmOKRemoveFromCart();
        //accesoriesPage.noItemsInCartMsg();
    }
}
