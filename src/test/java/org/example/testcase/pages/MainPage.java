package org.example.testcase.pages;

import org.example.testcase.base.BasePage;
import org.example.testcase.locators.MainPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.Keys;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public void inputTextBox() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(
                ExpectedConditions.presenceOfElementLocated(MainPageLocators.TEXT_BOX)
        );

        WebElement element = driver.findElement(MainPageLocators.TEXT_BOX);
        element.sendKeys("junittest" + Keys.ENTER);
    }

    public void clickGoButton() {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(
                ExpectedConditions.presenceOfElementLocated(MainPageLocators.GO_BUTTON)
        );

        WebElement element = driver.findElement(MainPageLocators.GO_BUTTON);
        element.click();
    }
}
