package pageObjects;

import org.openqa.selenium.By;

public class CartPage {
    public By cartCheckpoint = By.xpath("//*[text()='Item']");
    public By proceedToCheckoutCart = By.xpath("//*[@data-test='proceed-1']");
    public By proceedToCheckoutSignIn = By.xpath("//*[@data-test='proceed-2']");
    public By proceedToCheckoutBilling = By.xpath("//*[@data-test='proceed-3']");
    public By choosePaymentMethod = By.xpath("//*[@data-test='payment-method']");
    public By confirm = By.xpath("//*[@data-test='finish']");
    public By paymentSuccess = By.xpath("//*[text()='Payment was successful']");
    public By proceedToCheckoutCheck = By.xpath("//*[contains(text(),'You can proceed to checkout.')]");
    public By billingAddressCheckpoint = By.xpath("(//h3[contains(text(),'Billing Address')])");
    public By paymentCheckpoint = By.xpath("(//h3[contains(text(),'Payment')])");

}
