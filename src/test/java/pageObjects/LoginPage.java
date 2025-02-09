package pageObjects;

import org.openqa.selenium.By;

public class LoginPage {
    public By loginCheckpoint = By.xpath("//*[text()='Login']");
    public By registerLink = By.xpath("//*[@data-test='register-link']");
    public By emailTextbox = By.xpath("//*[@id='email']");
    public By passwordTextbox = By.xpath("//*[@data-test='password']");
    public By loginButton = By.xpath("//*[@class='btnSubmit']");

}
