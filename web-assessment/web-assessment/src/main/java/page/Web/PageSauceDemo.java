package page.Web;

import core.utils.SeleniumHook.SeleniumRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import page.Page;

public class PageSauceDemo {

    private static final String USER_NAME_ID = "user-name";
    private static final String PASSWORD_ID = "password";
    private static final String LOGIN_BTN = "login-button";
    private static final String FILTER_PRODUCTS_DROPDOWN = "product_sort_container";
    private static final String RED_TSHIRT = "add-to-cart-test.allthethings()-t-shirt-(red)";
    private static final String FLEECE_JACKET = "add-to-cart-sauce-labs-fleece-jacket";
    private static final String BOLT_TSHIRT = "add-to-cart-sauce-labs-bolt-t-shirt";
    private static final String CART_CLASSNAME = "shopping_cart_link";
    private static final String REMOVE_PRODUCT_ID = "remove-test.allthethings()-t-shirt-(red)";
    private static final String CHECKOUT_ID = "checkout";
    private static final String FIRSTNAME_ID = "first-name";
    private static final String LASTNAME_ID = "last-name";
    private static final String POSTALCODE_ID = "postal-code";
    private static final String CONTINUEBTN_ID = "continue";
    private static final String FINISHBTN_ID = "finish";
    private static final String ORDERPLACED_TXT = "complete-header";
    private static final String BACKTOHOMEBTN_ID = "back-to-products";
    private static final String MENUBTN_ID = "react-burger-menu-btn";
    private static final String LOGOUT_ID = "logout_sidebar_link";



    public PageSauceDemo(Page page) {}
    public WebElement getUserNameField() { return SeleniumRunner.getSeleniumDriver().findElement(By.id(USER_NAME_ID)); }
    public WebElement getPasswordField() { return SeleniumRunner.getSeleniumDriver().findElement(By.id(PASSWORD_ID)); }
    public WebElement getLoginbtn() { return SeleniumRunner.getSeleniumDriver().findElement(By.id(LOGIN_BTN)); }
    public WebElement getFilterProductsDropdown() { return SeleniumRunner.getSeleniumDriver().findElement(By.className(FILTER_PRODUCTS_DROPDOWN)); }
    public WebElement getRedTshirt(){return SeleniumRunner.getSeleniumDriver().findElement(By.id(RED_TSHIRT));}
    public WebElement getFleeceTshirt(){return SeleniumRunner.getSeleniumDriver().findElement(By.id(FLEECE_JACKET));}
    public WebElement getBoltTshirt(){return SeleniumRunner.getSeleniumDriver().findElement(By.id(BOLT_TSHIRT));}
    public WebElement getCart(){return SeleniumRunner.getSeleniumDriver().findElement(By.className(CART_CLASSNAME));}
    public WebElement removeProduct(){return SeleniumRunner.getSeleniumDriver().findElement(By.id(REMOVE_PRODUCT_ID));}
    public WebElement checkout(){return SeleniumRunner.getSeleniumDriver().findElement(By.id(CHECKOUT_ID));}
    public WebElement getFirstName(){return SeleniumRunner.getSeleniumDriver().findElement(By.id(FIRSTNAME_ID));}
    public WebElement getLastName(){return SeleniumRunner.getSeleniumDriver().findElement(By.id(LASTNAME_ID));}
    public WebElement getPostalCode(){return SeleniumRunner.getSeleniumDriver().findElement(By.id(POSTALCODE_ID));}
    public WebElement getContinuebtn(){return SeleniumRunner.getSeleniumDriver().findElement(By.id(CONTINUEBTN_ID));}
    public WebElement getFinishbtn(){return SeleniumRunner.getSeleniumDriver().findElement(By.id(FINISHBTN_ID));}
    public WebElement getOrderPlacetxt(){return SeleniumRunner.getSeleniumDriver().findElement(By.className(ORDERPLACED_TXT));}
    public WebElement getBacktoHomebtn(){return SeleniumRunner.getSeleniumDriver().findElement(By.id(BACKTOHOMEBTN_ID));}
    public WebElement getMenubtn(){return SeleniumRunner.getSeleniumDriver().findElement(By.id(MENUBTN_ID));}
    public WebElement getLogoutbtn(){return SeleniumRunner.getSeleniumDriver().findElement(By.id(LOGOUT_ID));}




}
