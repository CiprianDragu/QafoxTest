package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Util;

public class AddToCartPage {
    WebDriver driver;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLaptopsAndNotebooks() {
        driver.findElement(By.xpath
                ("(//a[contains(text(),'Laptops & Notebooks')])[1]")).click();
    }

    public void clickShowAllLaptopsAndNotebooks() {
        driver.findElement
                (By.xpath("//a[contains(text(),'Show AllLaptops & Notebooks')]")).click();
    }

    public void clickLaptop() {
        Util.waitInSeconds(2);
        Util.scrollToElement(driver.findElement(By.cssSelector(".image img[alt='HP LP3065']")), driver);
        driver.findElement(By.cssSelector(".image img[alt='HP LP3065']")).click();
    }
}
