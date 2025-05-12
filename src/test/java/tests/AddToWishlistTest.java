package tests;

import org.testng.annotations.Test;
import pages.AccesoriesPage;
import pages.LoginPage;
import sharedData.SharedData;

public class AddToWishlistTest extends SharedData {

    @Test
    public void AddToWishlist(){

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginToApp();

        AccesoriesPage accesoriesPage = new AccesoriesPage(getDriver());
        accesoriesPage.goToMenView();
        accesoriesPage.goToJacketsView();
        accesoriesPage.selectProteusJacket();
        accesoriesPage.addToWishList();
        accesoriesPage.addWishlistMsg("Proteus Fitness Jackshirt has been added to your Wish List. Click here to continue shopping.");
    }
}
