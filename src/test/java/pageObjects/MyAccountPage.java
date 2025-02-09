package pageObjects;

import org.openqa.selenium.By;

public class MyAccountPage {
    public By myAccCheckpoint = By.xpath("//*[text()='My account']");
    public By categories = By.xpath("//*[@data-test='nav-categories']");
    public By handTools = By.xpath("//*[@data-test='nav-hand-tools']");
}
