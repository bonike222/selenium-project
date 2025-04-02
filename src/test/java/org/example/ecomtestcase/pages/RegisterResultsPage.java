package org.example.ecomtestcase.pages;

import org.example.ecomtestcase.base.BasePage;
import org.openqa.selenium.WebDriver;

public class RegisterResultsPage extends BasePage {
    public RegisterResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAccountCreated() throws InterruptedException {
        boolean result = driver.getPageSource().contains("Your Account Has Been Created!");
        Thread.sleep(2000);
        return result;
    }
}