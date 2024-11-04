package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BaseTest {

    WebDriver driver;

    WebElement firstNameField;

    WebElement lastNameField;

    WebElement zipPostalCodeField;

    WebElement continueButton;

    WebElement cancelButton;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getFirstNameField() {
        return driver.findElement(By.id("first-name"));
    }

    public WebElement getLastNameField() {
        return driver.findElement(By.id("last-name"));
    }

    public WebElement getZipPostalCodeField() {
        return driver.findElement(By.id("postal-code"));
    }

    public WebElement getContinueButton() {
        return driver.findElement(By.id("continue"));
    }

    public WebElement getCancelButton() {
        return driver.findElement(By.id("cancel"));
    }

    //---------------------------------------------

    public void inputFirstName(String name) {
        getFirstNameField().clear();
        getFirstNameField().sendKeys(name);
    }

    public void inputLastName(String lastName) {
        getLastNameField().clear();
        getLastNameField().sendKeys(lastName);
    }

    public void inputPostalCodeField(String code) {
        getZipPostalCodeField().clear();
        getZipPostalCodeField().sendKeys(code);
    }

    public void clickContinueButton() {
        getContinueButton().click();
    }

    public void clickCancelButton() {
        getCancelButton().click();
    }
}
