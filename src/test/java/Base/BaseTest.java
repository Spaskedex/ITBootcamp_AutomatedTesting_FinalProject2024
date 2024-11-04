package Base;

import Pages.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    public WebDriver driver;

    public HomepagePage homepagePage;

    public ProductsPage productsPage;

    public CartPage cartPage;

    public CheckoutPage checkoutPage;

    public CheckoutOverviewPage checkoutOverviewPage;

    public CheckoutCompletePage checkoutCompletePage;

    public ExcelReader excelReader;


    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        homepagePage = new HomepagePage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutCompletePage = new CheckoutCompletePage(driver);
        excelReader = new ExcelReader("saucedemo_com_users.xlsx");


    }
}
