import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest {
    @Test
    public void loginInToWebSite() {
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
    }
}
