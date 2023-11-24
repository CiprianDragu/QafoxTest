package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Util;

public class LaptopPage {
    WebDriver driver;

    public LaptopPage(WebDriver driver) {
        this.driver = driver;
    }

    public void changeQuantity() {
        Util.scrollToElement(driver.findElement(By.cssSelector("#input-quantity")), driver);
        driver.findElement(By.cssSelector("#input-quantity")).clear();
        driver.findElement(By.cssSelector("#input-quantity")).sendKeys("2");
    }

    public void changeCalendar() {
        driver.findElement(By.cssSelector(".fa.fa-calendar")).click();
        driver.findElement(By.xpath("(//th[@class='picker-switch'])[1]")).click();
        Util.waitInSeconds(1);
        driver.findElement(By.xpath("(//th[@class='picker-switch'])[2]")).click();
        Util.waitInSeconds(1);
        driver.findElement(By.xpath("(//th[@class='next'])[3]")).click();
        Util.waitInSeconds(1);
        driver.findElement(By.xpath("//span[contains(text(),'2023')]")).click();
        Util.waitInSeconds(1);
        driver.findElement(By.xpath("//span[contains(text(),'Dec')]")).click();
        Util.waitInSeconds(1);
        driver.findElement(By.xpath("//td[contains(text(),'13')]")).click();
    }

    public void clickAddToCartButton() {
        driver.findElement(By.cssSelector("button[id='button-cart']")).click();
    }

    public String getSuccessMessage() {
        Util.waitInSeconds(1);
        return driver.findElement(By.cssSelector(".alert-success")).getText();
    }
}
