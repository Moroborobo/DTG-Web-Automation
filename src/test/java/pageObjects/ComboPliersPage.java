package pageObjects;

import org.openqa.selenium.By;

public class ComboPliersPage {
    public By comboPliersCheckpoint = By.xpath("//*[text()='Combination Pliers']");
    public By addToCart = By.xpath("//*[@data-test='add-to-cart']");
    public By cart = By.xpath("//*[@data-test='nav-cart']");
    public By productAddedCheck = By.xpath("//*[@aria-label='Product added to shopping cart.']");
}
