package pages;

import helperMethods.ElementHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageLocators.AccesoriesLocators;

import java.time.Duration;

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
        elementHelper.clickJsLocator(AccesoriesLocators.proteusJacket);
   }

   public void selectXS() {
       elementHelper.clickJsLocator(AccesoriesLocators.xsMeasure);
   }

   public void blackColor() {
        elementHelper.clickJsLocator(AccesoriesLocators.blackColor);
   }

   public void addToCart() {
        elementHelper.clickJsLocator(AccesoriesLocators.addToCart);
   }

   public void addToWishList() {
        elementHelper.clickJsLocator(AccesoriesLocators.addToWishlistBtn);
   }

   public void goToCart() {
       try {
           Thread.sleep(3000); // wait for 2 seconds
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        elementHelper.clickJsLocator(AccesoriesLocators.goToCart);
   }

   public void removeItemFromCart() {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(AccesoriesLocators.removeItemFromCart));

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
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(AccesoriesLocators.proceedToCheckoutBtn));

       elementHelper.clickJsLocator(AccesoriesLocators.proceedToCheckoutBtn);
   }

   public void selectShippingMethod() {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(AccesoriesLocators.selectFixedShippingmethod));

        elementHelper.clickJsLocator(AccesoriesLocators.selectFixedShippingmethod);
   }

   public void goToPaymentsPage() {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(AccesoriesLocators.nextShippingBtn));

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
        elementHelper.validateElementText(AccesoriesLocators.purchaseConfirmationMsg,expectMessage);
    }

    public void continueShopping() {
        elementHelper.clickJsLocator(AccesoriesLocators.continueShoppingBtn);
    }

}
