package step_definition.Web;

import core.utils.SeleniumHook.SeleniumRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import page.Page;

import static core.utils.ConfigUtil.environmentConfig;

public class SauceDemoWeb extends Page {

    @Given("^\\[Web] Launch Sauce Demo Website$")
    public void launchSauceDemo()
    {
        SeleniumRunner.startSeleniumServer(environmentConfig.getProperty("saucedemo"));
    }

    @When("^\\[Web] User enters username \"([^\"]*)\"$")
    public void enterUserName(String username)
    {
        getPageSauceDemo().getUserNameField().sendKeys(username);
    }

    @When("[Web] User enters password {string}")
    public void userEntersPassword(String password) throws InterruptedException {
        getPageSauceDemo().getPasswordField().sendKeys(password);
    }

    @Then("[Web] User clicks Login button")
    public void userClicksLoginButton() {
        getPageSauceDemo().getLoginbtn().click();
    }

    @And("[Web] User filters products on the home page with {string}")
    public void userFiltersProducts(String dropdown) throws InterruptedException {
        Thread.sleep(5000);
        Select filterProducts = new Select(getPageSauceDemo().getFilterProductsDropdown());
        filterProducts.selectByValue(dropdown);
    }

    @Then("[Web] User adds a product {string} in cart")
    public void webUserAddsAProductInCart(String product) {
        switch(product){
            //Case statements
            case "red t-shirt": getPageSauceDemo().getRedTshirt().click();
                break;
            case "fleece t-shirt": getPageSauceDemo().getFleeceTshirt().click();
                break;
            case "bolt t-shirt": getPageSauceDemo().getBoltTshirt().click();
                break;
            //Default case statement
            default:System.out.println("No such product found.");
        }
    }

    @And("[Web] User clicks on cart")
    public void userClicksCart() {
        getPageSauceDemo().getCart().click();
    }

    @Then("[Web] User removes a product from cart")
    public void userRemovesProduct() {
        getPageSauceDemo().removeProduct().click();
    }

    @Then("[Web] User checks out")
    public void userChecksOut() {
        getPageSauceDemo().checkout().click();
    }

    @And("[Web] User enters checkout details")
    public void userEntersDetails() {
        getPageSauceDemo().getFirstName().sendKeys("Abdulqadir");
        getPageSauceDemo().getLastName().sendKeys("Taiyeb");
        getPageSauceDemo().getPostalCode().sendKeys("74700");
    }

    @Then("[Web] User clicks continue button")
    public void userClicksContinuebtn() {
        getPageSauceDemo().getContinuebtn().click();
    }

    @Then("[Web] User clicks finish button")
    public void userClicksFinishbtn() {
        getPageSauceDemo().getFinishbtn().click();
    }

    @And("[Web] Verify the order has been placed succesfully")
    public void verifiesOrderPlaced() {
        String orderplaced_text = getPageSauceDemo().getOrderPlacetxt().getText();
        Assert.assertEquals("Thank you for your order!",orderplaced_text);
    }

    @Then("[Web] User clicks back to home")
    public void userClicksBackHomePage() {
        getPageSauceDemo().getBacktoHomebtn().click();

    }

    @Then("[Web] User clicks menu button on the home page")
    public void userClicksMenuBtn() {
        getPageSauceDemo().getMenubtn().click();
    }

    @And("[Web] User logs out")
    public void userLogsout() {
        getPageSauceDemo().getLogoutbtn().click();
    }
}
