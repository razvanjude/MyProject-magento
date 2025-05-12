package pageLocators;

import org.openqa.selenium.By;

public class AccesoriesLocators {

    public static final By menView = By.cssSelector("a[id='ui-id-5'] span:nth-child(2)");
    //public static final By jacketsView = By.xpath("(//a[contains(text(),'Jackets')]");
    public static final By jacketsView = By.cssSelector("body > div:nth-child(5) > main:nth-child(4) > div:nth-child(5) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > ul:nth-child(2) > li:nth-child(2) > a:nth-child(1)");
    public static final By proteusJacket = By.xpath("//img[@alt='Proteus Fitness Jackshirt']");
    public static final By addToCart = By.xpath("//button[@id='product-addtocart-button']");
    public static final By xsMeasure = By.xpath("//div[@id='option-label-size-143-item-166']");
    public static final By blackColor = By.xpath("//div[@id='option-label-color-93-item-49']");
    public static final By goToCart = By.xpath("//a[@class='action showcart']");
    public static final By removeItemFromCart = By.xpath("//a[@title='Remove item']");
    public static final By confirmOKRemoveFromCart = By.cssSelector("button[class='action-primary action-accept'] span");
    public static final By noItemsInCartMsg = By.xpath("//strong[@class='subtitle empty']");
    public static final By addWishlistMsg = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    public static final By proceedToCheckoutBtn = By.xpath("//button[@id='top-cart-btn-checkout']");
    public static final By nextShippingBtn = By.xpath("//span[normalize-space()='Next']");
    public static final By selectFixedShippingmethod = By.xpath("//tbody/tr[2]/td[1]");
    public static final By placeOrderBtn = By.xpath("//span[normalize-space()='Place Order']");
    public static final By purchaseConfirmationMsg = By.xpath("//span[@class='base']");
    public static final By addToWishlistBtn = By.xpath("//div[@class='product-addto-links']//span[contains(text(),'Add to Wish List')]");
}
