package pages;

import helperMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
import pageLocators.AccesoriesLocators;

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

   public void addToCart() {
        elementHelper.clickLocator(AccesoriesLocators.addToCart);
   }

   public void addToWishList() {
        elementHelper.clickJsLocator(AccesoriesLocators.addToWishlistBtn);
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

   public void noItemsInCartMsg(String expectMessage) {
       try {
           Thread.sleep(2000); // wait for 2 seconds
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       elementHelper.validateElementText(AccesoriesLocators.noItemsInCartMsg,expectMessage);
   }

   public void addWishlistMsg(String expectMessage) {
        elementHelper.validateElementText(AccesoriesLocators.addWishlistMsg, expectMessage);
   }

   public void goToCheckout() {
        elementHelper.clickJsLocator(AccesoriesLocators.proceedToCheckoutBtn);
   }

   public void selectShippingMethod() {
        elementHelper.clickJsLocator(AccesoriesLocators.selectFixedShippingmethod);
   }

   public void goToPaymentsPage() {
        elementHelper.clickJsLocator(AccesoriesLocators.nextShippingBtn);
   }

   public void placeOrder() {
       try {
           Thread.sleep(2000); // wait for 2 seconds
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        elementHelper.clickJsLocator(AccesoriesLocators.placeOrderBtn);
   }

    public void confirmationPurchase(String expectMessage) {
        try {
            Thread.sleep(2000); // wait for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        elementHelper.validateElementText(AccesoriesLocators.purchaseConfirmationMsg,expectMessage);
    }

}
