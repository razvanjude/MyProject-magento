package Pages;

import helperMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.AccesoriesLocators;
import pageLocators.AccountLocators;
import pageLocators.LoginLocators;

public class AccesoriesPage {

    private WebDriver driver;
    private ElementHelper elementHelper;

    public AccesoriesPage(WebDriver driver) {
        this.driver = driver;
        elementHelper = new ElementHelper(driver);
    }

    public void goToMenView() {
        elementHelper.clickJsLocator(AccesoriesLocators.menView);
    }

    public void goToJacketsView() {
        elementHelper.clickJsLocator(AccesoriesLocators.jacketsView);
    }

   public void selectProteusJacket() {
        elementHelper.clickLocator(AccesoriesLocators.proteusJacket);
   }

   public void selectXS() {
       elementHelper.clickLocator(AccesoriesLocators.xsMeasure);
   }

   public void blackColor() {
        elementHelper.clickLocator(AccesoriesLocators.blackColor);
   }

   public void addToCart(){
        elementHelper.clickLocator(AccesoriesLocators.addToCart);
   }

   public void goToCart() {
       try {
           Thread.sleep(2000); // wait for 2 seconds
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        elementHelper.clickJsLocator(AccesoriesLocators.goToCart);
   }

   public void removeItemFromCart() {
        elementHelper.clickJsLocator(AccesoriesLocators.removeItemFromCart);
   }

   public void confirmOKRemoveFromCart() {
       try {
           Thread.sleep(2000); // wait for 2 seconds
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        elementHelper.clickJsLocator(AccesoriesLocators.confirmOKRemoveFromCart);
   }

   public void noItemsInCartMsg() {
       try {
           Thread.sleep(2000); // wait for 2 seconds
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       String expectMessage = "You have no items in your shopping cart.";
       elementHelper.validateElementText(AccesoriesLocators.confirmOKRemoveFromCart,expectMessage);
   }

}
