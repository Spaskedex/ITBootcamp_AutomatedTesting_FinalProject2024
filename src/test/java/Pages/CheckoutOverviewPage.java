package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage extends BaseTest {

    WebDriver driver;

    WebElement backpackLink;

    WebElement bikeLightLink;

    WebElement boltTShirtLink;

    WebElement fleeceJacketLink;

    WebElement onesieLink;

    WebElement tShirtRedLink;

    WebElement finishButton;

    WebElement cancelButton;

    public CheckoutOverviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBackpackLink() {
        return driver.findElement(By.id("item_4_title_link"));
    }

    public WebElement getBikeLightLink() {
        return driver.findElement(By.id("item_0_title_link"));
    }

    public WebElement getBoltTShirtLink() {
        return driver.findElement(By.id("item_1_title_link"));
    }

    public WebElement getFleeceJacketLink() {
        return driver.findElement(By.id("item_5_title_link"));
    }

    public WebElement getOnesieLink() {
        return driver.findElement(By.id("item_2_title_link"));
    }

    public WebElement gettShirtRedLink() {
        return driver.findElement(By.id("item_3_title_link"));
    }

    public WebElement getFinishButton() {
        return driver.findElement(By.id("finish"));
    }

    public WebElement getCancelButton() {
        return driver.findElement(By.id("cancel"));
    }

    //------------------------------------------

    public void clickFinishButton() {
        getFinishButton().click();
    }

    public void clickCancelButton() {
        getCancelButton().click();
    }
}
