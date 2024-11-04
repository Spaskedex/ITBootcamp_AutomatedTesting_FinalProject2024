package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage extends BaseTest {

    WebDriver driver;

    WebElement backHomeButton;

    WebElement checkoutCompleteMessage;

    public CheckoutCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getBackHomeButton() {
        return driver.findElement(By.id("back-to-products"));
    }

    public WebElement getCheckoutCompleteMessage() {
        return driver.findElement(By.className("complete-header"));
    }

    //-----------------------------------------

    public void clickBackHomeButton() {
        getBackHomeButton().click();
    }
}
