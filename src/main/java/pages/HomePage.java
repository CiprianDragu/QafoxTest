package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMyAccountButton() {
        driver.findElement(By.cssSelector(".fa.fa-user")).click();
    }

    public void clickRegisterButton() {
        driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
    }

    public void clickLoginButton() {
        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
    }
}