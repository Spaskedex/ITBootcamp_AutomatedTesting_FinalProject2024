package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void loginTestStandardUserAddRemoveLogout() throws InterruptedException {
    homepagePage.getUserNameField().sendKeys("standard_user");
    homepagePage.getPasswordField().sendKeys("secret_sauce");
    homepagePage.getLoginButton().click();

    productsPage.getBackpackAddToCartButton().click();
    productsPage.getBikeLightAddToCartButton().click();
    productsPage.getBoltTShirtAddToCartButton().click();
    productsPage.getFleeceJacketAddToCartButton().click();
    productsPage.getOnesieAddToCartButton().click();
    productsPage.gettShirtRedAddToCartButton().click();

    Thread.sleep(3000);
    productsPage.getCartButton().click();
    Thread.sleep(3000);
    cartPage.getContinueShopingButton().click();
    Thread.sleep(3000);


    productsPage.getBackpackRemoveButton().click();
    productsPage.getBikeLightRemoveButton().click();
    productsPage.getBoltTShirtRemoveButton().click();
    productsPage.getFleeceJacketRemoveButton().click();
    productsPage.getOnesieRemoveButton().click();
    productsPage.gettShirtRedRemoveButton().click();

    Thread.sleep(2000);

    productsPage.getHamburgerMenu().click();
    productsPage.getLogoutButton().click();

    }

    @Test
    public void standardUserLoginTest() {

        homepagePage.inputUserName(excelReader.getStringData("User_names_password", 1, 0));
        homepagePage.inputPassword(excelReader.getStringData("User_names_password", 1, 1));
        homepagePage.loginButtonKlick();

        Assert.assertTrue(productsPage.getHamburgerMenu().isDisplayed());
        Assert.assertTrue(productsPage.getBackpackAddToCartButton().isDisplayed());

        productsPage.getHamburgerMenu().click();
        productsPage.getLogoutButton().click();
    }

    @Test
    public void lockedOutUserLoginTest() {

        homepagePage.inputUserName(excelReader.getStringData("User_names_password", 2, 0));
        homepagePage.inputPassword(excelReader.getStringData("User_names_password", 1, 1));
        homepagePage.loginButtonKlick();

        Assert.assertTrue(homepagePage.getLoginButton().isDisplayed());
        Assert.assertTrue(homepagePage.getErrorMessage().isDisplayed());
    }

    @Test
    public void problemUserLoginTest() {

        homepagePage.inputUserName(excelReader.getStringData("User_names_password", 3, 0));
        homepagePage.inputPassword(excelReader.getStringData("User_names_password", 1, 1));
        homepagePage.loginButtonKlick();

        Assert.assertTrue(productsPage.getHamburgerMenu().isDisplayed());
        Assert.assertTrue(productsPage.getBackpackAddToCartButton().isDisplayed());

        productsPage.getHamburgerMenu().click();
        productsPage.getLogoutButton().click();
    }

    @Test
    public void performanceGlitchUserLoginTest() {

        homepagePage.inputUserName(excelReader.getStringData("User_names_password", 4, 0));
        homepagePage.inputPassword(excelReader.getStringData("User_names_password", 1, 1));
        homepagePage.loginButtonKlick();

        Assert.assertTrue(productsPage.getHamburgerMenu().isDisplayed());
        Assert.assertTrue(productsPage.getBackpackAddToCartButton().isDisplayed());

        productsPage.getHamburgerMenu().click();
        productsPage.getLogoutButton().click();
    }

    @Test
    public void errorUserLoginTest() {

        homepagePage.inputUserName(excelReader.getStringData("User_names_password", 5, 0));
        homepagePage.inputPassword(excelReader.getStringData("User_names_password", 1, 1));
        homepagePage.loginButtonKlick();

        Assert.assertTrue(productsPage.getHamburgerMenu().isDisplayed());
        Assert.assertTrue(productsPage.getBackpackAddToCartButton().isDisplayed());

        productsPage.getHamburgerMenu().click();
        productsPage.getLogoutButton().click();
    }

    @Test
    public void visualUserLoginTest() throws InterruptedException {

        homepagePage.inputUserName(excelReader.getStringData("User_names_password", 6, 0));
        homepagePage.inputPassword(excelReader.getStringData("User_names_password", 1, 1));
        homepagePage.loginButtonKlick();

        Assert.assertTrue(productsPage.getHamburgerMenu().isDisplayed());
        Assert.assertTrue(productsPage.getBackpackAddToCartButton().isDisplayed());
        Thread.sleep(3000);

        productsPage.getHamburgerMenu().click();
        productsPage.getLogoutButton().click();
        driver.quit();
    }


}
