package Tests;

import Base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EndToEndTest_Standard_User extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @Test
    public void endToEndTest() throws InterruptedException {

        String standardUser = excelReader.getStringData("User_names_password", 1, 0);
        String password = excelReader.getStringData("User_names_password", 1, 1);

        homepagePage.inputUserName(standardUser);
        homepagePage.inputPassword(password);
        homepagePage.loginButtonKlick();

        Assert.assertTrue(productsPage.getHamburgerMenu().isDisplayed());
        Assert.assertTrue(productsPage.getBackpackAddToCartButton().isDisplayed());

        productsPage.getBackpackAddToCartButton().click();
        productsPage.getCartButton().click();

        Assert.assertTrue(cartPage.getProductIsInCart().isDisplayed());
        Assert.assertTrue(cartPage.getRemoveBackpackFromCartButton().isDisplayed());
        Assert.assertTrue(cartPage.getCheckoutButton().isDisplayed());

        cartPage.clickRemoveBackpackFromCartButton();

        boolean isDisplayed = false;
        try {
            isDisplayed = cartPage.getProductIsInCart().isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }
        Assert.assertFalse(isDisplayed);

        cartPage.clickContinueShoppingButton();

        Thread.sleep(1000);

        productsPage.clickBackpackAddToCartButton();
        productsPage.clickBikeLightAddToCartButton();
        productsPage.clickBoltTShirtAddToCartButton();
        productsPage.clickFleeceJacketAddToCartButton();
        productsPage.clickOnesieAddToCartButton();
        productsPage.clicktShirtRedAddToCartButton();

        Thread.sleep(1000);

        productsPage.clickCartButton();

        Thread.sleep(2000);

        Assert.assertTrue(cartPage.getRemoveBackpackFromCartButton().isDisplayed());
        Assert.assertTrue(cartPage.getRemoveBikeLightFromCartButton().isDisplayed());
        Assert.assertTrue(cartPage.getRemoveBoltTShirtFromCartButton().isDisplayed());
        Assert.assertTrue(cartPage.getRemoveFleeceJacketFromCartButton().isDisplayed());
        Assert.assertTrue(cartPage.getRemoveOnesieFromCartButton().isDisplayed());
        Assert.assertTrue(cartPage.getRemoveTShirtRedFromCartButton().isDisplayed());

        Thread.sleep(2000);

        cartPage.clickCheckoutButton();
        checkoutPage.inputFirstName(excelReader.getStringData("User_names_password", 1, 2));
        checkoutPage.inputLastName(excelReader.getStringData("User_names_password", 1, 3));
        checkoutPage.inputPostalCodeField(excelReader.getStringData("User_names_password", 1, 4));

        Thread.sleep(2000);
        checkoutPage.clickContinueButton();

        Thread.sleep(2000);

        Assert.assertTrue(checkoutOverviewPage.getBackpackLink().isDisplayed());
        Assert.assertTrue(checkoutOverviewPage.getBikeLightLink().isDisplayed());
        Assert.assertTrue(checkoutOverviewPage.getBoltTShirtLink().isDisplayed());
        Assert.assertTrue(checkoutOverviewPage.getFleeceJacketLink().isDisplayed());
        Assert.assertTrue(checkoutOverviewPage.getOnesieLink().isDisplayed());
        Assert.assertTrue(checkoutOverviewPage.gettShirtRedLink().isDisplayed());

        Thread.sleep(2000);

        checkoutOverviewPage.clickFinishButton();

        Assert.assertTrue(checkoutCompletePage.getCheckoutCompleteMessage().isDisplayed());

        checkoutCompletePage.clickBackHomeButton();

        productsPage.clickCartButton();

        try {
            isDisplayed = cartPage.getProductIsInCart().isDisplayed();
        } catch (Exception e) {
            System.out.println(e);
        }
        Assert.assertFalse(isDisplayed);

        cartPage.clickContinueShoppingButton();

        Thread.sleep(2000);

        productsPage.clickHamburgerMenu();
        productsPage.clickLogoutButton();

        Assert.assertTrue(homepagePage.getUserNameField().isDisplayed());
        Assert.assertTrue(homepagePage.getPasswordField().isDisplayed());
        Assert.assertTrue(homepagePage.getLoginButton().isDisplayed());

        Thread.sleep(2000);

    }

    @AfterMethod
    public void quitBrowser() {
        driver.quit();
    }
}
