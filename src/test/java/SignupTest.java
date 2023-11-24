import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignupPage;

public class SignupTest {
    @Test
    public void inputCredentials() {
        WebDriver driver = new ChromeDriver();
        driver.get(Constants.URL);
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.clickMyAccountButton();
        homePage.clickRegisterButton();
        SignupPage signupPage = new SignupPage(driver);
        signupPage.inputAllCredentials();
        signupPage.clickAgreeButton();
        signupPage.clickContinueButton();


    }
}


