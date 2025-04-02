package org.example.ecomtestcase.pages;

import org.example.ecomtestcase.base.BasePage;
import org.example.ecomtestcase.locators.MainPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
// Actions import
import org.openqa.selenium.interactions.Actions;
import java.time.Duration;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void clickAccountOptions() throws InterruptedException {
        // wait for first element presence
        new WebDriverWait(driver, Duration.ofSeconds(2)).until(
                ExpectedConditions.presenceOfElementLocated(MainPageLocators.ACCOUNT_OPTIONS)
        );

        // account options
        WebElement element = driver.findElement(MainPageLocators.ACCOUNT_OPTIONS);
        element.click();

        // wait for first element presence
        new WebDriverWait(driver, Duration.ofSeconds(2)).until(
                ExpectedConditions.presenceOfElementLocated(MainPageLocators.REGISTER)
        );

        // register
        element = driver.findElement(MainPageLocators.REGISTER);
        // Actions mouseover
        Actions action = new Actions(driver);
        Thread.sleep(2000);
        action.moveToElement(element).perform();
        Thread.sleep(2000);
        element.click();
    }
}