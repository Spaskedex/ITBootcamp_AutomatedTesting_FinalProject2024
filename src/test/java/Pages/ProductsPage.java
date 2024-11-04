package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends BaseTest {

    WebDriver driver;

    WebElement backpackAddToCartButton;

    WebElement bikeLightAddToCartButton;

    WebElement boltTShirtAddToCartButton;

    WebElement fleeceJacketAddToCartButton;

    WebElement onesieAddToCartButton;

    WebElement tShirtRedAddToCartButton;

    WebElement backpackRemoveButton;

    WebElement bikeLightRemoveButton;

    WebElement boltTShirtRemoveButton;

    WebElement fleeceJacketRemoveButton;

    WebElement onesieRemoveButton;

    WebElement tShirtRedRemoveButton;

    WebElement cartButton;

    WebElement hamburgerMenu;

    WebElement logoutButton;



    public ProductsPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBackpackAddToCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }

    public WebElement getBikeLightAddToCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
    }

    public WebElement getBoltTShirtAddToCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
    }

    public WebElement getFleeceJacketAddToCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket"));
    }

    public WebElement getOnesieAddToCartButton() {
        return driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));
    }

    public WebElement gettShirtRedAddToCartButton() {
        return driver.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));
    }

    public WebElement getBackpackRemoveButton() {
        return driver.findElement(By.id("remove-sauce-labs-backpack"));
    }

    public WebElement getBikeLightRemoveButton() {
        return driver.findElement(By.id("remove-sauce-labs-bike-light"));
    }

    public WebElement getBoltTShirtRemoveButton() {
        return driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
    }

    public WebElement getFleeceJacketRemoveButton() {
        return driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
    }

    public WebElement getOnesieRemoveButton() {
        return driver.findElement(By.id("remove-sauce-labs-onesie"));
    }

    public WebElement gettShirtRedRemoveButton() {
        return driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));
    }

    public WebElement getCartButton() {
        return driver.findElement(By.id("shopping_cart_container"));
    }

    public WebElement getHamburgerMenu() {
        return driver.findElement(By.id("react-burger-menu-btn"));
    }

    public WebElement getLogoutButton() {
        return driver.findElement(By.id("logout_sidebar_link"));
    }

    //---------------------------------------------------------

    public void clickBackpackAddToCartButton() {
        getBackpackAddToCartButton().click();
    }

    public void clickBikeLightAddToCartButton() {
        getBikeLightAddToCartButton().click();
    }

    public void clickBoltTShirtAddToCartButton() {
        getBoltTShirtAddToCartButton().click();
    }

    public void clickFleeceJacketAddToCartButton() {
        getFleeceJacketAddToCartButton().click();
    }

    public void clickOnesieAddToCartButton() {
        getOnesieAddToCartButton().click();
    }

    public void clicktShirtRedAddToCartButton() {
        gettShirtRedAddToCartButton().click();
    }

    //------------------------------------------------

    public void clickBackpackRemoveButton() {
        getBackpackRemoveButton().click();
    }

    public void clickBikeLightRemoveButton() {
        getBikeLightRemoveButton().click();
    }

    public void clickBoltTShirtRemoveButton() {
        getBoltTShirtRemoveButton().click();
    }

    public void clickFleeceJacketRemoveButton() {
        getFleeceJacketRemoveButton().click();
    }

    public void clickOnesieRemoveButton() {
        getOnesieRemoveButton().click();
    }

    public void clicktShirtRedRemoveButton() {
        gettShirtRedRemoveButton().click();
    }

    public void clickCartButton() {
        getCartButton().click();
    }

    public void clickHamburgerMenu() {
        getHamburgerMenu().click();
    }

    public void clickLogoutButton() {
        getLogoutButton().click();
    }
}
