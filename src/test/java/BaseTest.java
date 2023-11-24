import data.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class BaseTest {
    public void GoToWebsiteTest(){
        WebDriver driver = new ChromeDriver();
        driver.get(Constants.URL);
        driver.manage().window().maximize();
    }
}
