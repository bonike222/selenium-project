package org.example.ecomtestcase.pages;

import org.example.ecomtestcase.base.BasePage;
import org.example.ecomtestcase.locators.RegisterPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RegisterPage extends BasePage {
    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void inputAccountInformation() throws InterruptedException {
        // wait for first element presence
        new WebDriverWait(driver, Duration.ofSeconds(2)).until(
                ExpectedConditions.presenceOfElementLocated(RegisterPageLocators.FIRST_NAME)
        );

        // first name
        WebElement element = driver.findElement(RegisterPageLocators.FIRST_NAME);
        element.click();
        Thread.sleep(1000);
        element.sendKeys("test_first_name");
        Thread.sleep(1000);

        // last name
        element = driver.findElement(RegisterPageLocators.LAST_NAME);
        element.click();
        Thread.sleep(1000);
        element.sendKeys("test_last_name");
        Thread.sleep(1000);

        // email
        element = driver.findElement(RegisterPageLocators.EMAIL);
        element.click();
        Thread.sleep(1000);
        element.sendKeys("test@unittest202501062024.com");
        Thread.sleep(1000);

        // telephone
        element = driver.findElement(RegisterPageLocators.TELEPHONE);
        element.click();
        Thread.sleep(1000);
        element.sendKeys("012345678901234567890123456789012");
        Thread.sleep(1000);

        // password
        element = driver.findElement(RegisterPageLocators.PASSWORD);
        element.click();
        Thread.sleep(1000);
        element.sendKeys("P@ssw0rd");
        Thread.sleep(1000);

        // password confirm
        element = driver.findElement(RegisterPageLocators.PASSWORD_CONFIRM);
        element.click();
        Thread.sleep(1000);
        element.sendKeys("P@ssw0rd");
        Thread.sleep(1000);

        // newsletter
        element = driver.findElement(RegisterPageLocators.NEWSLETTER);
        element.click();
        Thread.sleep(1000);

        // privacy policy
        element = driver.findElement(RegisterPageLocators.PRIVACY_POLICY);
        element.click();
        Thread.sleep(1000);

        // click on the continue button
        element = driver.findElement(RegisterPageLocators.CONTINUE_BUTTON);
        element.click();
        Thread.sleep(2000);
    }

    public boolean isInputError() throws InterruptedException {
        boolean result = driver.getPageSource().contains("Telephone must be between 3 and 32 characters!");
        Thread.sleep(2000);
        return result;
    }

    public void reinputAccountInformation() throws InterruptedException {
        // telephone
        WebElement element = driver.findElement(RegisterPageLocators.TELEPHONE);
        element.clear();
        Thread.sleep(1000);
        element.sendKeys("012345678");
        Thread.sleep(1000);

        // click on the continue button
        element = driver.findElement(RegisterPageLocators.CONTINUE_BUTTON);
        element.click();
        Thread.sleep(2000);
    }
}