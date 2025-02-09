package stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.*;
import utils.WebActions;

public class ToolshopSteps {
    WebDriver driver = Hooks.driver;
    ToolshopLanding landingPage = new ToolshopLanding();
    LoginPage loginPage = new LoginPage();
    RegistrationPage regPage = new RegistrationPage();
    MyAccountPage myAccPage = new MyAccountPage();
    HandToolsPage handToolsPage = new HandToolsPage();
    ComboPliersPage comboPliersPage = new ComboPliersPage();
    CartPage cartPage = new CartPage();
    WebActions actions = new WebActions();
    @Given("User is on the ToolShop landing page")
    public void userIsOnTheToolShopLandingPage() {
        actions.checkObject(driver, landingPage.toolshopLogo);
    }

    @When("User clicks Sign in button")
    public void userClicksSignInButton() {
        actions.clickObject(driver, landingPage.signInLink);
    }

    @Then("The login page is displayed")
    public void theLoginPageIsDisplayed() {
        actions.checkObject(driver, loginPage.loginCheckpoint);
    }

    @When("User clicks Register your account link")
    public void userClicksRegisterYourAccountLink() {
        actions.clickObject(driver, loginPage.registerLink);
    }

    @Then("The Customer registration screen is displayed")
    public void theCustomerRegistrationScreenIsDisplayed() {
        actions.clickObject(driver, regPage.customerRegistrationCheckpoint);
    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String fname, String lname) {
        actions.enterText(driver, regPage.firstName, fname);
        actions.enterText(driver, regPage.lastName, lname);
    }

    @And("User enters their {string}")
    public void userEntersTheir(String dob) {
        actions.enterText(driver, regPage.dob, dob);
    }

    @And("User enters their {string}, {string}, {string} and {string}")
    public void userEntersTheirAnd(String address, String postcode, String city, String state) {
        actions.enterText(driver, regPage.address, address);
        actions.enterText(driver, regPage.postCode, postcode);
        actions.enterText(driver, regPage.city, city);
        actions.enterText(driver, regPage.state, state);
    }

    @And("User selects their {string}")
    public void userSelectsTheir(String country) {
        actions.selectByText(driver, regPage.country, country);
    }

    @And("User enters their {string}, {string} and {string}")
    public void userEntersTheirAnd(String phone, String email, String password) {
        actions.enterText(driver, regPage.phone, phone);
        actions.enterText(driver, regPage.email, email);
        actions.enterText(driver, regPage.password, password);
    }

    @When("User clicks Register button")
    public void userClicksRegisterButton() {
        actions.clickObject(driver, regPage.registerBtn);
    }

    @When("User enters an {string} and {string}")
    public void userEntersAnAnd(String email, String password) {
        actions.enterText(driver, loginPage.emailTextbox, email);
        actions.enterText(driver, loginPage.passwordTextbox, password);
    }

    @And("User clicks the login button")
    public void userClicksTheLoginButton() {
        actions.clickObject(driver, loginPage.loginButton);
    }

    @Then("User is navigated to My account screen")
    public void userIsNavigatedToMyAccountScreen() {
        actions.checkObject(driver, myAccPage.myAccCheckpoint);
    }

    @When("User clicks Catergories")
    public void userClicksCatergories() {
        actions.clickObject(driver, myAccPage.categories);
    }

    @And("User selects Hand Tools")
    public void userSelectsHandTools() {
        actions.clickObject(driver, myAccPage.handTools);
    }

    @Then("Hand Tools screen is displayed")
    public void handToolsScreenIsDisplayed() {
        actions.checkObject(driver, handToolsPage.handToolsCheckpoint);
    }

    @When("User clicks add to cart")
    public void userClicksAddToCart() {
        actions.clickObject(driver, comboPliersPage.addToCart);
    }

    @Then("Product added popup is displayed")
    public void productAddedPopupIsDisplayed() {
        actions.checkObject(driver, comboPliersPage.productAddedCheck);
    }

    @When("User clicks cart")
    public void userClicksCart() {
        try {
            Thread.sleep(3750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actions.clickObject(driver, comboPliersPage.cart);
    }

    @Then("User is navigated to the cart screen")
    public void userIsNavigatedToTheCartScreen() {
        actions.checkObject(driver, cartPage.cartCheckpoint);
    }

    @When("User clicks Proceed to checkout on cart screen")
    public void userClicksProceedToCheckoutOnCartScreen() {
        actions.clickObject(driver, cartPage.proceedToCheckoutCart);
    }

    @Then("User is navigated to sign in screen with {string} and {string}")
    public void userIsNavigatedToSignInScreen(String email, String password) {
        if(actions.checkObject(driver, loginPage.emailTextbox, 5)){
            actions.enterText(driver, loginPage.emailTextbox, email);
            actions.enterText(driver, loginPage.passwordTextbox, password);
            actions.clickObject(driver, loginPage.loginButton);
        }
        actions.checkObject(driver, cartPage.proceedToCheckoutCheck);
    }

    @When("User clicks Proceed to checkout on sign in screen")
    public void userClicksProceedToCheckoutOnSignInScreen() {
        actions.clickObject(driver, cartPage.proceedToCheckoutSignIn);
    }

    @Then("Billing Address screen is displayed")
    public void billingAddressScreenIsDisplayed() {
        actions.checkObject(driver, cartPage.billingAddressCheckpoint);
    }

    @When("User clicks proceed to checkout on address screen")
    public void userClicksProceedToCheckoutOnAddressScreen() {
        actions.clickObject(driver, cartPage.proceedToCheckoutBilling);
    }

    @Then("Payment screen is displayed")
    public void paymentScreenIsDisplayed() {
        actions.checkObject(driver, cartPage.paymentCheckpoint);
    }

    @When("User selects payment method")
    public void userSelectsPaymentMethod() {
        actions.selectByText(driver,cartPage.choosePaymentMethod,"Cash on Delivery");
    }

    @And("User clicks confirm button")
    public void userClicksConfirmButton() {
        actions.clickObject(driver, cartPage.confirm);
    }

    @Then("Payment was successful is displayed")
    public void paymentWasSuccessfulIsDisplayed() {
        actions.checkObject(driver, cartPage.paymentSuccess);
    }

    @When("User clicks Combination Pliers")
    public void userClicksCombinationPliers() {
        actions.clickObject(driver, handToolsPage.comboPliersTool);
    }

    @Then("User is navigated to Combination Pliers screen")
    public void userIsNavigatedToCombinationPliersScreen() {
        actions.checkObject(driver, comboPliersPage.comboPliersCheckpoint);
    }
}
