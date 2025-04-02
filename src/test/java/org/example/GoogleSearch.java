package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.Keys;

public class GoogleSearch {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(
                ExpectedConditions.presenceOfElementLocated(By.className("gLFyf"))
        );

        WebElement inputElement = driver.findElement(By.className("gLFyf"));
        inputElement.sendKeys("Selenium" + Keys.ENTER);

        new WebDriverWait(driver, Duration.ofSeconds(5)).until(
                ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Selenium"))
        );

        WebElement link = driver.findElement(By.partialLinkText("Selenium"));
        link.click();

        Thread.sleep(10000);
        driver.quit();
    }
}
