package Pages;

import Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomepagePage extends BaseTest {

    WebDriver driver;

    WebElement userNameField;

    WebElement passwordField;

    WebElement loginButton;

    WebElement errorMessage;

    public HomepagePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUserNameField() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }

    public WebElement getErrorMessage() {
        return driver.findElement(By.cssSelector(".error-message-container.error"));
    }

    //-------------------------------------------------

    public void inputUserName(String userName) {
        getUserNameField().clear();
        getUserNameField().sendKeys(userName);
    }

    public void inputPassword(String password) {
        getPasswordField().clear();
        getPasswordField().sendKeys(password);
    }

    public void loginButtonKlick() {
        getLoginButton().click();
    }
}
