package pages;

import data.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputUserName() {
        driver.findElement(By.cssSelector("#input-email")).sendKeys(Constants.EMAIL);
    }

    public void inputPassword() {
        driver.findElement(By.cssSelector("#input-password")).
                sendKeys(Constants.PASS);
    }

    public void clickSubmitButton() {
        driver.findElement(By.xpath("//input[@type='submit']")).click();
    }
}
