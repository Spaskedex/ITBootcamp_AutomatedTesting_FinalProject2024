package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends BaseTest {

    WebDriver driver;

    WebElement continueShopingButton;

    WebElement productIsInCart;

    WebElement removeBackpackFromCartButton;

    WebElement removeBikeLightFromCartButton;

    WebElement removeBoltTShirtFromCartButton;

    WebElement removeFleeceJacketFromCartButton;

    WebElement removeOnesieFromCartButton;

    WebElement removeTShirtRedFromCartButton;

    WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getContinueShopingButton() {
        return driver.findElement(By.id("continue-shopping"));
    }

    public WebElement getProductIsInCart() {
        return driver.findElement(By.className("inventory_item_name"));
    }

    public WebElement getRemoveBackpackFromCartButton() {
        return driver.findElement(By.id("remove-sauce-labs-backpack"));
    }

    public WebElement getRemoveBikeLightFromCartButton() {
        return driver.findElement(By.id("remove-sauce-labs-bike-light"));
    }

    public WebElement getRemoveBoltTShirtFromCartButton() {
        return driver.findElement(By.id("remove-sauce-labs-bolt-t-shirt"));
    }

    public WebElement getRemoveFleeceJacketFromCartButton() {
        return driver.findElement(By.id("remove-sauce-labs-fleece-jacket"));
    }

    public WebElement getRemoveOnesieFromCartButton() {
        return driver.findElement(By.id("remove-sauce-labs-onesie"));
    }

    public WebElement getRemoveTShirtRedFromCartButton() {
        return driver.findElement(By.id("remove-test.allthethings()-t-shirt-(red)"));
    }

    public WebElement getCheckoutButton() {
        return driver.findElement(By.id("checkout"));
    }

    //-----------------------------------------------------------------

    public void clickContinueShoppingButton() {
        getContinueShopingButton().click();
    }

    public void clickRemoveBackpackFromCartButton() {
        getRemoveBackpackFromCartButton().click();
    }

    public void clickRemoveBikeLightFromCartButton() {
        getRemoveBikeLightFromCartButton().click();
    }

    public void clickRemoveBoltTShirtFromCartButton() {
        getRemoveBoltTShirtFromCartButton().click();
    }

    public void clickRemoveFleeceJacketFromCartButton() {
        getRemoveFleeceJacketFromCartButton().click();
    }

    public void clickRemoveOnesieFromCartButton() {
        getRemoveOnesieFromCartButton().click();
    }

    public void clickRemoveTShirtRedFromCartButton() {
        getRemoveTShirtRedFromCartButton().click();
    }

    public void clickCheckoutButton() {
        getCheckoutButton().click();
    }
}
