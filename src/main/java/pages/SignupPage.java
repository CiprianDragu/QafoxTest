package pages;

import data.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage {
    WebDriver driver;

    public SignupPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputAllCredentials() {
        driver.findElement(By.cssSelector("#input-firstname")).sendKeys(Constants.FIRST_NAME);
        driver.findElement(By.cssSelector("#input-lastname")).sendKeys(Constants.LAST_NAME);
        driver.findElement(By.cssSelector("#input-email")).sendKeys(Constants.EMAIL);
        driver.findElement(By.cssSelector("#input-telephone")).sendKeys(Constants.PHONE);
        driver.findElement(By.cssSelector("#input-password")).sendKeys(Constants.PASS);
        driver.findElement(By.cssSelector("#input-confirm")).sendKeys(Constants.PASS);
    }

    public void clickAgreeButton() {
        driver.findElement(By.xpath("//input[@name='agree']")).click();

    }

    public void clickContinueButton() {
        driver.findElement(By.xpath("//input[@value='Continue']")).click();

    }
}
