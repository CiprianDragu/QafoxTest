import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AddToCartPage;
import pages.HomePage;
import pages.LaptopPage;
import pages.LoginPage;

public class AddToCartTest {
    @Test
    public void ShoppingCart() {
        WebDriver driver = new ChromeDriver();
        driver.get(Constants.URL);
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.clickMyAccountButton();
        homePage.clickLoginButton();
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUserName();
        loginPage.inputPassword();
        loginPage.clickSubmitButton();
        AddToCartPage addToCartPage = new AddToCartPage(driver);
        addToCartPage.clickLaptopsAndNotebooks();
        addToCartPage.clickShowAllLaptopsAndNotebooks();
        addToCartPage.clickLaptop();
        LaptopPage laptopPage = new LaptopPage(driver);
        laptopPage.changeQuantity();
        laptopPage.changeCalendar();
        laptopPage.clickAddToCartButton();
        Assert.assertTrue(laptopPage.getSuccessMessage().contains("Success"));

    }
}
