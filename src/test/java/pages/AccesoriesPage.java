package pages;

import helperMethods.ElementHelper;
import loggerUtility.LoggerUtility;
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
        LoggerUtility.infoLog("Access MEN view");
    }

    public void goToJacketsView() {
        elementHelper.clickJsLocator(AccesoriesLocators.jacketsView);
        LoggerUtility.infoLog("Access Jacket view");
    }

   public void selectProteusJacket() {
        elementHelper.clickJsLocator(AccesoriesLocators.proteusJacket);
       LoggerUtility.infoLog("Select Proteus Jacket");
   }

   public void selectXS() {
       elementHelper.clickJsLocator(AccesoriesLocators.xsMeasure);
       LoggerUtility.infoLog("Select XS measure");
   }

   public void blackColor() {
        elementHelper.clickJsLocator(AccesoriesLocators.blackColor);
       LoggerUtility.infoLog("Select color black");
   }

   public void addToCart() {
        elementHelper.clickJsLocator(AccesoriesLocators.addToCart);
       LoggerUtility.infoLog("Click Add to cart button");
   }

   public void addToWishList() {
        elementHelper.clickJsLocator(AccesoriesLocators.addToWishlistBtn);
       LoggerUtility.infoLog("Click add to Wishlist");
   }

   public void goToCart() {
       try {
           Thread.sleep(3000); // wait for 2 seconds
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        elementHelper.clickJsLocator(AccesoriesLocators.goToCart);
       LoggerUtility.infoLog("Click Go to cart button");
   }

   public void removeItemFromCart() {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(AccesoriesLocators.removeItemFromCart));

        elementHelper.clickJsLocator(AccesoriesLocators.removeItemFromCart);
       LoggerUtility.infoLog("Click Remove item from cart");
   }

   public void confirmOKRemoveFromCart() {
       try {
           Thread.sleep(2000); // wait for 2 seconds
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        elementHelper.clickJsLocator(AccesoriesLocators.confirmOKRemoveFromCart);
       LoggerUtility.infoLog("Click confirmation OK button when removing from cart");
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
       LoggerUtility.infoLog("Proceed to Checkout page");
   }

   public void selectShippingMethod() {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(AccesoriesLocators.selectFixedShippingmethod));

        elementHelper.clickJsLocator(AccesoriesLocators.selectFixedShippingmethod);
       LoggerUtility.infoLog("Select Shipping method");
   }

   public void goToPaymentsPage() {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       wait.until(ExpectedConditions.visibilityOfElementLocated(AccesoriesLocators.nextShippingBtn));

        elementHelper.clickJsLocator(AccesoriesLocators.nextShippingBtn);
       LoggerUtility.infoLog("Proceed to Payments page");
   }

   public void placeOrder() {
       try {
           Thread.sleep(2000); // wait for 2 seconds
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
        elementHelper.clickJsLocator(AccesoriesLocators.placeOrderBtn);
       LoggerUtility.infoLog("Click Place order button");
   }

    public void confirmationPurchase(String expectMessage) {
        elementHelper.validateElementText(AccesoriesLocators.purchaseConfirmationMsg,expectMessage);
    }

    public void continueShopping() {
        elementHelper.clickJsLocator(AccesoriesLocators.continueShoppingBtn);
        LoggerUtility.infoLog("Click Continue shopping button");
    }

}
