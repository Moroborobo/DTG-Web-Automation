package pageObjects;

import org.openqa.selenium.By;

public class RegistrationPage {
    public By firstName = By.xpath("//*[@data-test='first-name']");
    public By lastName = By.xpath("//*[@data-test='last-name']");
    public By dob = By.xpath("//*[@data-test='dob']");
    public By address = By.xpath("//*[@data-test='address']");
    public By postCode = By.xpath("//*[@data-test='postcode']");
    public By city = By.xpath("//*[@data-test='city']");
    public By state = By.xpath("//*[@data-test='state']");
    public By country = By.xpath("//*[@data-test='country']");
    public By phone = By.xpath("//*[@data-test='phone']");
    public By email = By.xpath("//*[@data-test='email']");
    public By password = By.xpath("//*[@data-test='password']");
    public By registerBtn = By.xpath("//*[@data-test='register-submit']");
    public By customerRegistrationCheckpoint = By.xpath("//*[text()='Customer registration']");
}
